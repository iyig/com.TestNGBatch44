package tests.day15;

import org.apache.commons.lang3.exception.ExceptionContext;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.time.Duration;

public class C07_TimeOutException extends TestBase {
/*
 TimeoutException Explicitwait kullanıldığı zaman ve element bulunamadığından alınır
 Explicit wait ve yanlış locator TimeoutException alınır
 Explicit wait ve süre yeterli değil ve locate doğru gene timeoutException
 Explicit wait vey doğru locater ve sure yeterli ve ifram var  timeoutException
 Çözüm
 Süreyi arttırmak
 Farklı explicit kullanmak wait visibilityofElementLocated yerine presenceof ElemntLocater yada javascript executer da ki waiter sayfa
  geçişlerinini beklemek için kullanabilirim
Frameworund hazir reusable methodlar var. Bu durumda timeoutexception aldığıjmda hızlıca o metotlar yardımıyla
problemi çözeriz
 */





@Test
    public void timeoutExceptionTest(){
    driver.get("https://www.techproeducation.com");

   //  Explit wait icin olusturduğumuz methodlarıdan birini kullanalım
   // Parametre 1:beklemek istediğm element,Parametre2: Max sure
  //waitForVisibility(By.xpath("//input[@type='searchh']")),15)
   // .sendKeys("QA" + Keys.ENTER);
WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));

wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Yanlıs ID")));



}

}
