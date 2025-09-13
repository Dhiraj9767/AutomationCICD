package org.chromesel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class locators {
    public static void main(String[] args) {

        WebDriver driver  = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        //clicking on the username field and entering text

        WebElement username = driver.findElement(By.xpath("//input[@id='inputUsername' and @placeholder='Username']"));
                username.sendKeys("rahulshettyacademy");
        //clicking on the password field and entering text
        WebElement password= driver.findElement(By.xpath("//input[@name='inputPassword' and @placeholder='Password']"));
    password.sendKeys("rahulshettyacademy");

    
        WebElement signIn= driver.findElement(By.xpath("//button[@class='submit signInBtn' and @type='submit']"));
        signIn.click();

        String successMsg = driver.findElement(By.tagName("p")).getText();
        System.out.println("success msg :-"+ successMsg);

    }


}
