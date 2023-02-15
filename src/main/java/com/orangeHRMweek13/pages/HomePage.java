package com.orangeHRMweek13.pages;


import com.orangeHRMweek13.utility.Utility;
import javafx.scene.control.Tab;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.lang.annotation.Repeatable;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup

    @FindBy(xpath = "//div[@class='oxd-brand-logo']//img[@alt='client brand logo']")
    WebElement orangeHRMlogo;

    @FindBy(xpath = "//div[@class='oxd-sidepanel-body']/ul/li//a[@href='/web/index.php/admin/viewAdminModule']")
    WebElement AdminTab;

    @FindBy(xpath = "//div[@class='oxd-sidepanel-body']/ul/li[2]//span[text()='PIM']")
    WebElement PIMTab;

    @FindBy(xpath = "//div[@class='oxd-sidepanel-body']/ul/li[2]//a[@href='/web/index.php/pim/viewPimModule']")
    WebElement LeaveTab;

    @FindBy(xpath = "//div[@class='oxd-sidepanel-body']/ul/li[8]//a[@href='/web/index.php/dashboard/index']\")")
    WebElement DashboardTab;

    @FindBy(xpath = "//div[@class='oxd-topbar-header']/div//h6[text()='Dashboard']")
    WebElement DashboardText;

    public String clickonLogo(){
        return getTextFromElement(orangeHRMlogo);

    }

    public void clickOnadminTab(){
        clickOnElement(AdminTab);
        log.info("Click on admin tab"+AdminTab.toString());
    }
    public void clickonPimtab(){
        clickOnElement(PIMTab);
        log.info("Click on PIM tab"+PIMTab.toString());
    }
    public void clickOnleavetab (){
        clickOnElement(LeaveTab);
        log.info("Click on leabe tab"+LeaveTab.toString());
    }
    public void clickOndashboardtab() {
        clickOnElement(DashboardTab);
        log.info("Click on dashboard tab"+DashboardTab.toString());
    }

    public String verifydashboardtext() {
        return getTextFromElement(DashboardText);
    }





}
