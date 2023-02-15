package com.orangeHRMweek13.pages;

import com.orangeHRMweek13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AdminPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public AdminPage() {
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//div[@class='oxd-topbar-body']")
    WebElement fivemenu;

    @FindBy(xpath = "//div[@class='oxd-topbar-body']/nav//li[@class='oxd-topbar-body-nav-tab --parent --visited']")
    WebElement Usermanagement;

    @FindBy(xpath = "//div[@class='oxd-topbar-body']/nav/ul//li[2]//span[@class='oxd-topbar-body-nav-tab-item']" )
    WebElement Jobtab;

    @FindBy(xpath = "//div[@class='oxd-topbar-body']/nav/ul//li[3]//span[@class='oxd-topbar-body-nav-tab-item']")
    WebElement organsiztiontab;

    public void clickonFiveMenu(){
       log.info("Click on any of the menu from listed"+fivemenu.toString());
        getTextFromElement(fivemenu);
    }
    public void clickOnUsermanagement (){
        log.info("Click on management tab"+Usermanagement.toString());
        getTextFromElement(Usermanagement);
    }
    public void clickOnJobtab (){
       log.info("click on Job tab"+Jobtab.toString());
        getTextFromElement(Jobtab);
    }
    public void clickOnOrgansiationtab (){
       log.info("Click on organsiationtab"+organsiztiontab.toString());
        getTextFromElement(organsiztiontab);
    }

}
