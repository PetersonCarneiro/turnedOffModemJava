package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class TurnOff {

    WebDriver driver = new ChromeDriver();
    String urlReboot = "";


    public void login(String urlModem, String name, String password){
        driver.get(urlModem);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement idName = driver.findElement(By.id("username"));
        WebElement idPass = driver.findElement(By.id("password"));

        idName.sendKeys(name);
        idPass.sendKeys(password);

        WebElement btn = driver.findElement(By.id("loginBT"));
        btn.click();

        try {
            Thread.sleep(3000); // 3 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        urlReboot = urlModem + "reboot.cgi";
        }


    public void rebootModem() {
        driver.get(urlReboot);

        WebElement btnReboot = driver.findElement(By.id("do_reboot"));
        btnReboot.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        //driver.switchTo().alert().accept();
        driver.quit();
    }


}




