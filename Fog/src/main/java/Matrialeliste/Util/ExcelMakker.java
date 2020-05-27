package Matrialeliste.Util;

import Matrialeliste.Carport;

import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import Matrialeliste.Util.Email.SendMail;
import DBAccess.MaterialsListFunc;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Denne klasse laver et excel ark
 */
public class ExcelMakker {

    private Carport carport;

    public ExcelMakker(Carport carport) {
        this.carport = carport;
    }

    public void makeCarport(String text, String Subject) throws Exception {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Contacts");

        sheet.setColumnWidth(0, 255 * 24);
        sheet.setColumnWidth(1, 255 * 10);
        sheet.setColumnWidth(2, 255 * 12);
        sheet.setColumnWidth(3, 255 * 27);
        sheet.setColumnWidth(4, 255 * 14);

        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 20);

        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);

        Row headerRow = sheet.createRow(0);

        Cell name = headerRow.createCell(0);
        name.setCellValue("Produkt");
        name.setCellStyle(headerCellStyle);

        Cell antal = headerRow.createCell(1);
        antal.setCellValue("Antal");
        antal.setCellStyle(headerCellStyle);

        Cell længde = headerRow.createCell(2);
        længde.setCellValue("Længde");
        længde.setCellStyle(headerCellStyle);

        Cell BrugsText = headerRow.createCell(3);
        BrugsText.setCellValue("Brugs text");
        BrugsText.setCellStyle(headerCellStyle);

        Cell varenummer = headerRow.createCell(4);
        varenummer.setCellValue("Varenummer");
        varenummer.setCellStyle(headerCellStyle);

        Cell pris = headerRow.createCell(5);
        pris.setCellValue("Pris");
        pris.setCellStyle(headerCellStyle);


        int i = 1;
        for (Wood w : carport.getWoods()) {
            HashMap<Integer, Integer> woods = Match.wood(w);
            System.out.println(w.getClass() + "  ;:  "+ w.getAmount().getAmount());
            System.out.println(woods);
            for (Map.Entry entry : woods.entrySet()) {

                WoodFromDB wood = MaterialsListFunc.getAllWoodInfo((int) entry.getKey());
                if ((int) entry.getValue() != 0) {
                    Row row = sheet.createRow(i);


                    row.createCell(0).setCellValue(wood.getName());
                    row.createCell(1).setCellValue((int) entry.getValue());
                    row.createCell(2).setCellValue(wood.getLængde());
                    row.createCell(3).setCellValue(MaterialsListFunc.getDescription(MaterialsListFunc.getAllWoodInfo((int) entry.getKey()).getProduktId()));
                    row.createCell(4).setCellValue((int) entry.getKey());
                    row.createCell(5).setCellValue(wood.getMeterpris() * w.getAmount().getAmount() * (w.getAmount().getLength() / 100));

                    i++;
                }
            }
        }

        i++;

        for (ItemsByNumber roof1 : carport.getRoof()) {
            if (roof1.getVareNr() != null) {
                for (Integer in : roof1.getVareNr()) {
                    if (in != 0) {
                        Row row = sheet.createRow(i);

                        RoofFromDB roof = MaterialsListFunc.getRoofFromDB(in);
                        row.createCell(0).setCellValue(roof.getName());
                        row.createCell(1).setCellValue(roof1.getAmount());
                        row.createCell(3).setCellValue(MaterialsListFunc.getDescription(roof.getProduktId()));
                        row.createCell(4).setCellValue(in);
                        row.createCell(5).setCellValue(roof.getPris());
                        i++;
                    }
                }
            }
        }


        i++;
        for (ItemsByNumber beslag1 : carport.getBeslag()) {
            for (Integer in : beslag1.getVareNr()) {
                if (in != 0) {
                    Row row = sheet.createRow(i);

                    RoofFromDB beslag = MaterialsListFunc.getBeslagFromDB(in);
                    if (beslag != null) {
                        row.createCell(0).setCellValue(beslag.getName());
                        row.createCell(1).setCellValue(beslag1.getAmount());
                        row.createCell(3).setCellValue(MaterialsListFunc.getDescription(beslag.getProduktId()));
                        row.createCell(4).setCellValue(in);
                        row.createCell(5).setCellValue(beslag.getPris());

                        i++;
                    }
                }
            }
        }

        Cell cell2Update = sheet.getRow(4).getCell(4);
        cell2Update.setCellValue(49);

        i++;
        Row row = sheet.createRow(i);
        Cell cell = row.createCell(2);
        cell.setCellFormula("SUM(F2:F100000)");
        row.createCell(1).setCellValue("Samlet pris:");


        // Write the output to a file
        String fileName = carport.getHeigth() + "," + carport.getWidth() + "," + carport.getLength() + ".xlsx";
        FileOutputStream fileOut = new FileOutputStream(fileName);
        workbook.write(fileOut);
        fileOut.close();


        SendMail.send(fileName, Subject, text);
    }
}
