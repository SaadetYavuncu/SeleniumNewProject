package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethodlari {
    public static  void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(15)));
        driver.get("https://amazon.com");
        driver.close();

         /*
        ileride wait daha geniş olarak ele alacağız.
        1 sayfa acılırken ilk basta sayfanin icerisinde bulunan elementlere göre 1 yukleme süres,ne ihtiyac vardir.
        veya 1 web elementin kullanılabilmesi icin zamana ihtiyac olabilir.
        implicitywait bize sayfanin yüklenmesi ve sayfadaki elementlere ulasim icin beklenecek maximum süreyi belirleme
        olanagi tanir
         */

    }
}
