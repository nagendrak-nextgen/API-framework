package CoreJava;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;

public class readingExcelUsing_POI {
    public static void main(String[] args) throws IOException {
        readingExcelUsing_POI reup = new readingExcelUsing_POI();
        //reup.readexcel_uaingPOI();
        reup.writingexcel_uaingPOI();

    }

    public void readexcel_uaingPOI() throws IOException {
        //C:\Family\Nagendra\2024-06-19\Intellij Scripts\API\API_Framework_FromScratch\src\test\resources
        FileInputStream file_in = new FileInputStream("C:\\Family\\Nagendra\\2024-06-19\\Intellij Scripts\\API\\API_Framework_FromScratch\\src\\test\\resources\\testdata\\CreateAirlineData.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(file_in);
        XSSFSheet ws = wb.getSheet("Create_AirLine");

        // ************ Method 1 - Reading data using for loop ************

        // https://www.youtube.com/watch?v=ipjl49Hgsg8&list=PLUDwpEzHYYLsN1kpIjOyYW6j_GLgOyA07
        int rows = ws.getLastRowNum();
        int columns = ws.getRow(0).getLastCellNum();
        for (int i = 1;i<rows;i++)
        {
            XSSFRow row = ws.getRow(i);

            for (int j = 0;j<columns;j++)
            {
                XSSFCell cellvalue = row.getCell(j);

                switch (cellvalue.getCellType())
                {
                    case STRING -> {System.out.print(cellvalue.getStringCellValue()); break;}
                    case NUMERIC -> {System.out.print(cellvalue.getNumericCellValue()); break;}
                    case BOOLEAN -> {System.out.print(cellvalue.getBooleanCellValue()); break;}
                }
                System.out.print("|");

            }
            System.out.println();
        }

        // ************ Method 2 - Reading data using Iterator ************
        /*
        Iterator row = ws.iterator();
        while(row.hasNext())
        {
            XSSFRow rowdata = (XSSFRow) row.next();
            Iterator col = rowdata.iterator();
            while (col.hasNext())
            {
                XSSFCell celldata = (XSSFCell) col.next();

                switch (celldata.getCellType())
                {
                    case STRING -> {System.out.print(celldata.getStringCellValue()); break;}
                    case NUMERIC -> {System.out.print(celldata.getNumericCellValue()); break;}
                    case BOOLEAN -> {System.out.print(celldata.getBooleanCellValue()); break;}
                }
                System.out.print("|");
            }
            System.out.println();
        }
        */

        //wb2.write(file_out);
        //wb2.write(file_out);
        //file_out.close();


    }

    public void writingexcel_uaingPOI() throws IOException {
        //C:\Family\Nagendra\2024-06-19\Intellij Scripts\API\API_Framework_FromScratch\src\test\resources
        FileInputStream file_in = new FileInputStream("C:\\Family\\Nagendra\\2024-06-19\\Intellij Scripts\\API\\API_Framework_FromScratch\\src\\test\\resources\\testdata\\CreateAirlineData.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(file_in);
        XSSFSheet ws = wb.getSheet("Create_AirLine");
        XSSFSheet ws2 = wb.getSheet("New_Data");

        int rows = ws.getLastRowNum();
        int columns = ws.getRow(0).getLastCellNum();
        for (int i = 1;i<rows;i++)
        {
            XSSFRow row = ws.getRow(i);
            XSSFRow row2 = ws2.getRow(i);


            for (int j = 0;j<columns;j++)
            {
                XSSFCell cellvalue = row.getCell(j);
                //XSSFCell cellvalue2 = row2.getCell(j);

                switch (cellvalue.getCellType())
                {
                    case STRING ->
                    {
                        System.out.print(cellvalue.getStringCellValue());
                        cellvalue.setCellValue("SAM");
                        break;
                    }
                    case NUMERIC -> {System.out.print(cellvalue.getNumericCellValue());break;}
                    case BOOLEAN -> {System.out.print(cellvalue.getBooleanCellValue());break;}
                }

            }
        }

        wb.close();


    }
}
