import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFHyperlink;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromExcel {
///constructor of class
   public ReadFromExcel (WebDriver d){}
    static public String readFirstName(WebDriver driver) throws IOException {
        File source  =  new File("src/main/resources/QAHeroKu.xlsx");
        // In order to read the above file we use fileInputStream class and create object of it
        FileInputStream input = new FileInputStream(source);
        //calling for particular work book
        XSSFWorkbook wb = new XSSFWorkbook(input);
        /// since data is written in first sheet so sheet number is one
        XSSFSheet sheet =        wb.getSheetAt(4);
        String s = sheet.getRow(6).getCell(0).getStringCellValue();
        return  s;
    }
    static public String readLastName(WebDriver driver) throws IOException {
        File source  =  new File("src/main/resources/QAHeroKu.xlsx");
        // In order to read the above file we use fileInputStream class and create object of it
        FileInputStream input = new FileInputStream(source);
        //calling for particular work book
        XSSFWorkbook wb = new XSSFWorkbook(input);
        /// since data is written in first sheet so sheet number is one
        XSSFSheet sheet =        wb.getSheetAt(4);
        String s = sheet.getRow(6).getCell(1).getStringCellValue();

        return  s;
    }

    static public double  readPassword (WebDriver driver) throws IOException {
        File source  =  new File("src/main/resources/QAHeroKu.xlsx");
        // In order to read the above file we use fileInputStream class and create object of it
        FileInputStream input = new FileInputStream(source);
        //calling for particular work book
        XSSFWorkbook wb = new XSSFWorkbook(input);
        /// since data is written in first sheet so sheet number is one
        XSSFSheet sheet =        wb.getSheetAt(0);
        double  d = sheet.getRow(4).getCell(1).getNumericCellValue();

        return  d;
    }

}
