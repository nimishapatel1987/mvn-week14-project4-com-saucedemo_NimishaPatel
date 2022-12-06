package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsOnPage extends Utility {

    By userName = By.name("user-name");
    By password = By.name("password");
    By loginButton = By.xpath("//input[@name = 'login-button']");
    By sixProductsLocator = By.className("inventory_item");

    public void enterUserName(String userNameText){
        sendTextToElement(userName,userNameText);
    }
    public void enterPassword(String passwordText){
        sendTextToElement(password,passwordText);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public int sixProducts() {
        List<WebElement> actualNumberElement = driver.findElements(sixProductsLocator);
        int actualNumber = actualNumberElement.size();
        return actualNumber;
    }
}
