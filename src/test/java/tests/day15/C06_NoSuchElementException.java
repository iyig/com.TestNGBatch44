package tests.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C06_NoSuchElementException extends TestBase {
@Test
    public void noSuchElementTest(){
/*
NosuchElementException alınma nedeni Explicitwait kullanılmaması
 */
  driver.get("https://www.techproeducation.com");

  driver.findElement(By.xpath("//input[@type='searchh']"))//org.openqa.selenium.NoSuchElementEXception
          .sendKeys("QA" + Keys.ENTER);
}

}
