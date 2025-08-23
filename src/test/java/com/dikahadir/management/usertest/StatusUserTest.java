package com.dikahadir.management.usertest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.dikahadir.management.BaseTest;
import com.dikahadir.management.pages.UserPage;
import com.dikahadir.management.utils.DriverUtil;

public class StatusUserTest extends BaseTest {
    private UserPage userpage;
    @Test (priority = 1)
    public void activeStatusUser() throws InterruptedException{
        userpage = new UserPage(DriverUtil.getDriver());
        userpage.buttonMenuManagement();
        Thread.sleep(1000);
        userpage.buttonMenuUser();
        Thread.sleep(1000);
        userpage.buttonStatusNonActive();
        Thread.sleep(2000);
        String actual = DriverUtil.getDriver().findElement(By.xpath("//div[@role='alert']")).getText();
        String expected = "User diaktifkan";
        System.out.println("berhasil "+ actual );
        Assert.assertEquals(actual,expected, "Gagal diaktifkan");
        userpage.refreshPage();
    }

    @Test (priority = 2)
    public void nonactiveStatusUser() throws InterruptedException{
        userpage = new UserPage(DriverUtil.getDriver());
        userpage.buttonMenuManagement();
        Thread.sleep(1000);
        userpage.buttonMenuUser();
        Thread.sleep(1000);
        userpage.buttonStatusActive();;
        Thread.sleep(2000);
        String actual = DriverUtil.getDriver().findElement(By.xpath("//div[@role='alert']")).getText();
        String expected = "User dinonaktifkan";
        System.out.println("berhasil "+ actual );
        Assert.assertEquals(actual,expected, "Gagal dinonaktifkan");
        userpage.refreshPage();
    }

    @Test (priority = 3)
    public void activeStatusProject() throws InterruptedException{
        userpage = new UserPage(DriverUtil.getDriver());
        userpage.buttonMenuManagement();
        Thread.sleep(1000);
        userpage.buttonMenuUser();
        Thread.sleep(1000);
        userpage.buttonStatusNonProject();
        Thread.sleep(2000);
        String actual = DriverUtil.getDriver().findElement(By.xpath("//div[@role='alert']")).getText();
        String expected = "Project diaktifkan";
        System.out.println("berhasil "+ actual );
        Assert.assertEquals(actual,expected, "Gagal diaktifkan");
        userpage.refreshPage();
    }

    @Test (priority = 4)
    public void nonactiveStatusProject() throws InterruptedException{
        userpage = new UserPage(DriverUtil.getDriver());
        userpage.buttonMenuManagement();
        Thread.sleep(1000);
        userpage.buttonMenuUser();
        Thread.sleep(1000);
        userpage.buttonStatusProject();;
        Thread.sleep(2000);
        String actual = DriverUtil.getDriver().findElement(By.xpath("//div[@role='alert']")).getText();
        String expected = "Project dinonaktifkan";
        System.out.println("berhasil "+ actual );
        Assert.assertEquals(actual,expected, "Gagal dinonaktifkan");
        userpage.refreshPage();
    }
}
