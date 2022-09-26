package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Tekrarlarim {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


//        a. http://a.testaddressbook.com adresine gidiniz.

        driver.get("http://a.testaddressbook.com");


//        b. Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click();
//        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
         WebElement emailTextbox = driver.findElement(By.id("session_email"));
         WebElement password = driver.findElement(By.id("session_password"));
         WebElement signin = driver.findElement(By.name("commit"));
//        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
//        i. Username : testtechproed@gmail.com
//        ii. Password : Test1234!

        emailTextbox.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signin.click();

//        e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).

        WebElement expectedUser = driver.findElement(By.className("navbar-text"));
        if(expectedUser.isDisplayed()){
            System.out.println("ExpectedUser TESTİ PASSED" +expectedUser.getText());
        }else System.out.println("ExpectedUser Testi FAILED");

        //----------------------------------------

        String expectedUserYazisi = "testtechproed@gmail.com";
        String actualUserYazısı = expectedUser.getText();
        if(actualUserYazısı.equals(expectedUserYazisi)){
            System.out.println("ExpectedUser testi passed");
        }else System.out.println("ExpectedUser testi failed");


//        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement addresses = driver.findElement(By.linkText("Addresses"));
        WebElement singOut = driver.findElement(By.linkText("Sign out"));

        if(addresses.isDisplayed()){
            System.out.println("Addresses TESTİ PASSED");
        }else System.out.println("Addresses Testi FAILED");


        if(singOut.isDisplayed()){
            System.out.println("SingOut TESTİ PASSED");
        }else System.out.println("SingOut Testi FAILED");
//        3. Sayfada kac tane link oldugunu bulun.adresine gidiniz.
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin sayısı : " + linklerListesi.size());
        System.out.println(linklerListesi);//bu şekilde yazdırınsak hashcode veriri ama liste olarak yazdırmak istiyoruz

        //4- Linkleri yazdırın
        for (WebElement each:linklerListesi) {
            System.out.println("LİNKLER : "  + each.getText());
        }

        //5-Linkleri Lambda ile yazdırınız

        linklerListesi.forEach(t-> System.out.println("LİNKLER2: " +  t.getText()));

        //6- sayfayı kapatınız
        driver.close();





    }
}
