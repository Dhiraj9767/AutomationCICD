package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanaDrops {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Thread.sleep(2000L);

        WebElement from = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
        from.click();

        driver.findElement(By.xpath("//a[@text='Pune (PNQ)']")).click();


        WebElement to = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
        to.click();

        driver.findElement(By.xpath("//a[@text='Goa (GOI)']")).click();
    }
}
