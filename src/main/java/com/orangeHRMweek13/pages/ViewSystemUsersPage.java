package com.orangeHRMweek13.pages;

import com.google.j2objc.annotations.Weak;
import com.orangeHRMweek13.utility.Utility;
import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.helpers.QuietWriter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewSystemUsersPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public ViewSystemUsersPage() {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//h5[text()='System Users']")
    WebElement systemuser;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div/div[1]//input[@class='oxd-input oxd-input--active']")
    WebElement usernameField;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[4]/div/div[2]")
    WebElement statusdropdown;

    @FindBy(xpath = "//div[@class='oxd-table-filter-area']/form/div/div/div[2]/div/div/div/div//div[@class='oxd-select-text-input']")
    WebElement userRolldropdown;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeenameField;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[4]/div/div[2]")
    WebElement enstatusdropdown;

    @FindBy(xpath = "//div[@class='oxd-form-actions']//button[@type='submit']")
    WebElement searchbutton;

    @FindBy(xpath = "//div[@class='oxd-form-actions']//button[@type='button']")
    WebElement resetbutton;

    @FindBy(xpath = "//div[@class='orangehrm-header-container']//button[@type='button']")
    WebElement addbutton;

    @FindBy(xpath = "//div[@class='orangehrm-card-container']//h6[text()='Add User']")
    WebElement verifyaddbuttontext;

    @FindBy(xpath = "//div[@class='orangehrm-container']/div/div/div[3]/div/div[6]//button[@type='button']//i[@class='oxd-icon bi-trash']")
    WebElement deletebutton;

    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]")
    WebElement Viewadmindrop;

    @FindBy(xpath = "//*[@class='oxd-autocomplete-wrapper']//*[contains(text(),'Odis  Adalwin')]")
    WebElement odis;

    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Disabled')]")
    WebElement Disablestatus;

    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Enabled')]")
    WebElement Enablestatus;

    @FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/div/button//i[@class='oxd-icon bi-trash-fill oxd-button-icon']")
    WebElement deleteuser;

    @FindBy(xpath = "//div[@class='oxd-table-card']")
    WebElement resultfound;

    @FindBy(xpath = "//div[@class='oxd-table-body']/div[1]/div/div//div/label//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input']")
    WebElement usercheckbox;

    @FindBy(xpath = "//div[@class='orangehrm-modal-footer']/button[2]//i[@class='oxd-icon bi-trash oxd-button-icon']")
    WebElement deletcomplete;

    @FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/span[text()='No Records Found']")
    WebElement verifynorecord;

    public String verifysystemtext() {
        log.info("getting text of " + systemuser.toString());
        return getTextFromElement(systemuser);
    }

    public String verifyresult() {
        log.info("getting text of " + resultfound.toString());
        return getTextFromElement(resultfound);
    }

    public String verifyRecord() {
        log.info("getting text of " + verifynorecord.toString());
        return getTextFromElement(verifynorecord);
    }

    public String verifyaddbuttonText() {
        log.info("getting text of " + verifyaddbuttontext.toString());
        return getTextFromElement(verifyaddbuttontext);
    }

    public void enterusername(String username) {
        sendTextToElement(usernameField, username);
        log.info("getting text of " + usernameField.toString());
    }

    public void deletecompletely() {
        clickOnElement(deletcomplete);
        log.info("this will delete " + deletcomplete.toString());
    }

    public void Usercheckbox() {
        clickOnElement(usercheckbox);
        log.info("Click on the checkbox." + usercheckbox.toString());
    }

    public void Userrolldown() throws InterruptedException {
        clickOnElement(userRolldropdown);
        Thread.sleep(1000);
        clickOnElement(Viewadmindrop);
    }

    public void employeenameField() throws InterruptedException {
        sendTextToElement(employeenameField, "0");
        Thread.sleep(3000);
        clickOnElement(odis);
    }

    public void StatusDropdown() throws InterruptedException {
        clickOnElement(statusdropdown);
        Thread.sleep(1000);
        clickOnElement(Disablestatus);
    }

    public void enablestatus() throws InterruptedException {
        clickOnElement(enstatusdropdown);
        Thread.sleep(1000);
        clickOnElement(Enablestatus);
    }

    public void deleteuserButton() {
        clickOnElement(deleteuser);
        log.info("delete user" + deleteuser.toString());
    }

    public void clickOnSearchButton() {
        clickOnElement(searchbutton);
        log.info("Click on search button " + searchbutton.toString());
    }

    public void clickOnresetbutton() {
        clickOnElement(resetbutton);
        log.info("Click on reset button" + resetbutton.toString());
    }

    public void clickonAddbutton() {
        clickOnElement(addbutton);
        log.info("Click on add button " + addbutton.toString());
    }

    public void clickondeletebutton() {
        clickOnElement(deletebutton);
        log.info("Click on delete button" + deletebutton.toString());
    }


}
