package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.TestBase;

public class Q8 extends TestBase {
//Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    //Fill in capitales by country




    @Test
    public void test() throws InterruptedException {

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement oslo= driver.findElement(By.xpath("//div[@id='box1']"));
        WebElement stockholm= driver.findElement(By.xpath("//div[@)id='box2']"));
        WebElement washington= driver.findElement(By.xpath("//div[@)id='box3']"));
        WebElement copenhagen= driver.findElement(By.xpath("//div[@)id='box4']"));
        WebElement seaul= driver.findElement(By.xpath("//div[@)id='box5']"));
        WebElement rome= driver.findElement(By.xpath("//div[@)id='box6']"));
        WebElement madrid= driver.findElement(By.xpath("//div[@)id='box7']"));


        WebElement italy= driver.findElement(By.xpath("//div[@)id='box106']"));
        WebElement spain= driver.findElement(By.xpath("//div[@)id='box107']"));
        WebElement norway= driver.findElement(By.xpath("//div[@)id='box101']"));
        WebElement denmark= driver.findElement(By.xpath("//div[@)id='box104']"));
        WebElement korea= driver.findElement(By.xpath("//div[@)id='box105']"));
        WebElement sweden= driver.findElement(By.xpath("//div[@)id='box102']"));
        WebElement unitedState= driver.findElement(By.xpath("//div[@)id='box103']"));

Actions actions=new Actions(driver);
actions.dragAndDrop(oslo,norway).dragAndDrop(stockholm,sweden).dragAndDrop(washington,unitedState)
        .dragAndDrop(copenhagen,denmark).dragAndDrop(seaul,korea).dragAndDrop(madrid,spain).perform();

Thread.sleep(4000);
    }

}
