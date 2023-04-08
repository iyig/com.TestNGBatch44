package tests.pratic2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class P03_Actions extends TestBase {


    /*
http://uitespractice.com/Students/Actions

     */

    @Test
    public void test01() throws InterruptedException {

        driver.get("http://uitestpractice.com/Students/Actions");

        //Mavi kutu üzerinde 3 saniye  bekleyelim ve rengin değisitini görelim
          WebElement maviKutu= driver.findElement(By.xpath("//*[@id='div2']"));
         Actions actions=new Actions(driver);
          Thread.sleep(3000);
          actions.moveToElement(maviKutu).perform();

 //        Double Click Me! butununa tıklayalim ve cıkan mesahin "Double Clicked !!oldugunu doğrulayalım
           WebElement doubleClicked=driver.findElement(By.xpath("//*[@name='dblClick']"));
          actions.doubleClick(doubleClicked).perform();
          Assert.assertEquals("Double Clicked !!", driver.switchTo().alert().getText());
    //Accept ile alert'ü kapatalim
    driver.switchTo().alert().accept();
    // Drag and drop kutularını kullanın ve islemi yaptıktan sonra hedef kutuda "Dropped! yazıldığını doğrulayın
       WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement drop = driver.findElement(By.xpath("//*[@id='draggable']"));
        actions.dragAndDrop(drag,drop).perform();
        Assert.assertEquals((driver.findElement(By.xpath("//*[text()='Dropped!']")).getText()),"Dropped!");
    }
}