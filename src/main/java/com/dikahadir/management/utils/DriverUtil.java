package com.dikahadir.management.utils;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverUtil {
    private static WebDriver driver;
    
    static String downloadDir = System.getProperty("user.dir") + File.separator + "downloads";
    public static WebDriver getDriver() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            // options.addArguments("--headless");
            Map<String, Object> prefs = new HashMap<String, Object>();
            prefs.put("profile.default_content_setting_values.notifications", 2);
            options.setExperimentalOption("prefs", prefs);
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            driver.manage().window().maximize(); 
            prefs.put("download.default_directory", downloadDir);
            prefs.put("download.prompt_for_download", false); 
        }
        return driver;
    }

    public WebDriver getDrivers() {
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}