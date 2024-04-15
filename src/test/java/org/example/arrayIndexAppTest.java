package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class arrayIndexAppTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qanumberindex.ccbp.tech/");
        WebElement num = driver.findElement(By.xpath("//p[contains(@class , 'default-array')]"));
        String curret = num.getText();
        String expected = "[ 17, 31, 77, 20, 63 ]";

        if (curret.equals(expected)){
            System.out.println("Default Array matched");
        }else {
            System.out.println("Mismatch in Default Array");
        }
        WebElement input = driver.findElement(By.xpath("//input[contains(@class,'user-input')]"));
        input.sendKeys("48");
        WebElement findbnt = driver.findElement(By.xpath("//button[contains(@id,'Btn')]"));
        findbnt.click();
        WebElement retrieveData = driver.findElement(By.xpath("//span[contains(@class,'number')]"));
        String num48 = retrieveData.getText();
        String num48Expected = "-1";
        if (num48.equals(num48Expected)){
            System.out.println("Index matched for the number 48");
        }
        else{
            System.out.println("Index mismatched for the number 48");
        }
        Thread.sleep(3000);
        input.clear();
        WebElement input17 = driver.findElement(By.xpath("//input[contains(@class,'user-input')]"));
        input17.sendKeys("17");
        findbnt.click();
        WebElement retrieveData17 = driver.findElement(By.xpath("//span[contains(@class,'number')]"));
        String num17 = retrieveData17.getText();
        String num17Expected = "0";
        if (num17.equals(num17Expected)){
            System.out.println("Index matched for the number 17");
        }
        else{
            System.out.println("Index mismatched for the number 17");
        }
        Thread.sleep(3000);
        input17.clear();
        WebElement input77 = driver.findElement(By.xpath("//input[contains(@class,'user-input')]"));
        input77.sendKeys("77");
        findbnt.click();
        WebElement retrieveData77 = driver.findElement(By.xpath("//span[contains(@class,'number')]"));
        String num77 = retrieveData77.getText();
        String num77Expected = "2";
        if (num77.equals(num77Expected)){
            System.out.println("Index matched for the number 77");
        }
        else{
            System.out.println("Index mismatched for the number 77");
        }
        Thread.sleep(3000);
        input77.clear();
        WebElement input63 = driver.findElement(By.xpath("//input[contains(@class,'user-input')]"));
        input63.sendKeys("63");
        findbnt.click();
        WebElement retrieveData63 = driver.findElement(By.xpath("//span[contains(@class,'number')]"));
        String num63 = retrieveData63.getText();
        String num63Expected = "4";
        if (num63.equals(num63Expected)){
            System.out.println("Index matched for the number 63");
        }
        else{
            System.out.println("Index mismatched for the number 63");
        }
        Thread.sleep(3000);
        driver.quit();
    }
}
