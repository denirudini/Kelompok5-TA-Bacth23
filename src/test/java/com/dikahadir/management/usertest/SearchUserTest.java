package com.dikahadir.management.usertest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.dikahadir.management.BaseTest;
import com.dikahadir.management.pages.UserPage;
import com.dikahadir.management.utils.DriverUtil;

public class SearchUserTest extends BaseTest {
    private UserPage userpage;

    @Test (priority = 1, description = "Test untuk mencari user dari nama (positif)")
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
        String actual = DriverUtil.getDriver().findElement(By.xpath("//p[@class='MuiTablePagination-displayedRows css-kim0d']")).getText();
        String expected = "1-4 of 4";
        Assert.assertEquals(actual, expected, "search by name failed.");
    }

    @Test (priority = 2, description = "Test untuk mencari user dari nik (positif)")
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
        String actual = DriverUtil.getDriver().findElement(By.xpath("//p[@class='MuiTablePagination-displayedRows css-kim0d']")).getText();
        String expected = "1-3 of 3";
        Assert.assertEquals(actual, expected, "search by nik failed..");
    }

    @Test (priority = 3, description = "Test untuk mencari user dengan input nama dan tetapi field nik (negatif)")
    public void searchByNameinputNik() throws InterruptedException{
        userpage = new UserPage(DriverUtil.getDriver());
        userpage.buttonMenuManagement();
        Thread.sleep(1000);
        userpage.buttonMenuUser();
        Thread.sleep(1000);
        userpage.formSearch("D7240017");
        Thread.sleep(1000);
        userpage.buttonSearch();
        Thread.sleep(1000);
        String actual = DriverUtil.getDriver().findElement(By.xpath("//p[@class='MuiTablePagination-displayedRows css-kim0d']")).getText();
        String expected = "0-0 of 0";
        Assert.assertEquals(actual, expected, "Login failed or URL mismatch.");
    }

    @Test (priority = 4, description = "Test untuk mencari user dengan input nik dan tetapi field nama (negatif)")
    public void searchByNikInputName() throws InterruptedException{
        userpage = new UserPage(DriverUtil.getDriver());
        userpage.buttonMenuManagement();
        Thread.sleep(1000);
        userpage.buttonMenuUser();
        Thread.sleep(1000);
        userpage.choseSeachName();
        userpage.choseSearchNik();
        userpage.formSearch("Deni Rudini");
        Thread.sleep(1000);
        userpage.buttonSearch();
        Thread.sleep(1000);
        String actual = DriverUtil.getDriver().findElement(By.xpath("//p[@class='MuiTablePagination-displayedRows css-kim0d']")).getText();
        String expected = "0-0 of 0";
        Assert.assertEquals(actual, expected, "search by name failed.");
        Thread.sleep(1000);
        userpage.refreshPage();
    }

    @Test (priority = 5, description = "Test untuk mencari user filter by unit (positif)")
    public void searchByFilterUnit() throws InterruptedException{   
        userpage = new UserPage(DriverUtil.getDriver());
        userpage.buttonMenuManagement();
        Thread.sleep(1000);
        userpage.buttonMenuUser();
        Thread.sleep(1000);
        userpage.buttonFilter();
        Thread.sleep(1000);
        userpage.formFilterUnit();
        Thread.sleep(1000);
        userpage.choseUnit();
        Thread.sleep(1000);
        userpage.buttonTerapkan();
        Thread.sleep(1000);
        userpage = new UserPage(DriverUtil.getDriver());
        Thread.sleep(1000);
        userpage.formSearch("Andre");
        Thread.sleep(1000);
        userpage.buttonSearch();
        Thread.sleep(2000);
        String actual = DriverUtil.getDriver().findElement(By.xpath("//p[@class='MuiTablePagination-displayedRows css-kim0d']")).getText();
        String expected = "1-6 of 6";
        Assert.assertEquals(actual, expected, "search by filter Unit failed.");
        Thread.sleep(1000);
    }

    @Test (priority = 6, description = "Test untuk mencari user filter by job level(positif)")
    public void searchByFilterJobLevel() throws InterruptedException{   
        userpage = new UserPage(DriverUtil.getDriver());
        userpage.buttonMenuManagement();
        Thread.sleep(1000);
        userpage.buttonMenuUser();
        Thread.sleep(1000);
        userpage.buttonFilter();
        Thread.sleep(1000);
        userpage.formFilterJoblevel();
        Thread.sleep(1000);
        userpage.choseJoblevel();
        Thread.sleep(1000);
        userpage.buttonTerapkan();
        Thread.sleep(1000);
        userpage = new UserPage(DriverUtil.getDriver());
        Thread.sleep(1000);
        userpage.formSearch("Jono");
        Thread.sleep(1000);
        userpage.buttonSearch();
        Thread.sleep(2000);
        String actual = DriverUtil.getDriver().findElement(By.xpath("//p[@class='MuiTablePagination-displayedRows css-kim0d']")).getText();
        String expected = "1-1 of 1";
        Assert.assertEquals(actual, expected, "search by filter Unit failed.");
        Thread.sleep(1000);
    }

    @Test (priority = 7, description = "Test untuk mencari user filter by Type karyawan(positif)")
    public void searchByFilterTipeKaryawan() throws InterruptedException{   
        userpage = new UserPage(DriverUtil.getDriver());
        userpage.buttonMenuManagement();
        Thread.sleep(1000);
        userpage.buttonMenuUser();
        Thread.sleep(1000);
        userpage.buttonFilter();
        Thread.sleep(1000);
        userpage.formFilterTipeKaryawan();
        Thread.sleep(1000);
        userpage.choseTipeKaryawan();
        Thread.sleep(1000);
        userpage.buttonTerapkan();
        Thread.sleep(1000);
        userpage = new UserPage(DriverUtil.getDriver());
        Thread.sleep(1000);
        userpage.formSearch("Alda Amalia");
        Thread.sleep(1000);
        userpage.buttonSearch();
        Thread.sleep(2000);
        String actual = DriverUtil.getDriver().findElement(By.xpath("//p[@class='MuiTablePagination-displayedRows css-kim0d']")).getText();
        String expected = "1-1 of 1";
        Assert.assertEquals(actual, expected, "search by filter Unit failed.");
        Thread.sleep(1000);
    }

    @Test (priority = 8, description = "Test untuk mencari user filter by Posisi Kerja(positif)")
    public void searchByFilterPosisiKerja() throws InterruptedException{   
        userpage = new UserPage(DriverUtil.getDriver());
        userpage.buttonMenuManagement();
        Thread.sleep(1000);
        userpage.buttonMenuUser();
        Thread.sleep(1000);
        userpage.buttonFilter();
        Thread.sleep(1000);
        userpage.formFilterPosisiKerja();
        Thread.sleep(1000);
        userpage.chosePosisiKerja();
        Thread.sleep(1000);
        userpage.buttonTerapkan();
        Thread.sleep(1000);
        userpage = new UserPage(DriverUtil.getDriver());
        Thread.sleep(1000);
        userpage.formSearch("Kelompok 3 SQA22");
        Thread.sleep(1000);
        userpage.buttonSearch();
        Thread.sleep(2000);
        String actual = DriverUtil.getDriver().findElement(By.xpath("//p[@class='MuiTablePagination-displayedRows css-kim0d']")).getText();
        String expected = "1-3 of 3";
        Assert.assertEquals(actual, expected, "search by filter Unit failed.");
        Thread.sleep(1000);
    }

    @Test (priority = 9, description = "Test untuk mencari user filter by Lokasi Kerja(positif)")
    public void searchByFilterLokasiKerja() throws InterruptedException{   
        userpage = new UserPage(DriverUtil.getDriver());
        userpage.buttonMenuManagement();
        Thread.sleep(1000);
        userpage.buttonMenuUser();
        Thread.sleep(1000);
        userpage.buttonFilter();
        Thread.sleep(1000);
        userpage.formFilterLokasiKerja();
        Thread.sleep(1000);
        userpage.choseLokasiKerja();
        Thread.sleep(1000);
        userpage.buttonTerapkan();
        Thread.sleep(1000);
        userpage = new UserPage(DriverUtil.getDriver());
        Thread.sleep(2000);
        String actual = DriverUtil.getDriver().findElement(By.xpath("//p[@class='MuiTablePagination-displayedRows css-kim0d']")).getText();
        String expected = "0-0 of 0";
        Assert.assertEquals(actual, expected, "search by filter Unit failed.");
        Thread.sleep(1000);
    }

    @Test (priority = 10, description = "Test untuk mencari user filter by Status (positif)")
    public void searchByFilterStatus() throws InterruptedException{   
        userpage = new UserPage(DriverUtil.getDriver());
        userpage.buttonMenuManagement();
        Thread.sleep(1000);
        userpage.buttonMenuUser();
        Thread.sleep(1000);
        userpage.buttonFilter();
        Thread.sleep(1000);
        userpage.formFilterStatus();
        Thread.sleep(1000);
        userpage.choseStatus();
        Thread.sleep(1000);
        userpage.buttonTerapkan();
        Thread.sleep(1000);
        userpage = new UserPage(DriverUtil.getDriver());
        Thread.sleep(1000);
        userpage.formSearch("aa");
        Thread.sleep(1000);
        userpage.buttonSearch();
        Thread.sleep(2000);
        String actual = DriverUtil.getDriver().findElement(By.xpath("//p[@class='MuiTablePagination-displayedRows css-kim0d']")).getText();
        String expected = "1-5 of 5";
        Assert.assertEquals(actual, expected, "search by filter Unit failed.");
    }
}
