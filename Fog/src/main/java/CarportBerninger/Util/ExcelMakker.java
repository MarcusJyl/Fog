package CarportBerninger.Util;

import CarportBerninger.Carport;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

    public void makeCarport() throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Contacts");

        sheet.setColumnWidth(1, 255*20);

        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 20);

        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);


        Row headerRow = sheet.createRow(0);
        Cell cell = headerRow.createCell(0);
        cell.setCellValue("Hey!!!!");
        cell.setCellStyle(headerCellStyle);

        Row row = sheet.createRow(1);
        row.createCell(0).setCellValue("hej");


        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("contacts.xlsx");
        workbook.write(fileOut);
        fileOut.close();
    }

}
