package Autosuggetions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutosuggestTesting {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.cssSelector("input[class='inputs ui-autocomplete-input']")).sendKeys("ind");
        Thread.sleep(3000);
        List<WebElement> listofElements = driver.findElements(By.xpath("//li[@class='ui-menu-item']//a"));


        for (WebElement option : listofElements) {

            if (option.getText().equalsIgnoreCase("India")) {
                option.click();
                break;
            }

        }


    }
}
