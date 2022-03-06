package tests.day08;

import org.testng.annotations.Test;

public class C01_Notaions {

@Test
    public void youtubeTesti(){  //priority atanmazsa priority 0 kabul eder
  System.out.println("Youtube testi calisti");
}
@Test(priority = 8)
    public void  amazonTesti(){
    System.out.println("amazon testi calisti");
}


@Test (priority = 5)
public void bestbuyTesti(){
    System.out.println("Bestbuy testi calisti");
}
}
