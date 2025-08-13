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

}
