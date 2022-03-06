package tests.day13;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C02_FileExists {


    @Test
    public void test01() {
        System.out.println(System.getProperty("user.home"));

        // Masaüstündeki Deneme klasörün Pathi istesem
        // "C:\Users\PC\Desktop\Deneme\selenium.xlsx
        // Yani dinamik olarak masustündeki Deneme klasörünü pathini yazmak istersem
        String path = System.getProperty("user.home") + "\\Desktop\\Deneme\\selenium.xlsx";


        System.out.println(Files.exists(Paths.get("dosyaYolu")));
        System.out.println(path);
        System.out.println("user.dir   : " + System.getProperty("user.dir"));
        // Masaustünde Denenme klasörü icerisne selenium.xlsx isminde bir dosya olduğunu test edin

        // 1- önce bu dosya ulaşmak icin gerekli dinamik path olusturalim

       String  dosyaYolu = System.getProperty("user.home") + "\\Desktop\\Deneme\\selenium.xlsx";

        // projemizde pom.xml oldugunu test edin
        // C:\Users\Pc\com.TestNGBatch44

        String pomPath = System.getProperty("user.dir") + "\\pom.xml";
        Assert.assertTrue(Files.exists(Paths.get(pomPath)));
    }
}