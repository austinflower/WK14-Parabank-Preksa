package com.parabank.pages;

import com.parabank.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By registerlink = By.xpath("//div[@id='loginPanel']/p[2]/a");


    public void clickonregister(){
        clickOnElement(registerlink);
    }
    public void fillinregisterform(){
        driver.findElement(By.name("customer.firstName")).sendKeys("Tom1");
        driver.findElement(By.name("customer.lastName")).sendKeys("Smith1");
        driver.findElement(By.name("customer.address.street")).sendKeys("11 Main Street");
        driver.findElement(By.name("customer.address.city")).sendKeys("Boston1");
        driver.findElement(By.name("customer.address.state")).sendKeys("State1");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("12345");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("123-999-9999");
        driver.findElement(By.name("customer.ssn")).sendKeys("888-88-8888");
        driver.findElement(By.name("customer.username")).sendKeys("TomSmith108");
        driver.findElement(By.name("customer.password")).sendKeys("4444");
        driver.findElement(By.name("repeatedPassword")).sendKeys("4444");
        clickOnElement(By.xpath("//input[@value='Register']"));

    }



}
