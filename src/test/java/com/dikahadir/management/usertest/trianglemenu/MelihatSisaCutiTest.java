package com.dikahadir.management.usertest.trianglemenu;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.dikahadir.management.BaseTest;
import com.dikahadir.management.pages.UserPage;
import com.dikahadir.management.utils.DriverUtil;

public class MelihatSisaCutiTest extends BaseTest {
    private UserPage userpage;

    @Test(priority = 1, description = "Test untuk melihat sisa cuti positif")
    public void melihatSisaCuti() throws InterruptedException{
        userpage = new UserPage(DriverUtil.getDriver());
        userpage.buttonMenuManagement();
        Thread.sleep(1000);
        userpage.buttonMenuUser();
        Thread.sleep(1000);
        userpage.triangleMenuCuti();
        Thread.sleep(1000);
        userpage.buttonSisaCuti();
        Thread.sleep(1000);
        // Verifying the alert dialog title
        String actual = DriverUtil.getDriver().findElement(By.xpath("//h2[@id='alert-dialog-slide-title']")).getText();
        String expected = "Lihat Sisa Cuti 1 jemes peete";
        System.out.println("berhasil " + actual);
        Assert.assertEquals(actual, expected, "Gagal melihat sisa cuti");
        Thread.sleep(1000);
        userpage.buttonCloseCuti();        
    }
    
}
