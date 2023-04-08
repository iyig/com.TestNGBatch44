package tests.pratic2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.Set;

public class P011_ActionMoveToElement extends TestBase {


    @Test
    public void test04() {


        //      htpps://amazon.com adresine git
        driver.get("https://amazon.com");
        String sayfa1Handle = driver.getWindowHandle();

        // sag ust bolümde bulanan dil secenek menüsünün acılmasi icin mouse'u bu menunun üstüne getirebilme
        Actions actions = new Actions(driver);
        WebElement dilMenu = driver.findElement(By.xpath("//div[text()='EN']"));
        actions.moveToElement(dilMenu).perform();
        //  Change country/region butonuna basiniz

        driver.findElement(By.xpath("(//div[@class='icp-mkt-change-lnk'])[1]")).click();

        //  United States dropdown'undan 'Türkey(Türkiye)' seciniz
        WebElement ddm = driver.findElement(By.xpath("//select[@id='icp-dropdown']"));
        Select select = new Select(ddm);
        select.selectByVisibleText("Turkey (Türkiye)");

// Drop down opsiyon listesi 'Go to Website ' butonuna basmanmiza engel odluğu icin
        //herhangi bir yere click yapıp drop down opsiyon listesinin toparlanmasını sagladık
        driver.findElement(By.xpath("//span[text()='Changing country/region website']")).click();


        //Go to website butonuna tıklayınız
        driver.findElement(By.xpath("//span[@id='icp-save-button']")).click();

        //acilan yeni sayfadanin Title'nin yazdırın Elektronik icerdiğini test ediniz

        Set<String> windowHandleSeti = driver.getWindowHandles();
        String sayfa2Handle = "";
        for (String each : windowHandleSeti) {

            if (!each.equals(sayfa1Handle)) {
                sayfa2Handle = each;
            }


        }
        driver.switchTo().window(sayfa2Handle);

        String ikinciSayfaTitle = driver.getTitle();
        System.out.println(ikinciSayfaTitle);
        Assert.assertTrue(ikinciSayfaTitle.contains("Elektronik"));

    }
}