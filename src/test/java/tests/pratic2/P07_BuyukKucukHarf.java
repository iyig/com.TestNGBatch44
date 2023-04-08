package tests.pratic2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

public class P07_BuyukKucukHarf extends TestBase {

    @Test
    public void Test01(){

        //google sayfasına gidelim
        driver.get("https://google.com");

        //Buyuk kücük harf olucak şekilde Hello Yazdıralım
        WebElement searchBox= driver.findElement(By.xpath("//*[@class='gLFyf']"));
        searchBox.sendKeys(Keys.SHIFT,"h",Keys.SHIFT,"e",Keys.SHIFT,"l",Keys.SHIFT,"o",Keys.SHIFT);
    }

}
