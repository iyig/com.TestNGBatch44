package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Q10 extends TestBase {

//Siteyi açınız. http://opencart.abstracta.us/index.php?route=account/login
    //login yapınız email: batch44@gmail.com    password:123456789
    //search fonksiyonun kullanarak
    //mac,ipod ve samsung icin Dataprovider ile yapınız

    @Test(dataProvider = "getData")
    void aramaFonksiyon(String txt){
        driver.get("http://opencart.abstracta.us/index.php?route=account/login");
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("batch44@gmail.com");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        WebElement searchArea=driver.findElement(By.xpath("//input[@name='search']"));
        searchArea.sendKeys(txt);
        driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
    }
@DataProvider
    public Object[][]getData(){
        String data [][]={{"mac"},{"ipod"},{"samsung"}};
        return data;
}
}
