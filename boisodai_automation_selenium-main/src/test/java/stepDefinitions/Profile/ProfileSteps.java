package stepDefinitions.Profile;

import ReusableMethods.TestData;
import base.PageObjectManager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import locators.ProfileObjects;
import org.openqa.selenium.WebDriver;
import utils.DriverSetup;

import java.io.IOException;

public class ProfileSteps {
    private WebDriver driver;
    private PageObjectManager reusableMethod;
    private TestData testData;
    private ProfileObjects profilePage =new ProfileObjects();


    public ProfileSteps(DriverSetup driverSetup){
        this.driver = driverSetup.driver;
        this.reusableMethod = new PageObjectManager(driver);
        this.testData = new TestData(driver);

    }


    @When("Click on the Profile icon")
    public void clickOnTheProfileIcon() throws InterruptedException {
        reusableMethod.clickElement(profilePage.profileicon);
    }

    @And("Click on dashboard")
    public void clickOnDashboard() {
    }


    @And("Click on My order")
    public void clickOnMyOrder() throws InterruptedException {
        reusableMethod.clickElement(profilePage.myordericon);

    }
}
