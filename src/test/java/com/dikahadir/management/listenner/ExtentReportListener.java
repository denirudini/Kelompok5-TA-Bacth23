package com.dikahadir.management.listenner;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportListener implements ITestListener {

    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    
    // Objek WebDriver harus bisa diakses secara global di Listener
    public static WebDriver driver;

    @Override
    public void onStart(ITestContext context) {
        String reportPath = System.getProperty("user.dir") + "/target/ExtentReport.html";
        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
        
        extent = new ExtentReports();
        extent.attachReporter(spark);
        
        // --- PENAMBAHAN FUNGSI ---
        extent.setSystemInfo("Tugas TA", "QA Automation Team");
        extent.setSystemInfo("Environment", "Staging");
        extent.setSystemInfo("User", "Deni Rudini");
        // ---
        
        System.out.println("ExtentReports dimulai...");
    }

    @Override
    public void onFinish(ITestContext context) {
        if (extent != null) {
            extent.flush();
            System.out.println("ExtentReports selesai. Laporan ada di: " + System.getProperty("user.dir") + "/target/ExtentReport.html");
        }
    }
    
    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest currentTest = extent.createTest(result.getMethod().getMethodName());
        test.set(currentTest);
        System.out.println("Test dimulai: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().log(Status.PASS, "Test berhasil.");
        System.out.println("Test berhasil: " + result.getMethod().getMethodName());
    }
    
    @Override
    public void onTestFailure(ITestResult result) {
        test.get().log(Status.FAIL, "Test gagal: " + result.getThrowable());
        
        // LOGIC PENGAMBILAN SCREENSHOT
        if (driver != null) {
            String screenshotPath = getScreenshot(driver, result.getMethod().getMethodName());
            // Gunakan addScreenCaptureFromPath() untuk melampirkan screenshot
            test.get().fail("Screenshot Kegagalan").addScreenCaptureFromPath(screenshotPath, "Kegagalan pada " + result.getMethod().getMethodName());
        }
        System.out.println("Test gagal: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.get().log(Status.SKIP, "Test di-skip: " + result.getThrowable());
        System.out.println("Test di-skip: " + result.getMethod().getMethodName());
    }

    // --- PENAMBAHAN FUNGSI HELPER ---
    public static void logInfo(String message) {
        test.get().log(Status.INFO, message);
    }
    
    public static void logPass(String message) {
        test.get().log(Status.PASS, message);
    }
    
    public static void logFail(String message) {
        test.get().log(Status.FAIL, message);
    }
    // ---
    
    private static String getScreenshot(WebDriver driver, String screenshotName) {
        String screenshotPath = null;
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        File screenshotsDir = new File(System.getProperty("user.dir") + "/target/screenshots");
        if (!screenshotsDir.exists()) {
            screenshotsDir.mkdirs();
        }
        
        File destination = new File(screenshotsDir, screenshotName + "_" + timestamp + ".png");
        try {
            FileHandler.copy(source, destination);
            // Return path relatif agar bisa diakses di laporan HTML
            screenshotPath = "./screenshots/" + destination.getName();
        } catch (IOException e) {
            System.err.println("Gagal mengambil screenshot: " + e.getMessage());
        }
        return screenshotPath;
    }
    
    // --- PENAMBAHAN FUNGSI UNTUK MELAMPIRKAN SCREENSHOT KE LAPORAN ---
    public static void attachScreenshotToReport(String description) {
        if (driver != null) {
            String screenshotPath = getScreenshot(driver, "screenshot");
            test.get().addScreenCaptureFromPath(screenshotPath, description);
        }
    }
    // ---
}