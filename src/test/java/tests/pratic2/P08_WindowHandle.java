package tests.pratic2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import utilities.TestBase;

public class P08_WindowHandle extends TestBase {

/*
https://www.amazon.com sayfasın git
nutella icin arama yapın
yeni bir tabda ilk urunun resmine tıklay
yeni tabda acılan urunun başlığını yazdıırın
 */

@Test
    public void test01(){

    //https://www.amazon.com sayfasın git

    driver.get("https://www.amazon.com");
String sayfa1Handle=driver.getWindowHandle();
    //nutella icin arama yapın

    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("nutella" + Keys.ENTER);

    // yeni bir tab'da ilk urunun resminie tıklayınız

    driver.switchTo().newWindow(WindowType.TAB);
    driver.get("https://www.amazon.com");
    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("nutella" + Keys.ENTER);
  WebElement ilkurun= driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
    ilkurun.click();

    // yeni tabda acilan urunun başlığını yazdırın

    WebElement baslik= driver.findElement(By.xpath("//span[@id='productTitle']"));
    String baslikStr= baslik.getText();
    System.out.println("Başlik:" +baslikStr);

    // ilk sayfaya geçis url yazdırın
    driver.switchTo().window(sayfa1Handle);
    String ilkSayfaUrl=driver.getCurrentUrl();
    System.out.println(ilkSayfaUrl);
}




}
