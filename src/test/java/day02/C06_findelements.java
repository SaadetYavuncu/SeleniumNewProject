package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C06_findelements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Amazon sayfasına gidiniz
        driver.get("https://amazon.com");
        //Amazon sayfasındaki tagları input olanların sayısını yazdirin
        List<WebElement> tag = driver.findElements(By.tagName("input"));
        System.out.println("input tag'inin sayısı: " + tag.size());

    }
}
