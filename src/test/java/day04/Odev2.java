package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Odev2 {
    /*
 1-C01_TekrarTesti isimli bir class olusturun  2- https://www.amazon.com/ adresine gidin  3- Browseri tam sayfa yapin
 Sayfayi “refresh” yapin
 Sayfa basliginin “Spend less” ifadesi icerdigini test edin
 Gift Cards sekmesine basin
 Birthday butonuna basin
 Best Seller bolumunden ilk urunu tiklayin  9- Gift card details’den 25 $’i secin
 10-Urun ucretinin 25$ oldugunu test edin
 10-Sayfayi kapatin
     */
    static Object $;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


//        2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com");
//        3- Browseri tam sayfa yapin
        Thread.sleep(2000);
        driver.manage().window().maximize();
//        4-Sayfayi “refresh” yapin
        Thread.sleep(2000);
        driver.navigate().refresh();
//        5-Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        Thread.sleep(2000);
        String title = driver.getTitle();
        if (title.equals("Spend less")) {
            System.out.println("Spend less iceriyor:" + title);
        } else System.out.println("Spend less içermiyor");

//        6-Gift Cards sekmesine basin
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Gift Cards']")).click();
//        7-Birthday butonuna basin
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@alt='Birthday gift cards']")).click();
//        8-Best Seller bolumunden ilk urunu tiklayin
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@alt='Amazon.com eGift Card']")).click();
//        9- Gift card details’den 25 $’i secin
        Thread.sleep(2000);
        WebElement ucret = driver.findElement(By.xpath("(//*[@id='gc-mini-picker-amount-1'])[1]"));
        ucret.click();
//        10-Urun ucretinin 25$ oldugunu test edin

        String tutar = ucret.getText();
        String dolar ="$25.00";
        Thread.sleep(5000);

        if (tutar.equals(dolar)) {
            System.out.println("Ucret 25$");

        }else System.out.println("Ucret 25$ değildir");

//        10-Sayfayi kapatin
       Thread.sleep(2000);
       driver.close();

    }

}
