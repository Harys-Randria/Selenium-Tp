/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mg.selenium.tp1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Inclusiv Academy 009
 */
public class HelloSelenium {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        
        WebElement googleSearchArea  = driver.findElement(By.className("gLFyf"));
        googleSearchArea.sendKeys("Inclusiv academy");
        googleSearchArea.sendKeys(Keys.RETURN);
        
        WebElement premierLien = driver.findElement(By.xpath("//div[@id='search']//a"));
        premierLien.click();

        
    }
}
 