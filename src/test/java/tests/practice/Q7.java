package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q7 extends TestBase {

//https://www.jqueryscript.net/demo/Easy-iFrame-Twitter-Emoji-Picker-Plugin-jQuere_Emoojis/
    //sayfayı maxime edin
    //ikinci emojiye tıklayın
    // tüm ikinci emoji ögelerini tıklayım
    // parent iframe geri dönün

    //apply button a basın


    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuere-Emoojis/");

WebElement iframe=driver.findElement(By.xpath("//iframe[@id='emoojis']"));
        driver.switchTo().frame(iframe);

        //ikinci emojiye tıklayınız
        WebElement secondEmoji= driver.findElement(By.xpath("(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]"));
    secondEmoji.click();

    //tüm ikinci emoji ögelerini tıklayınız
        List<WebElement> emojiOgeler=driver.findElements(By.xpath("//div[@id='nature']/div/img"));
        for (WebElement w: emojiOgeler) {
                w.click();

           //emojiOgeler.stream().forEach(x-> x.click());
                System.out.println("ogeler tiklandi");
            Thread.sleep(2000);
// parent iframe geri dön

            driver.switchTo().defaultContent();
//formu doldurun
      List<WebElement>metinGirList=driver.findElements(By.xpath("//input[@class='mdl-textfield__input"));//classlar aynı
List<String>metinler=new ArrayList<>(Arrays.asList("Bir", "frame", "sorusu", "bu","kadar","eglenceli","olabilir","sizce de", "oyle degil mi?", "",""));

            for (int i = 0; i < metinGirList.size() ; i++) {
metinGirList.get(i).sendKeys(metinler.get(i));

//apply button a basın
driver.findElement(By.xpath("//button[@='send']"));

            }

        }

    }

}
