package com.parabank.pages;

import com.parabank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By loginLink = By.className("ico-login");

   public void clickOnLoginLink(){
       clickOnElement(loginLink);
   }

}
