package tests;

import utils.ExcelUtils;

import java.io.IOException;

public class ExcelFileReaderTest {
    public static void main( String[] args) throws IOException {

        System.out.println(ExcelUtils.excelReader("user-data.xlsx"));

    }
}
