package day03;

import io.opentelemetry.api.baggage.propagation.W3CBaggagePropagator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetMethodlari {
    public static void main(String[] args) {
        /*

    -Amazon sayfasına gidiniz
    -Arama kutusunu locate ediniz
    -Arama kutusunun tagName'inin input olduğunu test ediniz
    -Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
    -Sayfayı kapatınız
      */
        System.setProperty("webdriver.chrome.driver" , "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));




//     1-Amazon sayfasına gidiniz
        driver.get("https://amazon.com");
//     2-Arama kutusunu locate ediniz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
//     3-Arama kutusunun tagName'inin input olduğunu test ediniz
        String expectedTagName = "input";
        String actualTagName = aramaKutusu.getTagName();
        if(actualTagName.equals(expectedTagName)){
            System.out.println("TagName testi passed : " + actualTagName);
        }else System.out.println("TagName testi FAILED : " + actualTagName);

//     4-Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        String expectedAtributuName = "field-keywords";
        String actualAtributuName = aramaKutusu.getAttribute("name");
        if(actualAtributuName.equals(expectedAtributuName)){
            System.out.println("Attribute testi passed");
        }else System.out.println("Attribute testi FAILED");

        //Arama kutusunun konumunu yazdırın
        System.out.println("Arama kutusu konumu: " + aramaKutusu.getLocation());

//      5-Sayfayı kapatınız
        driver.close();

        /*
        TAGNAME Her webelementin ilk siradaki ismidir ÖRNEK =INPUT
        ATTRIBUTE ISE --->  id   ----value name --  dir --class--
        bunlarin icinde olanlar ise   attribute degerleridir .     ?
         */
    }
}
