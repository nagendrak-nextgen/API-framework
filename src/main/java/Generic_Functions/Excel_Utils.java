package Generic_Functions;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class Excel_Utils {
    public static List<LinkedHashMap<String, String>> getExcelDataAsListOfMap(String excelFileName, String excelSheetName) throws IOException {
        List<LinkedHashMap<String, String>> dataFromExcel = new ArrayList<>();
        Workbook wb = WorkbookFactory.create(new File("src/test/resources/testdata/" + excelFileName + ".xlsx"));
        Sheet ws = wb.getSheet(excelSheetName);
        int rc = ws.getPhysicalNumberOfRows();
        LinkedHashMap<String, String> mapdata  = new LinkedHashMap<>();
        List<String> dataHeaders = new ArrayList<>();
        DataFormatter df = new DataFormatter();
        int cc;
        int i;
        for (i = 0; i < rc; i++) {
            if (i == 0) {
                cc = ws.getRow(i).getPhysicalNumberOfCells();
                for (int j = 0; j < cc; j++) {
                    dataHeaders.add(ws.getRow(0).getCell(j).getStringCellValue());
                }
            } else {
                cc = ws.getRow(i).getPhysicalNumberOfCells();
                for (int j = 0; j < cc; j++) {
                    String cellvalue = df.formatCellValue(ws.getRow(i).getCell(j));

                    mapdata.put(dataHeaders.get(j), cellvalue);
                }
                dataFromExcel.add(mapdata);
            }
        }
        return dataFromExcel;
    }

    public static List<Map> getdatafromexcel(String excelFileName, String excelSheetName) throws IOException {
        String fp = BaseClass.str_RootPath + "\\src\\test\\resources\\testdata\\" + excelFileName + ".xlsx";
        System.out.println("File Path - " + fp);
        Workbook wb = WorkbookFactory.create(new File(fp));
        Sheet ws = wb.getSheet(excelSheetName);
        int rc = ws.getPhysicalNumberOfRows();
        CellType ct;
        int cc = ws.getRow(0).getPhysicalNumberOfCells();
        List<String> arr_Headers = new ArrayList<>();
        List<Map> arr_testdata = new ArrayList<>();
        Map<String, Object> cellsdata;

        for (int i = 0; i< cc;i++)
        {
            arr_Headers.add(ws.getRow(0).getCell(i).getStringCellValue());
        }
        for (int i = 1; i< rc;i++)
        {
            cellsdata = new HashMap<>();
            for (int j = 0;j<cc;j++)
            {
                //cv = (String) ws.getRow(i).getCell(j).getStringCellValue();
                ct = ws.getRow(i).getCell(j).getCellType();
                //System.out.println(ct);
                switch (ct)
                {
                    case STRING:
                        //System.out.println(ws.getRow(i).getCell(j).getStringCellValue());
                        cellsdata.put(arr_Headers.get(j),ws.getRow(i).getCell(j).getStringCellValue());
                        break;
                    case NUMERIC:
                        //System.out.println(ws.getRow(i).getCell(j).getNumericCellValue());
                        cellsdata.put(arr_Headers.get(j),ws.getRow(i).getCell(j).getNumericCellValue());
                        break;
                    default:
                        System.out.println("Case Does not Matches");
                }

                //    System.out.println(cv);
            }
            arr_testdata.add(cellsdata);

        }

        return arr_testdata;
    }

}
