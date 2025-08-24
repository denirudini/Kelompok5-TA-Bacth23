package com.dikahadir.management.usertest.searchuser;
import org.testng.annotations.BeforeMethod;

import com.dikahadir.management.BaseTest;
import com.dikahadir.management.pages.UserPage;
import com.dikahadir.management.utils.DriverUtil;

public class SearchBase extends BaseTest {
    private UserPage userpage;
    @BeforeMethod
    public void searchBy() throws InterruptedException{   
        userpage = new UserPage(DriverUtil.getDriver());
        userpage.buttonMenuManagement();
        Thread.sleep(1000);
        userpage.buttonMenuUser();
        Thread.sleep(1000);
        userpage.buttonFilter();
        Thread.sleep(1000);
 } 
}
