package com.alpercaktug.automation.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BasePage {

    @Autowired
    private WebDriver webDriver;

    @PostConstruct
    public void initPage(){
        PageFactory.initElements(webDriver, this);
    }

}
