package com.orangeHRMweek13.pages;

import com.orangeHRMweek13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AddUserPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public AddUserPage() {
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]" )
    WebElement userRolldropdown;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeenameField;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div/div[1]//input[@class='oxd-input oxd-input--active']")
    WebElement usernameField;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[4]/div/div[2]")
    WebElement statusdropdown;

    @FindBy(xpath = "//div[@class='orangehrm-container']/div/div/div[3]/div/div[6]//button[2]" )
    WebElement edituser;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div/div[5]/div//div[@class='oxd-checkbox-wrapper']")
    WebElement tickboxforpassword;

    @FindBy(xpath = "//div[@class='oxd-form-row user-password-row']/div/div[1]/div//input[@type='password']" )
    WebElement password;

    @FindBy(xpath = "//div[@class='oxd-form-row user-password-row']/div/div[2]/div/div[2]//input[@type='password']")
    WebElement confirmPassword;

    @FindBy(xpath = "//div[@class='oxd-form-actions']/button[2]")
    WebElement savebutton;

    @FindBy(xpath = "//div[@class='oxd-form-actions']/button[1]" )
    WebElement cancelbutton;

    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]")
    WebElement Viewadmindrop;

    @FindBy(xpath = "//*[@class='oxd-autocomplete-wrapper']//*[contains(text(),'Dominic  Chase')]')]")
    WebElement DominicChase;


    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Disabled')]")
    WebElement Disablestatus;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div/div[4]")
    WebElement UserAddonAdd;

    public void enterusername(String username) {
       log.info("Enter username" + usernameField.toString());
        sendTextToElement(usernameField, username);
    }
    public void adduseronadd(String username){
        sendTextToElement(UserAddonAdd,username);
    }

    public void enterpassword(String Password) {
        log.info(("Enter password"+usernameField.toString()));
        sendTextToElement(password, Password);


    }

    public void confirmpassword(String ConfirmPassword) {
        log.info("re-enter you password"+confirmPassword);
        sendTextToElement(confirmPassword, ConfirmPassword);
    }

    public void clickOnSavebutton() {
        log.info("click on save button" + savebutton.toString());
        clickOnElement(savebutton);
    }

    public void cancelButton() {
        log.info("Click on cancel button" + cancelbutton.toString());
        clickOnElement(cancelbutton);
    }

    public void editButton() {
        log.info("Click on edit button" + edituser.toString());
        clickOnElement(edituser);
    }

    public void clickonTickforPassword() {
       log.info("click on the tick button" + tickboxforpassword.toString());
        clickOnElement(tickboxforpassword);
    }

    public void addUserrolldownmenu() throws InterruptedException {
        clickOnElement(userRolldropdown);
        Thread.sleep(1000);
        clickOnElement(Viewadmindrop);
    }

    public void addemployeenameField() throws InterruptedException {
        sendTextToElement(employeenameField, "Dominic  Chase");
        Thread.sleep(3000);
        clickOnElement(DominicChase);
    }

    public void addStatusDropdown() throws InterruptedException {
        clickOnElement(statusdropdown);
        Thread.sleep(1000);
        clickOnElement(Disablestatus);

    }







}
