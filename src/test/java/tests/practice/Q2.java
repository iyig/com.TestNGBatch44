package tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Q2 {
/*
birrbirine  bağımlı testler olusturun
beforClass oluturp setup ayarlarını yapın
birbirine bağımlı testler olusturarak
ilk önce facebook a gidin
sonra facebook a bağımlı olarak google a gidin
daha sonra google a bağımlı olarlak amazon a gidin
 */
WebDriver driver;
@BeforeClass
    public void setUp(){
    WebDriverManager.chromedriver().setup();
    driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

}
@Test (dependsOnMethods = "googleTest")
    public void amazonTest(){
    driver.get("http://amazon.com");
}
    @Test(dependsOnMethods = "facebookTest")
    public void googleTest(){
        driver.get("http://google.com");
    }
    @Test
    public void facebookTest(){
        driver.get("http://facebook.com");
    }
@AfterClass
    public void tearDown(){
    driver.close();
}
}
