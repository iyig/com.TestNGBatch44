package tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Q3 {

/*
go to url: https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree
Task1  find Dropdown on Multı Selection
Task2 Find Dropdown Elements on Page
Task3 printout Dropdown Elements number
Task4 choose all ddropdrown elements printout dropdown elements name
Task5 check untiil choise 6
 */

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get(" https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
    }
@Test
    public void testt(){
       // Task1  find Dropdown on Multı Selection
    driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
    //Task2 Find Dropdown Elements

    List<WebElement> dropList= driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
    //Task3 printout Dropdown Elements number

    System.out.println("dropListeki elementlerin sayisi:" + dropList.size());

    //Task4 choose all ddropdrown elements printout dropdown elements  name until choise 6
    for (int i = 0; i <dropList.size();  i++) {
String text= dropList.get(i).getText();
        System.out.println("text:" + text);


        if (!text.isEmpty()){

            dropList.get(i).click();
        }



        if (text.equals("choice 6")){
             dropList.get(i).click();
             break;
         }



    }
}

}