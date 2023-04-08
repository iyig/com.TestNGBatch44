package tests.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C09_StaleElementReferenceException extends TestBase {
    /*
      Stale Element=esli kullanılamaz durumda kullanım artık elverişli değil
      Sayfayı yenilediğizde (refresh()
      sayfada ileri geri gittimizde
      çÖZÜM
      Elementi tekrar bulmak
       */
@Test
    public void staleElementTest(){
  driver.get("https://www.techproeducation.com");

  //LMS LOGiN linkine tikla ve o sayfanın URL inin lms icerdiğini test et
    WebElement lmsLoginLink=driver.findElement(By.linkText("LMS LOGIN"));
    lmsLoginLink.click();
    Assert.assertTrue(driver.getCurrentUrl().contains("lms"));
    //Tekrar ana sayfay gel ve LMS LOGİN sayfasına  tekrar tıkla
waitFor(3);
    driver.navigate().back();//tekrar sayfaya gittik
    waitFor(3);

    lmsLoginLink.click();// LMS e git

/*
lmsLoginLink linkini sayfa yenilendikden (back()) sonra kullandığım için StaleElementReferenceException aldım.
 */

}
@Test
    public void staleElementReferenceExceptionTest2(){
    driver.get("https://www.techproeducation.com");
    waitFor(5);
    WebElement lmsLoginLink=driver.findElement(By.linkText("LMS LOGIN"));
   waitFor(5);
   driver.navigate().refresh();
   waitFor(5);

   //SAYFA YENİLENMEDEN ÖNCE BULDUGUM ELEMNENTİ SAYFA YENİLENDİKDEN SORNA KULLANMAK İSTEDİM
    lmsLoginLink.click();
    //Çözüm Eski(slate Element) Elementi Tekrar Locate et
   // driver.findElement(By.linkText("LMS LOGIN"));
}



}
