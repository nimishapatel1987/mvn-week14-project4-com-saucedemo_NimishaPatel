package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends Utility {
    By loginpage = By.xpath("//div[@class='login_logo']");
    By userName = By.name("user-name");
    By password = By.name("password");
    By loginButton = By.xpath("//input[@name = 'login-button']");
    By actualMessage = By.xpath("//span[contains(text(),'Products')]");

    By ListOfItemOnScreen = By.className("inventory_list");


    public void enterUserName(String userNameText) {
        sendTextToElement(userName, userNameText);
    }

    public void enterPassword(String passwordText) {
        sendTextToElement(password, passwordText);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String verifyMessage() {
        return getTextFromElement(actualMessage);
    }

   // public int verifyListOfItemOnScreen() {
     //   return listOfElement.size();
    }




