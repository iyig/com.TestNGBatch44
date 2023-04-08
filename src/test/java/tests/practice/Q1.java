package tests.practice;

import org.testng.annotations.Test;

public class Q1 {

@Test(priority = 3000)
    public void b(){
    System.out.println("b");

}
@Test (priority = 2001)
    public void a(){
    System.out.println("a");
}
@Test (priority = 2000)
    public void c(){
    System.out.println("c");
}
@Test
    public void test1(){
    System.out.println("Test1......");
}
    @Test
    public void test2(){
        System.out.println("Test2.....");
    }

    @Test
    public void test3(){
        System.out.println("Test3......");
    }
    @Test
    public void test4(){
        System.out.println("Test4......");
    }
    @Test(enabled = false)
    public void test5(){
        System.out.println("Test5......");
    }
    @Test(enabled = false)
    public void test6(){
        System.out.println("Test6......");
    }
}
