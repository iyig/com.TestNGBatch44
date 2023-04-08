package tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q4 {
    /*

    Navigate to  https://www.sucedemo.com/
    Enter the user name as standard_user
    Enter the password as secret_souce
    click on login button
    T1 choose price low to high
    T2: Verify item prices are sorted from low to high with soft Assert

     */
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

@Test
    public void sauceDemoTest1() throws InterruptedException {
    driver.get("https://www.saucedemo.com/");
driver.findElement(By.id("user-name")).sendKeys("standard_user");
    driver.findElement(By.id("password")).sendKeys("secret_sauce");

    driver.findElement(By.id("login-button")).click();
Thread.sleep(1000);
    WebElement dd= driver.findElement(By.className("product_sort_container"));
    Select select=new Select(dd);
    Thread.sleep(1000);
    select.selectByVisibleText("Price (low to high)");
    String expected= "PRICE (LOW TO HIGH)";
    String actual= driver.findElement(By.className("active_option")).getText();
    SoftAssert softAssert=new SoftAssert();
    softAssert.assertEquals(actual,expected,"Fiyatlar istenildiği gibi siralanmamıştır");
    softAssert.assertAll();
}
@Test
    public void sauceDemoTest2() throws InterruptedException {
    driver.get("https://www.sucedemo.com/");
    driver.findElement(By.id("user-name")).sendKeys("standard_user");
    driver.findElement(By.id("password")).sendKeys("secret_sauce");

    driver.findElement(By.id("login-button")).click();
    Thread.sleep(1000);
    WebElement dd= driver.findElement(By.className("product_sort_container"));
    Select select=new Select(dd);
    Thread.sleep(1000);

    select.selectByIndex(2);

    List<WebElement> fiyatlar= driver.findElements(By.className("inventory_item_price"));
    ArrayList<Double> fiyatlarDouble=new ArrayList<>();
    for (WebElement fiyat:fiyatlar
         ) {
        String fiyatStr=fiyat.getText().replaceAll("$","");
        fiyatlarDouble.add(Double.parseDouble(fiyatStr));
    }
ArrayList<Double>kontrolList= new ArrayList<>(fiyatlarDouble);
    Collections.sort(kontrolList);

    Assert.assertEquals(kontrolList,fiyatlarDouble);
}

}
