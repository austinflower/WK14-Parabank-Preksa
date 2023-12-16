package com.parabank.testsuite;


import com.parabank.pages.HomePage;
import com.parabank.pages.LoginPage;
import com.parabank.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

       loginPage.getcustomerlogin();
        String actualaccount = driver.findElement(By.xpath("//div[@id='rightPanel']/div/div/h1")).getText();
        String ExpectedText = "Accounts Overview";
        Assert.assertEquals(actualaccount, ExpectedText);
    }

    @Test
    public void verifyTheErrorMessage() {
        loginPage.getcustomerlogininvalid();
        String actualerror = driver.findElement(By.xpath("//div[@id='rightPanel']/p")).getText();
        String expectederror = "An internal error has occurred and has been logged.";
        Assert.assertEquals(actualerror,expectederror);

    }
    @Test
    public void userShouldLogOutSuccessfully(){
        loginPage.validloginidpwd();
        String actuallogout =driver.findElement(By.xpath("//div[@id='leftPanel']/h2")).getText();
        String expectedlogout ="Customer Login";
        Assert.assertEquals(actuallogout,expectedlogout);

    }

}
