package com.utils;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class UtilExcel {

    public static String SHEET_PATH= System.getProperty("user.dir")+"/src/test/java/com/resources/TestData.xlsx";
    static Workbook book;
    static Sheet sheet;

    public static Object[][] getTestDataFromExcel(String sheet_name){
        // Apache POI
        // Read the File - TestData.xlsX
        //  Workbook Create
        // Sheet
        // Row and Cell
        // 2D Object  - getData()

        FileInputStream fileInputStream =null;
        try{
            fileInputStream = new FileInputStream(sheet_name);
            book= WorkbookFactory.create(fileInputStream );
            sheet= book.getSheet(sheet_name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

       Object[][] data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

        for(int i=0;i<sheet.getLastRowNum();i++){
            for(int j=0;j<sheet.getRow(0).getLastCellNum(); j++){
                data[i][j]=sheet.getRow(i+1).getCell(j).toString();
            }
        }
        return data;
    }
}
