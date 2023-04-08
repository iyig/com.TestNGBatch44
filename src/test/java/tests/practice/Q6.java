package tests.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

public class Q6 extends TestBase {

    @Test
    public void alert1() {
        SoftAssert softAssert = new SoftAssert();

        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");

        // click Me of javascript Alerte tıklayın
        driver.findElement(By.id("button1")).click();

        // pop up text i alın

        String message = driver.switchTo().alert().getText();

        //Mesajın " I am an alert box!"
        String expMessage = "I am an alert box!";

        softAssert.assertTrue(message.equals(expMessage));
//pop up kabul edin

        driver.switchTo().alert().accept();

        softAssert.assertAll();
    }

@Test(dependsOnMethods = "alert1")

    public void alert2() throws InterruptedException {
SoftAssert softAssert=new SoftAssert();
        //click Me of Javascript Confirm box i
driver.findElement(By.xpath("//span[@id='button4']")).click();
   Thread.sleep(2000);

    //pop up text i alin
String message= driver.switchTo().alert().getText();

//Alert alert=driver.switchTo().alert();
    //Mesajın "Press a bottun" olduğunu doğrulayın
String expMessage= "Press a button!";
softAssert.assertTrue(message.equals(expMessage));

    //Açılır penccere kapat //pop up i iptal edin

//alert.dismiss();
    driver.switchTo().alert().dismiss();
Thread.sleep(2000);

    //"you pressed cannal!"görütülendiğini doğrulayın
softAssert.assertTrue(driver.findElement(By.xpath("//p[@id='confirm-alert-text']")).isDisplayed());

softAssert.assertAll();

        // alerte göre dpendsOnMethods kullanın
}
}





