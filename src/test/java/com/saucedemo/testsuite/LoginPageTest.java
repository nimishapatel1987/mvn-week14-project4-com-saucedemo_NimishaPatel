package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsOnPage;
import com.saucedemo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    ProductsOnPage productsOnPage = new ProductsOnPage();


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        String expectedText = "PRODUCTS";
        String actualMessage = getTextFromElement(By.xpath("//span[@class = 'title']"));
    }

    @Test
    public void verifyThatSixProductsAreDisplayedonPage(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
       int actualNumber = productsOnPage.sixProducts();
        int expectedNumber = 6;
      //  Assert.assertEquals(actualNumber, expectedNumber);


    }

}
