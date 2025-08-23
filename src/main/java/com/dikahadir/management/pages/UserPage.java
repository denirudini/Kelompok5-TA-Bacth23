package com.dikahadir.management.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserPage {
    private WebDriver driver;
    private By buttonMenuManagement = By.xpath("//body/div[@id='__next']/div[@class='css-10f63sf']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiDrawer-root MuiDrawer-docked css-1tu59u4']/div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1yw4omu']/div[@data-simplebar='init']/div[@class='simplebar-wrapper']/div[@class='simplebar-mask']/div[@class='simplebar-offset']/div[@aria-label='scrollable content']/div[@class='simplebar-content']/div[@class='MuiBox-root css-10klw3m']/div[@class='sidebar MuiBox-root css-ftf74w']/div[@class='MuiBox-root css-old1by']/div[4]/div[1]/div[1]//*[name()='svg']");
    private By buttonMenuUser = By.xpath("//body/div[@id='__next']/div[@class='css-10f63sf']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiDrawer-root MuiDrawer-docked css-1tu59u4']/div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1yw4omu']/div[@data-simplebar='init']/div[@class='simplebar-wrapper']/div[@class='simplebar-mask']/div[@class='simplebar-offset']/div[@aria-label='scrollable content']/div[@class='simplebar-content']/div[@class='MuiBox-root css-10klw3m']/div[@class='sidebar MuiBox-root css-ftf74w']/div[@class='MuiBox-root css-old1by']/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]");
    private By formSearch = By.xpath("//input[@id='search']");
    private By buttonSearch = By.xpath("//button[normalize-space()='Search']");
    private By choseSeachName = By.xpath("//div[normalize-space()='Nama']");
    private By choseSearchNik = By.xpath("//li[normalize-space()='Nik']");
    private By buttonExport = By.xpath("//button[normalize-space()='Export']");
    private By buttonStatusNonactive = By.xpath("//tbody/tr[2]/td[5]");
    private By buttonStatusActive = By.xpath("//tbody/tr[3]/td[5]/span[1]/span[1]/input[1]");
    private By buttonStatusNonProject= By.xpath("//tbody/tr[2]/td[6]/span[1]/span[1]/input[1]");
    private By buttonStatusProject = By.xpath("//tbody/tr[3]/td[6]/span[1]/span[1]/input[1]");
    private By triangleMenu = By.xpath("(//*[name()='svg'][@class='feather feather-more-vertical '])[3]");
    private By triangleMenuCuti = By.xpath("(//*[name()='svg'][@class='feather feather-more-vertical '])[1]");
    private By buttonSisaCuti = By.xpath("(//li[@role='menuitem'][normalize-space()='Lihat Sisa Cuti'])[1]");
    private By buttonCloseCuti = By.xpath("//button[normalize-space()='Tutup']");
    private By buttonEditUser = By.xpath("(//li[@role='menuitem'][normalize-space()='Edit'])[3]");
    private By buttonFilter = By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth css-1rfqlnu'])");
    // filter Search
    private By formfilterUnit = By.xpath("//div[@id='mui-component-select-job_departement_id']");
    private By formfilterJoblevel = By.xpath("//div[@id='mui-component-select-job_level_id']");
    private By formfilterTipeKaryawan = By.xpath("//div[@id='mui-component-select-employee_type_id']");
    private By formfilterPosisiKerja = By.xpath("//div[@id='mui-component-select-job_position_id']");
    private By formfilterLokasiKerja = By.xpath("//div[@id='mui-component-select-location_point_id']");
    private By formfilterStatus = By.xpath("//div[@id='demo-select-small']");
    private By choseJoblevel = By.xpath("//li[normalize-space()='Kepala']");
    private By choseUnit = By.xpath("(//li[normalize-space()='Business Development'])[1]");
    private By choseTipeKaryawan = By.xpath("//li[normalize-space()='Mitra']");
    private By chosePosisiKerja = By.xpath("//li[normalize-space()='BNC Quality Control - Email & Customer Service Ded']");
    private By choseLokasiKerja = By.xpath("//li[normalize-space()='Iforte - Surabaya']");
    private By choseStatus = By.xpath("//li[normalize-space()='Aktif']");

    private By buttonTerapkan = By.xpath("//button[normalize-space()='Terapkan']");

    public UserPage(WebDriver driver){
        this.driver = driver;
    }
    public void buttonMenuUser(){
        driver.findElement(buttonMenuUser).click();
    }
    public void buttonMenuManagement(){
        driver.findElement(buttonMenuManagement).click();
    }
    public void formSearch(String search){
        driver.findElement(formSearch).sendKeys(search);
    }
    public void buttonSearch(){
        driver.findElement(buttonSearch).click();;
    }
    public void choseSeachName(){
        driver.findElement(choseSeachName).click();
    }
    public void choseSearchNik(){
        driver.findElement(choseSearchNik).click();
    }
    public void buttonExport(){
        driver.findElement(buttonExport).click();
    }
    public void buttonStatusNonActive(){
        driver.findElement(buttonStatusNonactive).click();
    }
    public void buttonStatusActive(){
        driver.findElement(buttonStatusActive).click();
    }
    public void buttonStatusNonProject(){
        driver.findElement(buttonStatusNonProject).click();
    }
    public void buttonStatusProject(){
        driver.findElement(buttonStatusProject).click();
    }
    public void triangleMenu(){
        driver.findElement(triangleMenu).click();
    }
    public void triangleMenuCuti(){
        driver.findElement(triangleMenuCuti).click();
    }
    public void buttonSisaCuti() {
        driver.findElement(buttonSisaCuti).click();
    }
    public void buttonCloseCuti() {
        driver.findElement(buttonCloseCuti).click();
    }
    public void refreshPage() {
        driver.navigate().refresh();
    }
    public void buttonEditUser() {
        driver.findElement(buttonEditUser).click();
    }
    public void buttonFilter() {
        driver.findElement(buttonFilter).click();
    }
    public void formFilterUnit() {
        driver.findElement(formfilterUnit).click();
    }
    public void choseUnit() {
        driver.findElement(choseUnit).click();
    }
    public void formFilterJoblevel() {
        driver.findElement(formfilterJoblevel).click();
    }
    public void choseJoblevel() {
        driver.findElement(choseJoblevel).click();
    }
    public void buttonTerapkan() {
        driver.findElement(buttonTerapkan).click();
    }
    public void formFilterTipeKaryawan() {
        driver.findElement(formfilterTipeKaryawan).click();
    }
    public void choseTipeKaryawan() {
        driver.findElement(choseTipeKaryawan).click();
    }
    public void formFilterPosisiKerja() {
        driver.findElement(formfilterPosisiKerja).click();
    }
    public void chosePosisiKerja() {
        driver.findElement(chosePosisiKerja).click();
    }
    public void formFilterLokasiKerja() {
        driver.findElement(formfilterLokasiKerja).click();
    }
    public void choseLokasiKerja() {
        driver.findElement(choseLokasiKerja).click();
    }
    public void formFilterStatus() {
        driver.findElement(formfilterStatus).click();
    }
    public void choseStatus() {
        driver.findElement(choseStatus).click();
    }
}
