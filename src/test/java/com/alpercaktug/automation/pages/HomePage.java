package com.alpercaktug.automation.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomePage extends BasePage{

    @FindBy(how = How.LINK_TEXT, using = "Login")
    public WebElement lnkLogin;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public WebElement lnkEmployeeList;

    @FindBy(how = How.LINK_TEXT, using="Employee Details")
    WebElement lnkEmployeeDetails;

    public LoginPage clickLogin() {
        lnkLogin.click();
        System.out.println("Click Login");
        return new LoginPage();
    }

    public void ClickEmployeeList() {lnkEmployeeList.click();}

    public boolean isEmployeeDetailsExist() {return lnkEmployeeDetails.isDisplayed();}


}
