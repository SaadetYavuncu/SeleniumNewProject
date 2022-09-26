package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(15)));
        driver.get("https://amazon.com");
        //Amazonda nutella aratın.
        //WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        //aramaKutusu.sendKeys("Nutella" + Keys.ENTER);//id unique oldugu için bu sorunsuz çalışır

        //WebElement aramaKutusu = driver.findElement(By.name("field-keywords"))aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        //unique oldugu için sorunsuz çalışır

        //WebElement aramaKutusu = driver.findElement(By.className("nav-search-field ")); //çalışmaz
        //aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        /*
        bu locatar çalışmadı locatar alırken gözümüzden kaçan detaylar olabilir
        aldığımız locatar çalişmazsa alternatif locatarlar denemeliyiz
         */

        //driver.findElement(By.linkText("Become an Affiliate")).click();
        driver.findElement(By.partialLinkText("oducts on Amazon")).click();
        //a tag'ındaki link isminden istediğiniz bir parçayla locayt edebliriz
        driver.findElement(By.linkText("Sell products on Amazon")).click();
    }
}