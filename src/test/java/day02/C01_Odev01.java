package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Odev01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       /* Amazon sayfasina gidelim. https://www.amazon.com/
        Sayfa basligini(title) yazdirin
        Sayfa basliginin "Amazon" icerdigini test edin
        Sayfa adresini(url) yazdirin
        Sayfa url'inin "amazon" icerdigini test edin.
        Sayfa handle degerini yazdirin
        Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        Sayfayi kapatin.*/

        //Amazon sayfasına gidelim
        driver.get("https://www.amazon.com/");
        //Sayfa baslığını (title) yazdirin
        System.out.println("sayfa basligi: "+driver.getTitle());
        //Sayfa baslığının "Amazon" içerdiğini tesy edin
        String actualTitle = driver.getTitle();
        String istenenKelime = "Amazon";
        if(actualTitle.contains(istenenKelime)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");
        //Sayfa adresinin (Url) yazdırın
        System.out.println("Sayfa nın Url i : " +driver.getCurrentUrl());
        //sayfa url inin "amazon" kelimesi TEST EDİN
        String actualUrl = driver.getCurrentUrl();
        String arananKelime = "amazon";
        if(actualUrl.contains(arananKelime)){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED");
        //Sayfa handle degerini yazdırın
        System.out.println("Sayfa handle degeri:" +driver.getWindowHandles());

        //Sayfa HTML kodlarında "Gateway" kelimesi geçtiğini test edin
        String actualPageSource = driver.getPageSource();
        String htmlArananKelime = "Gateway";
        if(driver.getPageSource().contains(htmlArananKelime)){
            System.out.println("pageSource testi PASSED");
        }else System.out.println("pageSource testi FAILED");
        //Sayfayı kapatın
        driver.close();


    }

}
