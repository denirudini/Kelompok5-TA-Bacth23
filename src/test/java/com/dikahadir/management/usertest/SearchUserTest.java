package com.dikahadir.management.usertest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.dikahadir.management.BaseTest;
import com.dikahadir.management.pages.UserPage;
import com.dikahadir.management.utils.DriverUtil;

public class SearchUserTest extends BaseTest {
    private UserPage userpage;

    @Test (priority = 1)
    public void searchName() throws InterruptedException{
        userpage = new UserPage(DriverUtil.getDriver());
        userpage.buttonMenuManagement();
        Thread.sleep(1000);
        userpage.buttonMenuUser();
        Thread.sleep(1000);
        userpage.formSearch("sas");
        Thread.sleep(1000);
        userpage.buttonSearch();
        Thread.sleep(1000);
        String actual = DriverUtil.getDriver().findElement(By.xpath("//p[@class='MuiTablePagination-displayedRows css-kim0d']")).getText();
        String expected = "1-4 of 4";
        Assert.assertEquals(actual, expected, "Login failed or URL mismatch.");
        Thread.sleep(2000);
        userpage.refreshPage();
    }
    @Test (priority = 2)
    public void searchNik() throws InterruptedException{
        userpage = new UserPage(DriverUtil.getDriver());
        userpage.buttonMenuManagement();
        Thread.sleep(1000);
        userpage.buttonMenuUser();
        Thread.sleep(1000);
        userpage.choseSeachName();
        userpage.choseSearchNik();
        userpage.formSearch("D7240017");
        Thread.sleep(1000);
        userpage.buttonSearch();
        Thread.sleep(1000);
        String actual = DriverUtil.getDriver().findElement(By.xpath("//p[@class='MuiTablePagination-displayedRows css-kim0d']")).getText();
        String expected = "1-3 of 3";
        Assert.assertEquals(actual, expected, "Login failed or URL mismatch.");
        Thread.sleep(2000);
        userpage.refreshPage();
    }
    // @Test (priority = 3)
    // public void searchByFilter() throws InterruptedException{
    //     userpage = new UserPage(DriverUtil.getDriver());
    // }
   
}
