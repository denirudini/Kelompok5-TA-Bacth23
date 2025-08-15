package com.dikahadir.management.usertest;

import org.testng.annotations.Test;

import com.dikahadir.management.BaseTest;
import com.dikahadir.management.pages.UserPage;
import com.dikahadir.management.utils.DriverUtil;

public class TriangleMenuTest extends BaseTest {
    private UserPage userpage;

    @Test(priority = 1)
    public void triangleMenu() throws InterruptedException{
        userpage = new UserPage(DriverUtil.getDriver());
        userpage.buttonMenuManagement();
        Thread.sleep(1000);
        userpage.buttonMenuUser();
        Thread.sleep(1000);
        userpage.triangleMenu();
        
    }
    
}
