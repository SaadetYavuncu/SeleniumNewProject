package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C08_IlkGunCalisma3 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

         /*
    ödev3
ClasslassWork : L oginoginTest
1. Bir class oluşturun: LoginTest
2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
a. http://a.testaddressbook.com adresine gidiniz.
b. Sign in butonuna basin
c. email textbox,password textbox, and signin button elementlerini locate
d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
i. Username :
testtechproed@gmail.com
ii. Password : Test1234!
e. Expected user id nin
testtechproed@gmail.com oldugunu dogrulayin(verify).
f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
3. Sayfada kac tane link oldugunu bulun.
     */

//        1. Bir class oluşturun: LoginTest
//        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
//        a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
//        b. Sign in butonuna basin
        Thread.sleep(3000);
        driver.findElement(By.id("sign-in")).click();
//        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        Thread.sleep(3000);
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        WebElement password = driver.findElement(By.id("session_password"));
        WebElement signin = driver.findElement(By.name("commit"));
//        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
//        i. Username :testtechproed@gmail.com
//        ii. Password : Test1234!
        Thread.sleep(3000);
        emailTextBox.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signin.click();
//        e. Expected user id nin
//        testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement expectedid = driver.findElement(By.className("navbar-text"));
        if(expectedid.isDisplayed()){
            System.out.println("UserId TESTİ PASSED");
        }else System.out.println("UserId Testi FAILED! Dogru User İd : " + expectedid);
//       f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        Thread.sleep(3000);
        WebElement addresses = driver.findElement(By.linkText("Addresses"));
        WebElement signOut = driver.findElement(By.linkText("Sign out"));

        if(addresses.isDisplayed()){
            System.out.println("Addresses TESTİ PASSED");
        }else System.out.println("Addresses TESTİ FAILED : " + addresses);

        if(signOut.isDisplayed()){
            System.out.println("signOut TESTİ PASSED");
        }else System.out.println("signOut TESTİ FAILED");

//      t3. Sayfada kac tane link oldugunu bulun.
        Thread.sleep(3000);
        List<WebElement> linkler = driver.findElements(By.tagName("a"));
        System.out.println(linkler.size());

        Thread.sleep(3000);
        driver.close();

    }
}
