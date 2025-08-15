package com.dikahadir.management.pendaftaranusertest;

import com.dikahadir.management.BaseTest;
import com.dikahadir.management.pages.PendaftaranUserPage;
import com.dikahadir.management.utils.DriverUtil;

import org.testng.annotations.Test;
import java.awt.AWTException;


public class RegistrasiUserTest extends BaseTest {
    private PendaftaranUserPage registrasiuser;

    @Test
public void AcountInformation() throws InterruptedException, AWTException {
        registrasiuser = new PendaftaranUserPage(DriverUtil.getDriver());
        Thread.sleep(1000);
        registrasiuser.buttonMenuManagement();
        Thread.sleep(1000);
        registrasiuser.buttonMenuPendaftaranUser();
        Thread.sleep(2000);
        try {
            registrasiuser.fieldImageEmployee();
        } catch (AWTException e) {
            e.printStackTrace();
            throw new RuntimeException("Error during image upload", e);
        }
        Thread.sleep(1000);
        registrasiuser.formNik("D010317");
        
    }
}
