package com.dikahadir.management.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.datatransfer.StringSelection;
import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class PendaftaranUserPage {

    private WebDriver driver;
    private By buttonMenuManagement = By.xpath("//body/div[@id='__next']/div[@class='css-10f63sf']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiDrawer-root MuiDrawer-docked css-1tu59u4']/div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1yw4omu']/div[@data-simplebar='init']/div[@class='simplebar-wrapper']/div[@class='simplebar-mask']/div[@class='simplebar-offset']/div[@aria-label='scrollable content']/div[@class='simplebar-content']/div[@class='MuiBox-root css-10klw3m']/div[@class='sidebar MuiBox-root css-ftf74w']/div[@class='MuiBox-root css-old1by']/div[4]/div[1]/div[1]//*[name()='svg']");
    private By buttonMenuPendaftaranUser = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-aqx7sf'][normalize-space()='Pendaftaran User']");
    private By fieldImageEmployee= By.xpath("//label[normalize-space()='Upload']");
    private By formNik= By.xpath("//input[@id='nik']");
    private By formName = By.xpath("//input[@id='fullname']");
    private By formEmail = By.xpath("//input[@id='email']");
    private By formPassword = By.xpath("//input[@id='password']");
    private By formDivisi = By.xpath("//input[@id='divisi']");
    private By formUnit = By.xpath("//input[@id='unit']");
    private By formPosisiKerja = By.xpath("//input[@id='posisi-kerja']");
    private By formJabatan = By.xpath("//input[@id='jabatan']");
    private By formAtasan = By.xpath("//input[@id='atasan']");
    private By formAtasanClientV2 = By.xpath("//input[@id='atasan-v2']");
    private By formAtasanClientV3 = By.xpath("//input[@id='atasan-v3']");
    private By formTypeKontrak = By.xpath("//input[@id='tipe-kontrak']");
    private By formLokasiKerja = By.xpath("//input[@id='lokasi-kerja']");
    private By formTipeShift = By.xpath("//div[@id='shift_type']");
    private By formJadwalKerja = By.xpath("//input[@id='jadwal-kerja']");
    private By formSelfie = By.xpath("//div[@id='required_selfie']");
    private By formJumlahCuti = By.xpath("//input[@id='jumlah-cuti']");
    private By buttonSubmit = By.xpath("//button[@id='submit']");
    private By nofitikasiNoimage = By.xpath("//div[@role='alert']");
    private By nofitikasiSuccesAdd = By.xpath("//div[@role='alert']");

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
    public void formName(String name){
        driver.findElement(formName).sendKeys(name);
    }
    public void formEmail(String email){
        driver.findElement(formEmail).sendKeys(email);
    }
    public void formPassword(String password){
        driver.findElement(formPassword).sendKeys(password);
    }
    public void formDivisi(String divisi){
        driver.findElement(formDivisi).sendKeys(divisi);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement saranDivisi = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='divisi-option-0']")));
        saranDivisi.click();
    }
    public void formUnit(String unit){
        driver.findElement(formUnit).sendKeys(unit);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement saranUnit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='11 aaaa']")));
        saranUnit.click();
    }
    public void formPosisiKerja(String posisi){
        driver.findElement(formPosisiKerja).sendKeys(posisi);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement saranPosisi = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='BNC Agent Sosial ']")));
        saranPosisi.click();
    }
    public void formJabatan(String jabatan){
        driver.findElement(formJabatan).sendKeys(jabatan);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement saranJabatan = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Area Sales Manager']")));
        saranJabatan.click();   
    }
    public void formAtasan(String atasan){
        driver.findElement(formAtasan).sendKeys(atasan);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement saranAtasan = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='D7240031 - Wilder']")));
        saranAtasan.click();
    }
    public void formAtasanClientV2(String atasanV2){
        driver.findElement(formAtasanClientV2).sendKeys(atasanV2);
    }
    public void formAtasanClientV3(String atasanV3){
        driver.findElement(formAtasanClientV3).sendKeys(atasanV3);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement saranAtasanV3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Damora - Bank Neo Commerce']")));
        saranAtasanV3.click();
        
    }
    public void formTypeKontrak(String typeKontrak){
        driver.findElement(formTypeKontrak).sendKeys(typeKontrak);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement saranTypeKontrak = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Magang']")));
        saranTypeKontrak.click();
    }

    public void formLokasiKerja(String lokasiKerja){
        driver.findElement(formLokasiKerja).sendKeys(lokasiKerja);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement saranLokasiKerja = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='DIKA Banjarmasin']")));
        saranLokasiKerja.click();
    }
    public void formTipeShift(String tipeShift){
        driver.findElement(formTipeShift).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement saranTipeShift = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[normalize-space()='Shift']")));
        saranTipeShift.click();
    }
    public void formJadwalKerja(String jadwalKerja){
        driver.findElement(formJadwalKerja).sendKeys(jadwalKerja);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement saranJadwalKerja = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Bank KB Bukopin']")));
        saranJadwalKerja.click();
    }
    public void formSelfie(String selfie){
        driver.findElement(formSelfie).sendKeys(selfie);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement saranSelfie = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[normalize-space()='No Selfie']")));
        saranSelfie.click();
    }
    public void formJumlahCuti(String jumlahCuti){
        driver.findElement(formJumlahCuti).clear();
        driver.findElement(formJumlahCuti).sendKeys(jumlahCuti);
    }
    public void buttonSubmit() {
        driver.findElement(buttonSubmit).click();
    }

    public String getNotificationNoImage() { // notifikasi jika tidak ada gambar
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement notificationElement = wait.until(ExpectedConditions.visibilityOfElementLocated(nofitikasiNoimage));
        return notificationElement.getText();
    }
    public String getNotificationSuccesAdd() { // notifikasi jika berhasil
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement notificationElement = wait.until(ExpectedConditions.visibilityOfElementLocated(nofitikasiSuccesAdd));
        return notificationElement.getText();
    }
   
}


