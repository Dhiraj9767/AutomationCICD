package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Staticdrops {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
        WebElement selectxpath = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']"))
        );
        Select selectDropdown = new Select(selectxpath);
        selectDropdown.selectByIndex(2);
        System.out.println(selectDropdown.getFirstSelectedOption().getText());

        selectDropdown.selectByVisibleText("USD");
        System.out.println(selectDropdown.getFirstSelectedOption().getText());
    }
}