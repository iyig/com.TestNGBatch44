package tests.day15;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C010_JS_Executor_Type extends TestBase {
/*
type Tst metotu olustur
Techpro education ana sayfasina git
Arama kutusuna QA yaz
 */
   @Test
     public void typeTest(){
       // Techpro education ana sayfasına git
       driver.get("https://www.techproeducation.com");
       waitFor(3);
      //Arama kutusuna QA yaz
       typeWithJS(driver.findElement(By.xpath("//input[@type='search']")), "QA");
   }
}
