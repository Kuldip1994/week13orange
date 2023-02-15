package com.orangeHRMweek13.pages;

import com.orangeHRMweek13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public DashboardPage() {PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='oxd-topbar-header']/div//h6[text()='Dashboard']")
    WebElement DashboardText;

    @FindBy(xpath = "//div[@class='oxd-topbar-header-userarea']/ul/li/span//img[@alt='profile picture']")
    WebElement profilelogo;

    @FindBy(xpath = "//div[@class='oxd-topbar-header-userarea']/ul/li/ul/li[4]//a[@href='/web/index.php/auth/logout']")
    WebElement logoout;

    public String verifydashboardtab() {
        log.info("getting text of " + DashboardText.toString());
        return getTextFromElement(DashboardText);

    }

    public void profileLogo() {
        clickOnElement(profilelogo);
        log.info("Getting profile picture from" + profilelogo.toString());

    }

    public void logoout() {
        clickOnElement(logoout);
        log.info("click on logout"+logoout.toString());

    }
}
