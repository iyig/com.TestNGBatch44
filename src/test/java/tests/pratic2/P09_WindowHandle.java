package tests.pratic2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class P09_WindowHandle extends TestBase {

@Test
    public void test02(){

    //https://www.amazon.com git
    driver.get("https://www.amazon.com ");
     String sayfa1handle=driver.getWindowHandle();
    // url'in amazon icerdiğini test edelim

    String amazonUrl=driver.getCurrentUrl();
    Assert.assertTrue(amazonUrl.contains("amazon"));

    //yeni bi pencere acıp https://www.bestbuy.com git

    driver.switchTo().newWindow(WindowType.WINDOW);
    driver.get("https://www.bestbuy.com");
  String sayfa2Handle=driver.getWindowHandle();

    //title'in Best Buy icerdiğin test edelim
    String bestBuyTitle=driver.getTitle();
    Assert.assertTrue(bestBuyTitle.contains("Best Buy"));

    //ilk sayfaya dönüp sayfa java aratalım
    driver.switchTo().window(sayfa1handle);
    WebElement amazonaramaMOt=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    amazonaramaMOt.sendKeys("Java"+ Keys.ENTER);

    // arama sonuclarının Java içerdiğini test edin
      WebElement aramaSonucu=  driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String aramaSonucStr=aramaSonucu.getText();
      Assert.assertTrue(aramaSonucStr.contains("Java"));

    // ikinci sayfaya bestbuy) döenlim

    driver.switchTo().window(sayfa2Handle);

    // logonun göründüpünü test edin
WebElement logo=driver.findElement(By.xpath("(//img[@class='logo'])[1]"));
Assert.assertTrue(logo.isDisplayed());


}

}
