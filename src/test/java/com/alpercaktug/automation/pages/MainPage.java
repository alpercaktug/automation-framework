package com.alpercaktug.automation.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MainPage extends BasePage{

    @Value("${app.url}")
    private String appUrl;
    @Autowired
    private LoginPage loginPage;
    @Autowired
    private HomePage homePage;

    public void navigate(){
        navigatePage(appUrl);
        System.out.println("Navigate to: " + appUrl);
    }

    public void performLogin(){
        homePage.clickLogin();
        loginPage.login("admin", "password");
        loginPage.submitLogin();
    }
}
