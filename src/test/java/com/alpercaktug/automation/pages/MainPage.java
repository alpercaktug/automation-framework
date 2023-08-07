package com.alpercaktug.automation.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MainPage extends BasePage{

    @Autowired
    private LoginPage loginPage;
    @Autowired
    private HomePage homePage;
    @Autowired
    private WebDriver webDriver;

    public void performLogin(){
        webDriver.navigate().to("http://eaapp.somee.com");
        homePage.clickLogin();
        loginPage.login("admin", "password");
        loginPage.submitLogin();
    }
}
