package com.parabank.testbase;


import com.parabank.propertyreader.PropertyReader;
import com.parabank.utility.Utility;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod (alwaysRun = true)
    public void setUp(){
        selectBrowser(browser);
    }
/*
    @AfterMethod
    public void tearDown(){
      closeBrowser();
    }*/


}
