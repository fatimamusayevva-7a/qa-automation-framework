package com.qaframework.tests.ui;

import com.qaframework.pages.LoginPage;
import com.qaframework.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        driver = DriverManager.getDriver();
        driver.get("https://demoqa.com/login");
        loginPage = new LoginPage();
    }

    @Test
    public void testValidLogin() {
        loginPage.login("testuser", "Test@1234");
        Assert.assertEquals(loginPage.getPageTitle(), "DEMOQA");
    }

    @Test
    public void testInvalidLogin() {
        loginPage.login("wronguser", "wrongpass");
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/login");
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }
}