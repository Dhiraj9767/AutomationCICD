package org.chromesel;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MultipleWindowHandlesTabs {
    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.switchTo().newWindow(WindowType.TAB);
        //want to get window handle of the new tab
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String paraentWindowHandle = it.next();
        String childWindow = it.next();
        driver.switchTo().window(childWindow);
        driver.get("https://rahulshettyacademy.com/");
        // Get the 2nd matching link text
        List<WebElement> course = driver.findElements(By.cssSelector("a[href*='core-java-for-automation-teste']"));
        String courseName = course.get(1).getText();
        System.out.println("2nd course name: " + courseName);
        driver.switchTo().window(paraentWindowHandle);
        WebElement name = driver.findElement(By.cssSelector("[name=name]"));
        name.sendKeys(courseName);
        File file=name.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("nameField.png"));


        // Thread.sleep(2000);
        //driver.quit();

    }
}
