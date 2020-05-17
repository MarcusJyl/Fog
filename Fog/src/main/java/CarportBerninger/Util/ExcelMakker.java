package CarportBerninger.Util;

import CarportBerninger.Carport;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import CarportBerninger.Materials.Wood.Taglægte;
import CarportBerninger.Util.Email.SendMail;
import DBAccess.MaterialsListFunc;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelMakker {

    private Carport carport;

    public ExcelMakker(Carport carport) {
        this.carport = carport;
    }

    public void makeCarport() throws Exception {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Contacts");

        sheet.setColumnWidth(0, 255 * 24);
        sheet.setColumnWidth(1, 255 * 10);
        sheet.setColumnWidth(2, 255 * 24);

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

        Cell BrugsText = headerRow.createCell(2);
        BrugsText.setCellValue("Brugs text");
        BrugsText.setCellStyle(headerCellStyle);

        Cell varenummer = headerRow.createCell(3);
        varenummer.setCellValue("Varenummer");
        varenummer.setCellStyle(headerCellStyle);

        Cell pris = headerRow.createCell(4);
        pris.setCellValue("Pris");
        pris.setCellStyle(headerCellStyle);


        int i = 1;
        for (Wood w : carport.getWoods()) {
            HashMap<Integer, Integer> woods = Match.wood(w);

            String send = "";

            for (Map.Entry entry : woods.entrySet()) {

                WoodFromDB wood = MaterialsListFunc.getAllWoodInfo((int) entry.getKey());
                if ((int) entry.getValue() != 0) {
                    Row row = sheet.createRow(i);


                    row.createCell(0).setCellValue(wood.getName());
                    row.createCell(1).setCellValue((int) entry.getValue());
                    row.createCell(2).setCellValue(MaterialsListFunc.getDescription(MaterialsListFunc.getAllWoodInfo((int) entry.getKey()).getProduktId()));
                    row.createCell(3).setCellValue((int) entry.getKey());
                    row.createCell(4).setCellValue(wood.getMeterpris());

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
                        row.createCell(2).setCellValue(MaterialsListFunc.getDescription(roof.getProduktId()));
                        row.createCell(3).setCellValue(in);
                        row.createCell(4).setCellValue(roof.getPris());
                        i++;
                    }
                }
            }
        }


        i++;
//        for (ItemsByNumber be : carport.getBeslag()) {
//            System.out.println(be.getVareNr());
//        }

        for (ItemsByNumber beslag1 : carport.getBeslag()) {
            if (beslag1.getVareNr() != null) {
                for (Integer in : beslag1.getVareNr()) {
                    if (in != 0) {
                        Row row = sheet.createRow(i);

                        RoofFromDB beslag = MaterialsListFunc.getBeslagFromDB(in);

                        row.createCell(0).setCellValue(beslag.getName());
                        row.createCell(1).setCellValue(beslag1.getAmount());
                        row.createCell(2).setCellValue(MaterialsListFunc.getDescription(beslag.getProduktId()));
                        row.createCell(3).setCellValue(in);
                        row.createCell(4).setCellValue(beslag.getPris());

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
        cell.setCellFormula("SUM(E2:E100000)");


        // Write the output to a file
        String fileName = carport.getHeigth() + "," + carport.getWidth() + "," + carport.getLength() + ".xlsx";
        FileOutputStream fileOut = new FileOutputStream(fileName);
        workbook.write(fileOut);
        fileOut.close();


        SendMail.send(fileName);
    }
}
