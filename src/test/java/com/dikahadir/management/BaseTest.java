package com.dikahadir.management;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.dikahadir.management.listenner.ExtentReportListener;
import com.dikahadir.management.utils.DriverUtil;

public class BaseTest {

    @BeforeMethod
    public void setUp() throws InterruptedException {
        WebDriver driver = DriverUtil.getDriver();
        driver.manage().window().maximize();
        ExtentReportListener.driver = driver; 
        driver.get("https://magang.dikahadir.com/authentication/login");
        
        driver.findElement( By.xpath("//input[@id='email']")).sendKeys("admin@hadir.com");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("MagangSQA_JC@123");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//button[normalize-space()='Masuk']")).click();
        Thread.sleep(1000);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000); 
        DriverUtil.quitDriver();
    }
}