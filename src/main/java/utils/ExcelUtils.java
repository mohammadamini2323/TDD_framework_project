package utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExcelUtils {
    public static List<List<String>> excelReader(String excelFileName) throws IOException  {
        List<List<String>> excelData = new ArrayList<>();
          FileInputStream fis= new FileInputStream(new File(Objects.requireNonNull(ExcelUtils.class.getClassLoader().getResource(excelFileName)).getFile()));

        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet=workbook.getSheetAt(0);
        for (Row row:sheet){
            List<String> rows=new ArrayList<>();
            for (Cell cell:row){
                rows.add(cell.toString());
            }
            excelData.add(rows);

        }

        workbook.close();
        fis.close();



        return excelData;
    }
}
