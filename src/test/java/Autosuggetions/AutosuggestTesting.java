package Autosuggetions;


import  org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

public class AutosuggestTesting {

    @Test
    public void testAutosuggest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(5));
        WebElement inputBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='inputs ui-autocomplete-input']")));
        inputBox.sendKeys("ind");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='ui-menu-item']//a")));
        List<WebElement> listofElements = driver.findElements(By.xpath("//li[@class='ui-menu-item']//a"));

        for (WebElement option : listofElements) {
            if (option.getText().equalsIgnoreCase("India")) {
                option.click();
                break;
            }
        }
        driver.quit();
    }
}