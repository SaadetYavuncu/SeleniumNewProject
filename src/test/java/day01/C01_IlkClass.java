package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {
        /*
        En temel haliyle bir otomasyon yapmak için
        Class'ımıza otomasyon için gerekli olan webdriver'in yerini göstermemiz gerekir
        bunun için java kutuphanesinde System.setProperty() method'unu kullanırız
        ve metthod'un içine ilk olarak driver'i yazarız. İkinci olarak onun fiziki yolunu kopyalarız
         */
         /*
        En temel haliyle bir otamasyon yapmak icin class'imizda otomasyon icin
        grekli olan webdriver'in yerini gostermemiz gerekir
        Bunun icin Java kutuphanesinden System.setproperty() 'unu kullaniriz
        ve method'un icine
         1. driver'i yazariz
         2. fiziki yolunu kopyalariz
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        System.out.println("Actual Title :" +driver.getTitle()); //gidilen sitenin başlığını yazdırır
        System.out.println("Actual Url :" +driver.getCurrentUrl()); //gidilen sayfanın url ini getirir
        System.out.println("Actual Cod :" +driver.getPageSource()); //gidilen sayfanın kodlarını yazdırı


    }
}

