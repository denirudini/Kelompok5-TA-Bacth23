package com.dikahadir.management.pendaftaranuser;
import com.dikahadir.management.BaseTest;
import com.dikahadir.management.pages.PendaftaranUserPage;
import com.dikahadir.management.pages.UserPage;
import com.dikahadir.management.utils.DriverUtil;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.awt.AWTException;


public class RegistrasiUserTest extends BaseTest {
    private PendaftaranUserPage registrasiuser;
    private UserPage userpage;

    @Test(priority = 1)
    public void pendaftaranUser() throws InterruptedException, AWTException {
        registrasiuser = new PendaftaranUserPage(DriverUtil.getDriver());
        Thread.sleep(1000);
        registrasiuser.buttonMenuManagement();
        Thread.sleep(1000);
        registrasiuser.buttonMenuPendaftaranUser();
        try {
            registrasiuser.fieldImageEmployee();
        } catch (AWTException e) {
            e.printStackTrace();
            throw new RuntimeException("Error during image upload", e);
        }
        Thread.sleep(1000);
        registrasiuser.formNik("D7240019");
        registrasiuser.formName("Deni Rudini");
        registrasiuser.formEmail("denirudini@gmail.com");
        registrasiuser.formPassword("Deni!@#$");

        // Form Working Information
        Thread.sleep(1000);
        registrasiuser.formDivisi("!Finance");
        Thread.sleep(1000);
        registrasiuser.formUnit("11 aaaa");
        Thread.sleep(1000);
        registrasiuser.formPosisiKerja("BNC Agent Sosial");
        Thread.sleep(1000);
        registrasiuser.formJabatan("Area Sales Manager");
        Thread.sleep(1000);
        registrasiuser.formAtasan("Wilder");
        Thread.sleep(1000);
        registrasiuser.formAtasanClientV3("Damora");
        Thread.sleep(1000);
        registrasiuser.formTypeKontrak("Magang");

        // Pengaturan Absensi
        Thread.sleep(1000);
        registrasiuser.formLokasiKerja("Dika");
        Thread.sleep(1000);
        registrasiuser.formTipeShift("shift");
        Thread.sleep(1000);
        registrasiuser.formJadwalKerja("Bank");
        Thread.sleep(1000);
        registrasiuser.formSelfie("No Selfie");
        Thread.sleep(1000);
        registrasiuser.formJumlahCuti("12");
        registrasiuser.buttonSubmit();
        Thread.sleep(1000);

        // Validasi Pendaftaran User dengan search NIK
        userpage = new UserPage(DriverUtil.getDriver());
        userpage.buttonMenuManagement();
        Thread.sleep(1000);
        userpage.buttonMenuUser();
        Thread.sleep(1000);
        userpage.choseSeachName();
        userpage.choseSearchNik();
        userpage.formSearch("D7240019");
        Thread.sleep(1000);
        userpage.buttonSearch();
        String actual = DriverUtil.getDriver().findElement(By.xpath("//h5[normalize-space()='Deni Rudini']")).getText();
        String expected = "Deni Rudini";
        System.out.println("berhasil ditemukan user : " + actual);
        Assert.assertEquals(actual, expected, "User registration Gagal atau user tidak ditemukan");
        
    }
}