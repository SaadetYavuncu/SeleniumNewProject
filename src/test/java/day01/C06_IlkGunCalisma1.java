package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_IlkGunCalisma1 {

    /*
    ödev 1
1.Yeni bir class olusturalim (Homework)
2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
4.https://www.walmart.com/sayfasina gidin.
5.Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
6.Tekrar “facebook” sayfasina donun
7.Sayfayi yenileyin
8.Sayfayi tam sayfa (maximize) yapin
9.Browser’i kapatin
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
;

//        1.Yeni bir class olusturalim (Homework)
//        2.ChromeDriver kullanarak, facebook sayfasina gidin ve
//        sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.

           driver.get("https://www.facebook.com/");
           Thread.sleep(3000);
           String actualTitle = driver.getTitle();
           String istenenKelime = "facebook";
           if(actualTitle.contains(istenenKelime)){
               System.out.println("başlık facebook içeriyor");
           }else System.out.println("doğru başlık :" + actualTitle);
//        3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
           Thread.sleep(3000);
           String actualUrl = driver.getCurrentUrl();
           String arananUrl = "facebook";
           if(actualUrl.equals(actualUrl)){
               System.out.println("Url facebook içeriyor");
           }else System.out.println("Url facebook içermiyor : " + actualUrl);
//        4.https://www.walmart.com/sayfasina gidin.
        Thread.sleep(3000);
        driver.get("https://www.walmart.com/");
//        5.Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        Thread.sleep(3000);
        String actualTitle1 = driver.getTitle();
        String arananBaslik = "Walmart.com";
        if(actualTitle1.equals(arananBaslik)){
            System.out.println("Baslik Walmart.com içeriyor");
        }else System.out.println("Baslik Walmart.com içermiyor : " + actualTitle1);
//        6.Tekrar “facebook” sayfasina donun
        Thread.sleep(3000);
        driver.navigate().back();
//        7.Sayfayi yenileyin
        Thread.sleep(3000);
        driver.navigate().refresh();
//        8.Sayfayi tam sayfa (maximize) yapin
       Thread.sleep(3000);
        driver.manage().window().maximize();
//        9.Browser’i kapatin
        Thread.sleep(3000);
        driver.close();


    }
}
