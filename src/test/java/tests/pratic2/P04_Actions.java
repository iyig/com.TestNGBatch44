package tests.pratic2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class P04_Actions extends TestBase {

@Test
    public void name(){

    driver.get("http://spicejet.com/");
    WebElement aboutUs= driver.findElement(By.xpath("//*[.='About Us']"));
    Actions actions=new Actions(driver);
    actions.moveToElement(aboutUs).perform();
     driver.findElement(By.xpath("//*[text()='Fleet']")).click();
}

}
