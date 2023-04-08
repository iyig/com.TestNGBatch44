package tests.pratic2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.Set;

public class P010_WindowHandles extends TestBase {




    //ilk ürüne tıklayın
    //baslığın 'oppo'icerdiğin tesst edin

    @Test
    public void test03() {

//https://www.n11.com adresine gidin
        driver.get("https://www.n11.com");
        String sayfa1Handle=driver.getWindowHandle();

              //arama moturuna 'oppa' yazıp aratın
        WebElement aramaMotoru= driver.findElement(By.xpath("//input[@id='searchData']"));
        aramaMotoru.sendKeys("oppo"+ Keys.ENTER);

 // ilk ürüne tıklayın
        driver.findElement(By.xpath("(//img[@class='lazy cardImage'])")).click();

       Set<String> windowHandleSeti=driver.getWindowHandles();
        String sayfa2Handle="";
        for (String each:windowHandleSeti) {

            if (!each.equals(sayfa1Handle)){
                 sayfa2Handle=each;
            }
        }
        
        driver.switchTo().window(sayfa2Handle);

 // baslığın 'oppo' icerdiğin test edin

 WebElement baslik=driver.findElement(By.xpath("//h1[@class='proName']"));
 String baslikStr=baslik.getText();
        Assert.assertTrue(baslikStr.contains("Oppo"));


        // ilk sayfaya dönün ve Title'nın yazdırın
        driver.switchTo().window(sayfa1Handle);
        System.out.println("İLK SAYFA TİTLE = " + driver.getTitle());

    }
}