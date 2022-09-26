package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); //sayfayı tam sayfa yapıyor

        //Amazon sayfasına gidiniz
        driver.get("https://amazon.com");
        //Kaynak kodların içinde "Gateway" kelimesinin olduğunu test ediniz
       // System.out.println(driver.getPageSource());  //sayfadaki kaynak kodlarını verir
        String istenenKelime = "Gateway";
        if(driver.getPageSource().contains(istenenKelime)){
            System.out.println("pageSource testi PASSED");
        }else System.out.println("pageSource testi FAILED");
        driver.close();
    }
}
