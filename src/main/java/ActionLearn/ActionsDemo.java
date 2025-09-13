package ActionLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);

        //driver.findElement(By.cssSelector("button.a-button-text")).click();

        Actions act = new Actions(driver);
        WebElement move = driver.findElement(By.cssSelector("a[class='nav-a nav-a-2   nav-progressive-attribute']"));
        act.moveToElement(move).build().perform();
    }

}
