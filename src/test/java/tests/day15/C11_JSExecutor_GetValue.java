package tests.day15;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C11_JSExecutor_GetValue extends TestBase {

//     1)getValueTest metotu olustur
//     2) https://www.priceline.com/ a git
//     3) Tarih kısmındaki yazılı metinleri al ve yazdır
    @Test
    public void getValueTest(){
        driver.get("https://www.priceline.com/");
        getValueByJS("hotelDates");
    }
/*

 1:Javacrcript Executor nedir?
    a)Seleniumdan gelen ve javascript kodlarını calıştırmaya yarayan bir interface dir.NOrmal Selenium metotları yeterli olmadığı
    durumlarda kullanilabilir
 2.Ne zman ve nasıl kullandın?
     a)Normal Selenium metotları yeterli olmadığı durumlarda kullanilabilirOrneğin bazı buttonlara tıklamada problem olabiliryor,yaada
     belirli bir web elementin görünür olacağı şekilde sayfanın kaydırma işlemi yada input kutularındaki degerleri almak için
     kullanilabilir
 3.Sayfayi asağı veya yukarı kaydırma işlemi Seleniumda nasıl yappılır?
     a)Seleniumdaki Actions yada javascript executor metotları ile kaydırma işlemleri yapılabilir
     Orneğin actionslarda page_up,page_down,arrow_up,arrow_down metotları ile yada js ezecutordaki scrollintoview(true)
     ile yapılabilir.Ben olusturduğum reusable metotlarını kullanarak bu işlemlileri kolaylıkla yapabilirim
 4.Bir kutucukdaki (input) elemanın metni nasıl alınabilir?
      a)Javascript executor ile alabiliriz .cünkü js executor ile attribue degerleini alma imkanımız var
      getText() metotu bu durumlarda çalışmaz
 5.Selenium da click yaparken problem yaşadığın oldu mu?
     a) Bazen yanlış locator,yada bekleme(wait) problemi gibi durumlarda problem yaşadım.Bazen gizli(hidden) element-
     lere tıklarken de problem yaşadım.Bu durumlarda javascript executor kullandım ve problem cözdüm
 6.Selenium otomasyonunda ne tur problemler yaşadın?
      a)Teknik Problemler: Yanlış locator,bekleme(wait) alert
      iframe,pop-up şeklindeki reklam bildirimleri ,multiple window ,hidden elementlere tıklama
      b) Takımla ilgili Problemler:(Cok gündeme getrilmeme).Developer bazen bulduğum bunları kabul etmiyordu
      Çözüm takımla beraber degerlendirip fikir birliğine variyorduk
 */

}
