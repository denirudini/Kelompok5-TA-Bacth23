package com.dikahadir.management.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.datatransfer.StringSelection;
import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
public class PendaftaranUserPage {
    private WebDriver driver;
    private By buttonMenuManagement = By.xpath("//body/div[@id='__next']/div[@class='css-10f63sf']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiDrawer-root MuiDrawer-docked css-1tu59u4']/div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1yw4omu']/div[@data-simplebar='init']/div[@class='simplebar-wrapper']/div[@class='simplebar-mask']/div[@class='simplebar-offset']/div[@aria-label='scrollable content']/div[@class='simplebar-content']/div[@class='MuiBox-root css-10klw3m']/div[@class='sidebar MuiBox-root css-ftf74w']/div[@class='MuiBox-root css-old1by']/div[4]/div[1]/div[1]//*[name()='svg']");
    private By buttonMenuPendaftaranUser = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-aqx7sf'][normalize-space()='Pendaftaran User']");
    private By fieldImageEmployee= By.xpath("//label[normalize-space()='Upload']");
    private By formNik= By.xpath("//input[@id='nik']");
    public PendaftaranUserPage(WebDriver driver){
        this.driver = driver;
    }
    public void buttonMenuManagement(){
        driver.findElement(buttonMenuManagement).click();
    }
    public void buttonMenuPendaftaranUser(){
        driver.findElement(buttonMenuPendaftaranUser).click();
    }
    public void fieldImageEmployee() throws AWTException, InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", driver.findElement(fieldImageEmployee));
        StringSelection filePathSelection = new StringSelection("C:\\Users\\denir\\Downloads\\25.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePathSelection, null);
        Robot rb = new Robot();
        Thread.sleep(2000);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_V);
        Thread.sleep(2000);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

    }
    public void formNik(String nik){
        driver.findElement(formNik).sendKeys(nik);
    }
}
