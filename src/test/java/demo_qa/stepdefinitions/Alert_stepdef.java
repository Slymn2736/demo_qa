package demo_qa.stepdefinitions;

import demo_qa.pages.Alerts;
import demo_qa.utilities.ConfigReader;
import demo_qa.utilities.Driver;
import demo_qa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.asynchttpclient.util.Assertions;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Alert_stepdef {

    Alerts alerts = new Alerts();
    Actions actions = new Actions(Driver.getDriver());


    @Given("user goes to demoqa webpage")
    public void user_goes_to_demoqa_webpage() {
        Driver.getDriver().get(ConfigReader.getProperty("application_url"));
        ReusableMethods.waitFor(2);
    }
    @And("User clicks Alerts, Frame&Windows button")
    public void user_clicks_alerts_frame_windows_button() {
        alerts.alertFrameWindows.click();
        ReusableMethods.waitFor(2);
    }
    @Then("User clicks Alerts")
    public void user_clicks_alerts() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        alerts.alertbutton.click();
        ReusableMethods.waitFor(2);
    }
    @And("User clicks Click me button for see alert")
    public void userClicksClickMeButtonForSeeAlert() {
        alerts.clickMeButton1.click();
        ReusableMethods.waitFor(2);
        String alertText=Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(alertText, ConfigReader.getProperty("alert1"));
        ReusableMethods.waitFor(2);
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.waitFor(2);

    }
    @And("User verify You clicked a button and accept alert")
    public void userVerifyYouClickedAButtonAndAcceptAlert() {
//        String alertText=Driver.getDriver().switchTo().alert().getText();
//        Assert.assertEquals(alertText, ConfigReader.getProperty("alert1"));
//        ReusableMethods.waitFor(2);
//        Alert alert = Driver.getDriver().switchTo().alert();
//        alert.accept();
//        Driver.getDriver().switchTo().alert().accept();
//        ReusableMethods.waitFor(2);


//        try{
//            Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        }
//        catch (org.openqa.selenium.UnhandledAlertException e) {
//            Alert alert = Driver.getDriver().switchTo().alert();
//            String alertText = alert.getText().trim();
//            System.out.println("Alert data: "+ alertText);
//            alert.accept();}
//        ReusableMethods.waitFor(2);



    }
    @Then("User clicks Click me button for  alert will appear after {int} seconds")
    public void userClicksClickMeButtonForAlertWillAppearAfterSeconds(int arg0) {
        alerts.clickMeButton2.click();
        ReusableMethods.waitFor(2);
    }
    @Then("User verify This alert appeared after {int} seconds and accept alert")
    public void userVerifyThisAlertAppearedAfterSecondsAndAcceptAlert(int arg0) {
        String alertText1=Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(alertText1, ConfigReader.getProperty("alert2"));
        ReusableMethods.waitFor(2);
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.waitFor(2);
    }
    @And("User clicks Click me button for confirm box will appear")
    public void userClicksClickMeButtonForConfirmBoxWillAppear() {
        alerts.clickMeButton3.click();
        ReusableMethods.waitFor(2);
    }
    @And("User accept the alert and verify You selected Ok")
    public void userAcceptTheAlertAndVerifyYouSelectedOk() {
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.waitFor(2);
        Assert.assertEquals(alerts.confirm.getText(),ConfigReader.getProperty("alert3"));
    }
    @And("User clicks Click me button for prompt box will appear")
    public void userClicksClickMeButtonForPromptBoxWillAppear() {
        alerts.clickMeButton4.click();
        ReusableMethods.waitFor(2);
    }
    @Then("User enters a name and accept the alert")
    public void userEntersANameAndAcceptTheAlert() {
        Driver.getDriver().switchTo().alert().sendKeys(ConfigReader.getProperty("name"));
        ReusableMethods.waitFor(2);
        Driver.getDriver().switchTo().alert().accept();
    }
    @And("User verify the alert text")
    public void userVerifyTheAlertText() {
        Assert.assertEquals(alerts.prompt.getText(),ConfigReader.getProperty("alert4"));
    }
    @Then("Close the application")
    public void closeTheApplication() {
        Driver.closeDriver();
    }
}
