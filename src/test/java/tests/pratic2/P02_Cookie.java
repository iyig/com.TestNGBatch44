package tests.pratic2;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.Set;

public class P02_Cookie  extends TestBase {

// Techproeducation adresine gidiniz
 //Sayfadaki cookie lerin sayısını yazdırınız


@Test
    public void test01(){
    // Techproeducation adresine gidiniz
    driver.get("https://techproeducation.com");

    //Sayfadaki cookie lerin sayısını yazdırınız

    Set<Cookie> cookies=driver.manage().getCookies();
    System.out.println("Cookilerin Sayisi =" + cookies.size());
    //Sayfadaki cooke isim ve değerlerini yazdırınız
      for (Cookie c:cookies){
          System.out.println(c.getName()+":" +c.getValue());
      }
      //Yeni bir cookie ekleyiniz
Cookie myCookie =new Cookie("myCookie","123456789");
driver.manage().addCookie(myCookie);

    // Yeni cookie eklendikten sonra cooke sayisini ve isimlerini yazdırınız
    Set<Cookie> cookies2=driver.manage().getCookies();
    System.out.println("Cookilerin Sayisi=" +cookies2.size());
    for (Cookie w : cookies) {
        System.out.println(w.getName() + ":" + w.getValue());
    }
        //olusturdugümuz cookie' silelim
    driver.manage().deleteCookie(myCookie);

   // Tüm cookierleri silelim
   driver.manage().deleteAllCookies();
    Set<Cookie> cookies3=driver.manage().getCookies();
    System.out.println(cookies3.size());


}
}
