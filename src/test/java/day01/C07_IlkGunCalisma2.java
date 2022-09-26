package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_IlkGunCalisma2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

         /*
    odev 2
1. Yeni bir class olusturun (TekrarTesti)
2.
Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
3. Sayfa URL’sinin “youtube” içerip içermediğini
(contains) doğrulayın, içermiyorsa doğru
URL’yi yazdırın.
4. Daha sonra
Amazon sayfasina gidin https://www.amazon.com/
5. Youtube sayfasina geri donun
6. Sayfayi yenileyin
7. Amazon sayfasina donun
8.
Sayfayi tamsayfa yapin
9. Ardından sayfa başlığının “Amazon” içerip içermediğini
(contains) doğrulayın, Yoksa
doğru başlığı(Actual Title) yazdırın.
10.Sayfa URL’sinin
https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
URL’yi yazdırın
11. Sayfayi kapatin
     */

//        1. Yeni bir class olusturun (TekrarTesti)
//        2.Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
//          (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
            driver.get("https://www.youtube.com");
            String actualTitle = driver.getTitle();
            String beklenenSonuc = "youtube";
            if(actualTitle.contains(beklenenSonuc)){
                System.out.println("Title testi PASSED");
            }else System.out.println("Title testi FAILED! Dogru Baslik : " + actualTitle);

//        3. Sayfa URL’sinin “youtube” içerip içermediğini
//        (contains) doğrulayın, içermiyorsa doğru
//        URL’yi yazdırın.
        Thread.sleep(3000);
        String actualUrl = driver.getCurrentUrl();
        String beklenenUrl ="youtube";
        if(actualUrl.contains(beklenenUrl)){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED! Dogru Url : " + actualUrl);
//        4. Daha sonra
//        Amazon sayfasina gidin https://www.amazon.com/
        Thread.sleep(3000);
        driver.get("https://www.amazon.com/");
//        5. Youtube sayfasina geri donun
        Thread.sleep(3000);
        driver.navigate().back();
//        6. Sayfayi yenileyin
        Thread.sleep(3000);
        driver.navigate().refresh();
//        7. Amazon sayfasina donun
        Thread.sleep(3000);
        driver.navigate().forward();
//        8.Sayfayi tamsayfa yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();
//        9. Ardından sayfa başlığının “Amazon” içerip içermediğini
//        (contains) doğrulayın, Yoksa
//        doğru başlığı(Actual Title) yazdırın.
        Thread.sleep(3000);
        String actualTitle1 = driver.getTitle();
        String arananSonuc = "Amazon";
        if(actualTitle1.contains(arananSonuc)){
            System.out.println("Title1 testi PASSED");
        }else System.out.println("Title1 testi false! Doğru baslik : " + actualTitle1);

//        10.Sayfa URL’sinin
//        https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
//        URL’yi yazdırın
        Thread.sleep(3000);
        String actualUrl1 = driver.getCurrentUrl();
        String arananUrl = "https://www.amazon.com/";
        if(actualUrl1.contains(arananUrl)){
            System.out.println("arananUrl testi PASSED");
        }else System.out.println("arananUrl testi FAILED! Dogru Url : " + actualUrl1);

//        11. Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();


    }
}
