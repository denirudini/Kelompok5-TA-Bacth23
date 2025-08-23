package com.dikahadir.management.usertest.trianglemenu;

import org.testng.annotations.Test;

import com.dikahadir.management.BaseTest;
import com.dikahadir.management.pages.EditUserPage;
import com.dikahadir.management.pages.UserPage;
import com.dikahadir.management.utils.DriverUtil;

public class EditUserTest extends BaseTest {
    private UserPage userpage;
    private EditUserPage editUser;
    @Test(priority = 1, description = "test untuk mengedit user positif")
    public void editUser() throws InterruptedException {
        userpage = new UserPage(DriverUtil.getDriver());
        userpage.buttonMenuManagement();
        Thread.sleep(1000);
        userpage.buttonMenuUser();
        Thread.sleep(1000);
        userpage.triangleMenu();
        Thread.sleep(1000);
        userpage.buttonEditUser();
        Thread.sleep(1000);
        editUser = new EditUserPage(DriverUtil.getDriver());
        Thread.sleep(1000);
        // Assuming the EditUserPage has methods to fill in the form
        editUser.formNik("D7240019");
        Thread.sleep(2000);
        editUser.formName("Deni Rudini Updated");
        Thread.sleep(2000);
        editUser.formEmail("yuhumail@mail.com");
        Thread.sleep(2000);
        
    }
}
