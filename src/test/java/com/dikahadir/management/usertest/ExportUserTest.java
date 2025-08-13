package com.dikahadir.management.usertest;

import com.dikahadir.management.BaseTest;
import com.dikahadir.management.pages.UserPage;
import com.dikahadir.management.utils.DriverUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.time.Duration;

public class ExportUserTest extends BaseTest {

    private UserPage userpage;
    @Test(priority = 1)
    public void exportUserTest() throws InterruptedException {
        userpage = new UserPage(DriverUtil.getDriver());
        userpage.buttonMenuManagement();
        Thread.sleep(1000);
        userpage.buttonMenuUser();
        Thread.sleep(1000);
        userpage.formSearch("sas");
        userpage.buttonSearch();
        userpage.buttonExport();

        String expectedFileName = "export-users.xlsx";
        String downloadDir = System.getProperty("user.home") + File.separator + "Downloads";
        File folder = new File(downloadDir);
        WebDriverWait wait = new WebDriverWait(DriverUtil.getDriver(), Duration.ofSeconds(15));
        try {
            wait.until(driver -> {
                File[] files = folder.listFiles((dir, name) -> name.equals(expectedFileName));
                return files != null && files.length > 0;
            });
            File downloadedFile = new File(downloadDir, expectedFileName);
            Assert.assertTrue(downloadedFile.exists(), "File tidak ditemukan.");
            Assert.assertTrue(downloadedFile.length() > 0, "File kosong.");
            System.out.println("Notifikasi: Download " + expectedFileName + " berhasil!");
        } catch (Exception e) {
            System.err.println("Notifikasi: Download " + expectedFileName + " gagal!");
            Assert.fail("Gagal mengunduh file: " + e.getMessage());
        }
    }
}