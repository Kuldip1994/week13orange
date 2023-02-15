package com.orangeHRMweek13.pages;


import com.orangeHRMweek13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

   @FindBy(name = "username")
    WebElement Username;

    @FindBy(name ="password")
    WebElement Password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement Loginbutton;

    @FindBy(xpath = "//h5[text()='Login']")
    WebElement LoginText;

    public void enterUsername(String username){
        sendTextToElement(Username,username);
        log.info("Enter your username"+Username.toString());
    }

    public void enterPassword(String password){
        sendTextToElement(Password,password);
        log.info("Enter your password"+password.toString());
    }
    public void clickOnLoginButton (){
        log.info("click on login button"+Loginbutton.toString());
        clickOnElement(Loginbutton);
    }
    public String getLoginText (){
        return getTextFromElement(LoginText);

    }

    public void loginToApplication (String username, String password){
        enterUsername(username);
        enterPassword(password);
        clickOnLoginButton();

    }



}
