package tests.pratic2;

import org.testng.annotations.Test;
import utilities.TestBase;

import static utilities.TestBase.driver;

public class P01_BasicAut extends TestBase {

    @Test
    public void basic_auth() throws InterruptedException {

        //http://httpbin.org/basic-auth/foo/bar adresine gidiniz
        driver.get("http://httpbin.org/basic-auth/foo/bar");

  Thread.sleep(2000);
   //username : foo
   //password : bar
  driver.get("http://foo:bar@httpbin.org/basic-auth/foo/bar");

   //Yukardıkai verileri kullanarak güvenliği geçin

    }


}

