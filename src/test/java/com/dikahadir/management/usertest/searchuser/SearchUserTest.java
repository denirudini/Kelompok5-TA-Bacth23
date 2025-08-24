package com.dikahadir.management.usertest.searchuser;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.dikahadir.management.BaseTest;
import com.dikahadir.management.pages.UserPage;
import com.dikahadir.management.utils.DriverUtil;

public class SearchUserTest extends BaseTest {
    private UserPage userpage;

    @Test (priority = 1, description = "Test untuk mencari user dari nama (positif)")
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
        Assert.assertEquals(actual, expected, "search by name failed.");
    }

    @Test (priority = 2, description = "Test untuk mencari user dari nik (positif)")
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
        Assert.assertEquals(actual, expected, "search by nik failed..");
    }

    @Test (priority = 3, description = "Test untuk mencari user dengan input nama dan tetapi field nik (negatif)")
    public void searchByNameinputNik() throws InterruptedException{
        userpage = new UserPage(DriverUtil.getDriver());
        userpage.buttonMenuManagement();
        Thread.sleep(1000);
        userpage.buttonMenuUser();
        Thread.sleep(1000);
        userpage.formSearch("D7240017");
        Thread.sleep(1000);
        userpage.buttonSearch();
        Thread.sleep(1000);
        String actual = DriverUtil.getDriver().findElement(By.xpath("//p[@class='MuiTablePagination-displayedRows css-kim0d']")).getText();
        String expected = "0-0 of 0";
        Assert.assertEquals(actual, expected, "Login failed or URL mismatch.");
    }

    @Test (priority = 4, description = "Test untuk mencari user dengan input nik dan tetapi field nama (negatif)")
    public void searchByNikInputName() throws InterruptedException{
        userpage = new UserPage(DriverUtil.getDriver());
        userpage.buttonMenuManagement();
        Thread.sleep(1000);
        userpage.buttonMenuUser();
        Thread.sleep(1000);
        userpage.choseSeachName();
        userpage.choseSearchNik();
        userpage.formSearch("Deni Rudini");
        Thread.sleep(1000);
        userpage.buttonSearch();
        Thread.sleep(1000);
        String actual = DriverUtil.getDriver().findElement(By.xpath("//p[@class='MuiTablePagination-displayedRows css-kim0d']")).getText();
        String expected = "0-0 of 0";
        Assert.assertEquals(actual, expected, "search by name failed.");
        Thread.sleep(1000);
        userpage.refreshPage();
    }
}
