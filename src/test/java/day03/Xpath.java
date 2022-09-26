package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Xpath {
    /*
   https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
   2- Add Element butonuna basin
   Delete butonu’nun gorunur oldugunu test edin
   Delete tusuna basin
   “Add/Remove Elements” yazisinin gorunur oldugunu test edin

    */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // 2- Add Element butonuna basin
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        /*
        Locate alırken sadece text kullanacaksak "//*[text()='Delete']" bu format kullanılır
        Atribute kullanacaksak //*[@onclick='addElemen()'] bu format kullanılır.

         */


        // 3-Delete butonu’nun gorunur oldugunu test edin
       WebElement deleteButonu = driver.findElement(By.xpath("//*[text()='Delete']"));
       if(deleteButonu.isDisplayed()){
           System.out.println("Delete butonu testi passed" + deleteButonu);
       }else System.out.println("Delete Testi FAILED");
       Thread.sleep(3000);


        //4- Delete tusuna basin
        deleteButonu.click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        Thread.sleep(3000);

        //WebElement add_remove_elements = driver.findElement(By.tagname("h3"));

        WebElement add_remove_elements = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
       String actualAddRemoveE="Add/Remove Elements";
       if(actualAddRemoveE.equals(actualAddRemoveE)){
           System.out.println("add_remove_elements testi passed: " + add_remove_elements);
       }else
           System.out.println( "add_remove_elements testi FAILED" + add_remove_elements);


       driver.close();

    }

}