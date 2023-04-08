package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.TestBase;
/*
@DataProvider bir TestNG annotation'idri.Dolaysıyla sadece TestNG ile kullanilr
Veri sağlamak için kullanilır.DDT(Data Driven TEst) yapılır
Cucumbe'daki Scnerio Outline ile ayni işleve sahibtir
 */
public class Q9 extends TestBase {

  @Test(dataProvider = "urunler")
  public void amazonTest(String kelime){
      driver.get("http://amazon.com");
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys(kelime + Keys.ENTER);
  }

@DataProvider(name="urunler")
    public Object[][]  geturunler(){
      Object[][] urunler={{"araba"}, {"ev"},{"anahtarlik"}, {"ayakkabi"},{"gömlek"}};
      return urunler;
}

//https://www.gittigidiyor.com/ adresine gidiniz
    // java,javascript ve pyton
    @Test(dataProvider = "aranacakKelime")
    public void gittiGidiyorTest(String aranacakKelime){
      driver.get("https://www.gittigidiyor.com/");
      driver.findElement(By.xpath("//input[@name='k']")).sendKeys(aranacakKelime + Keys.ENTER);

    }
@DataProvider
    public static Object[][] aranacakKelime(){
      String data[][]={{"java"},{"javascript"},{"python"}};
      return data;
}
}
