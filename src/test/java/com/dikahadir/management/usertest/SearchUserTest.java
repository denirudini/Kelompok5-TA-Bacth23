package com.dikahadir.management.usertest;

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
        String actual = driver.getCurrentUrl();
        String expected = "https://magang.dikahadir.com/management/user?fullname%5B%24like%5D=%25sas%2";
        Assert.assertEquals(actual, expected, "Login failed or URL mismatch.");
        Thread.sleep(1000);
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
        String actual = driver.getCurrentUrl();
        String expected = "https://magang.dikahadir.com/management/user?nik%5B%24like%5D=%25D7240017%25";
        Assert.assertEquals(actual, expected, "Login failed or URL mismatch.");
        Thread.sleep(1000);
    }
    // @Test (priority = 3)
    // public void searchByFilter() throws InterruptedException{
    //     userpage = new UserPage(DriverUtil.getDriver());
    // }
   
}
