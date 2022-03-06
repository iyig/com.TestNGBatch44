package tests.day12;

import org.testng.annotations.Test;
import tests.day10.C01_Allerts;

public class C01_TestBaseKullanim {


    @Test

    public void test01(){
       // projeniz icerisindeki herhangi bir classdan obje olusturabilir ve
        // o obje sayesinde ailt olduğu classdaki tüm variable ve methodlara
        // (access modefier izin verdiği sürece) ulasabiilrim

        C01_Allerts obj=new C01_Allerts();
        // eger proje kapsamında bir classdan obje olusturulmasıni engellemek isterseniz
        // 1- o classın construktorini private yapabiliriz
        // 2- classın kendisini abstract yapbiliriz
        // 1. method cok tercih edilmez cünkü OOP consepte uymaz(cok sinirli sayıda kullanimi vardir)
        // 2.methodu kullanabiliriz,böylece o classdaki abstract olmayan (concrete)
        // methodları override etmek mecburiyeti olmadan kullanabiliriz

        // örnegin biz testBase class ini abstract yaptigimizdan obje olusturamayiz
        // ama child class'lardan TestrBase'deki setUp ve teardown method'larini kullanabiliriz
        // TestBase obj1=new TestBase();



    }

}
