package com.parabank.pages;

import com.parabank.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    public String getWelcomeText(){

        return getTextFromElement(welcomeText);
  }
    public void getcustomerlogin(){
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("TomSmith108");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("4444");
        clickOnElement(By.xpath("//input[@value='Log In']"));
    }
    public void getcustomerlogininvalid(){
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("TomSmith1055");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("44445");
        clickOnElement(By.xpath("//input[@value='Log In']"));
    }
    public void validloginidpwd(){
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("TomSmith108");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("4444");
        clickOnElement(By.xpath("//input[@value='Log In']"));
        clickOnElement(By.xpath("//div[@id='leftPanel']/ul/li[8]/a"));

    }









}
