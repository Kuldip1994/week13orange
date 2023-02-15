package com.orangeHRMweek13.testsuite;

import com.orangeHRMweek13.pages.*;
import com.orangeHRMweek13.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.runners.testdata.TestData;

public class UserTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    AddUserPage addUserPage;
    ViewSystemUsersPage viewSystemUsersPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        addUserPage = new AddUserPage();
        viewSystemUsersPage = new ViewSystemUsersPage();
    }

    @Test(dataProvider = "credentials", dataProviderClass = TestData.class)
    public void adminShouldAddUserSuccessFully(String username, String password) throws InterruptedException {
        loginPage.loginToApplication(username, password);
        homePage.clickOnadminTab();
        String actualMsg = viewSystemUsersPage.verifysystemtext();
        String expectedMsg = "System Users";
        Assert.assertEquals(actualMsg, expectedMsg, "system user text verified");
        viewSystemUsersPage.clickonAddbutton();
        String actualMsg1 = viewSystemUsersPage.verifyaddbuttonText();
        String expectedMsg1 = "Add User";
        Assert.assertEquals(actualMsg1, expectedMsg1, "add user text verified");
        addUserPage.addUserrolldownmenu();
        addUserPage.addemployeenameField();
        addUserPage.adduseronadd("John123");
        addUserPage.addStatusDropdown();
        addUserPage.enterpassword("Skyline-12");
        addUserPage.confirmpassword("Skyline-12");
        addUserPage.clickOnSavebutton();
    }

    @Test(dataProvider = "credentials", dataProviderClass = TestData.class)
    public void searchTheUserCreatedAndVerifyIt(String username, String password) throws InterruptedException {
        loginPage.loginToApplication(username, password);
        homePage.clickOnadminTab();
        String actualMsg = viewSystemUsersPage.verifysystemtext();
        String expectedMsg = "System Users";
        Assert.assertEquals(actualMsg, expectedMsg, "system user text verified");
        viewSystemUsersPage.enterusername("paul123");
        viewSystemUsersPage.Userrolldown();
        viewSystemUsersPage.StatusDropdown();
        viewSystemUsersPage.clickOnSearchButton();
        viewSystemUsersPage.verifyresult();

    }
    @Test(dataProvider = "credentials", dataProviderClass = TestData.class)
    public void verifyThatAdminShouldDeleteTheUserSuccessFully(String username, String password) throws InterruptedException {
        loginPage.loginToApplication(username, password);
        homePage.clickOnadminTab();
        homePage.clickOnadminTab();
        String actualMsg = viewSystemUsersPage.verifysystemtext();
        String expectedMsg = "System Users";
        Assert.assertEquals(actualMsg, expectedMsg, "system user text verified");
        viewSystemUsersPage.enterusername("jasdf123");
        viewSystemUsersPage.Userrolldown();
        viewSystemUsersPage.enablestatus();
        viewSystemUsersPage.clickOnSearchButton();
        viewSystemUsersPage.Usercheckbox();
        viewSystemUsersPage.deleteuserButton();
        viewSystemUsersPage.deletecompletely();
        viewSystemUsersPage.verifyRecord();

    }
    @Test(dataProvider = "credentials", dataProviderClass = TestData.class)
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound(String username, String password) throws InterruptedException {
        loginPage.loginToApplication(username, password);
        homePage.clickOnadminTab();
        homePage.clickOnadminTab();
        String actualMsg = viewSystemUsersPage.verifysystemtext();
        String expectedMsg = "System Users";
        Assert.assertEquals(actualMsg, expectedMsg, "system user text verified");
        viewSystemUsersPage.enterusername("Admin1");
        viewSystemUsersPage.Userrolldown();
        viewSystemUsersPage.enablestatus();
        viewSystemUsersPage.clickOnSearchButton();
        viewSystemUsersPage.verifyRecord();

    }

}
