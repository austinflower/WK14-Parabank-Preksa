package com.parabank.testsuite;

import com.parabank.pages.LoginPage;
import com.parabank.pages.RegisterPage;
import com.parabank.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyThatSigningUpPageDisplay(){
        registerPage.clickonregister();
        String actualsignin =driver.findElement(By.xpath("//div[@id='rightPanel']/h1")).getText();
        String expectedsignin ="Signing up is easy!";
        Assert.assertEquals(actualsignin,expectedsignin);
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        registerPage.clickonregister();
        registerPage.fillinregisterform();

        String actualaccount = driver.findElement(By.xpath("//div[@id='rightPanel']/p")).getText();
        String expectedaccount = "Your account was created successfully. You are now logged in.";
        Assert.assertEquals(actualaccount,expectedaccount);
    }

}
