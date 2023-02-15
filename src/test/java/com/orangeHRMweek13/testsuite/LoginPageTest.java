package com.orangeHRMweek13.testsuite;



import com.orangeHRMweek13.pages.DashboardPage;
import com.orangeHRMweek13.pages.HomePage;
import com.orangeHRMweek13.pages.LoginPage;
import com.orangeHRMweek13.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.runners.testdata.TestData;


public class LoginPageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;

    DashboardPage dashboardPage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
    }

    @Test(dataProvider = "credentials", dataProviderClass = TestData.class)
    public void verifyUserShouldLoginSuccessFully(String username, String password){
        loginPage.loginToApplication(username,password);
        String actualmsg = homePage.verifydashboardtext();
        String expectedmsg = "Dashboard";
        Assert.assertEquals(actualmsg,expectedmsg,"Welcome dashboard");
    }

    @Test(dataProvider = "credentials", dataProviderClass = TestData.class)
    public void verifyThatTheLogoDisplayOnHomePage(String username, String password){
        loginPage.loginToApplication(username,password);
        homePage.clickonLogo();
    }

    @Test(dataProvider = "credentials", dataProviderClass = TestData.class)
    public void verifyUserShouldLogOutSuccessFully(String username, String password){
        loginPage.loginToApplication(username,password);
        dashboardPage.profileLogo();
        dashboardPage.logoout();
        String actualmsg = loginPage.getLoginText();
        String expectedmsg = "Login";
        Assert.assertEquals(actualmsg,expectedmsg,"login panel");

    }

}
