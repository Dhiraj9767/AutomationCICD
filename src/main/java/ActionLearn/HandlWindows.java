package ActionLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HandlWindows {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@href='https://rahulshettyacademy.com/documents-request']")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parantId = it.next();
        String childWindow = it.next();
        driver.switchTo().window(childWindow);

        System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
        String emailId = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(parantId);
        WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
        userName.sendKeys(emailId);



        }
}
