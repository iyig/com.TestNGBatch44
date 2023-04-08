package tests.pratic2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class P013_FileDownLoad extends TestBase {


//  https://the-internet.herokuapp.com/download adresine gidiniz
    //some-file.txt dosyasini indirelim
    //dosyanın basarıyla indirilip indirilmediğini test edelim


    @Test
    public void test02() {
       // https://the-internet.herokuapp.com/download adresine gidiniz
        driver.get("https://the-internet.herokuapp.com/download");

        //some-file.txt dosyasini indirelim
        driver.findElement(By.xpath("//a[text()='some-file.txt']")).click();

        //dosyanın basarıyla indirilip indirilmediğini test edelim

       // C:\Users\Pc\Downloads\some-file.txt
        String dosyaYolu="C:\\Users\\Pc\\Downloads\\some-file.txt";
      //  Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

      //  "C:\"Users\PC                     \\Downloads\\some-file.txt";

        String farklıKısım=System.getProperty("user.home");
        String ortakKısım= "\\Downloads\\some-file.txt";
        String dosyaYolu2=farklıKısım+ortakKısım;

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu2)));
    }
}
