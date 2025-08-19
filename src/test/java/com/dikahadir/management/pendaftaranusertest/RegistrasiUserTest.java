package com.dikahadir.management.pendaftaranusertest;

import com.dikahadir.management.BaseTest;
import com.dikahadir.management.pages.PendaftaranUserPage;
import com.dikahadir.management.utils.DriverUtil;
import org.testng.annotations.Test;
import java.awt.AWTException;


public class RegistrasiUserTest extends BaseTest {
    private PendaftaranUserPage registrasiuser;

    @Test(priority = 1)
    public void AcountInformation() throws InterruptedException, AWTException {
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
        registrasiuser.formNik("D010317");
        registrasiuser.formName("Deni Rudini");
        registrasiuser.formEmail("denirudini99gmail.com");
        registrasiuser.formPassword("Deni!@#$");
        // Form Working Information
        Thread.sleep(1000);
        registrasiuser.formDivisi("!@#$%");
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
    }
}