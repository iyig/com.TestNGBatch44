package tests.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.time.Duration;

public class C08_FluentWait extends TestBase {

@Test
    public void fluentWaitTest(){

    //https://the-internet.herokuapp.com/dynamic_loading/1

  driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

  //Start buttonuna tıkla
driver.findElement(By.xpath("//div[@id='start']//button")).click();



            //Hello World!Yazının sitede olduğunu test edin
    //    1. Fluent Wait icin bir obje olustur
    Wait<WebDriver> wait=new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(30))// Max Bekleme süresi
            .pollingEvery(Duration.ofSeconds(3))//Deneme aralıkları
            .withMessage("IGNORE EXCEPTİON")// Mesaj yazdırabilirim.zorunlu değill
            .ignoring(NoSuchMethodException.class);// Exception I Handle Et.Zorunlu değil

    // wait objesini kullanarak bekleme problemini çoz

    WebElement helloWorldElement=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']//h4")));
    String helloWorldText= helloWorldElement.getText();
    Assert.assertEquals(helloWorldText,"Hello World!");

}

}
