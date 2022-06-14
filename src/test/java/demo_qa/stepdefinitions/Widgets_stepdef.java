package demo_qa.stepdefinitions;

import demo_qa.pages.Widgets;
import demo_qa.utilities.ConfigReader;
import demo_qa.utilities.Driver;
import demo_qa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Instant;

public class Widgets_stepdef {

    Widgets widgets = new Widgets();
    Actions actions1 = new Actions(Driver.getDriver());
    @And("user clicks widgets button")
    public void userClicksWidgetsButton() {
        widgets.widgetButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then("user clicks tool tips button")
    public void userClicksToolTipsButton() {
        actions1.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        widgets.toolTips.click();
        ReusableMethods.waitFor(2);
    }

    @And("user hover over the Hover me to see button")
    public void userHoverOverTheHoverMeToSeeButton() {
        actions1.moveToElement(widgets.toolTipButton).perform();
        ReusableMethods.waitFor(2);
    }
    @Then("verify You Hovered Over the button is displayed")
    public void verifyYouHoveredOverTheButtonIsDisplayed() {
        Assert.assertEquals(widgets.toolTipButton.getText(), ConfigReader.getProperty("verify_toolTips"));
        ReusableMethods.waitFor(2);
        // Assert.assertTrue(interactions.verify.isDisplayed());
        Assert.assertTrue(widgets.toolTipButton.isDisplayed());
    }
    @Then("user hover over the Hover me to see text field")
    public void userHoverOverTheHoverMeToSeeTextField() {
        actions1.moveToElement(widgets.toolTipTextField).perform();
        ReusableMethods.waitFor(2);
    }
    @Then("verify You hovered the text field is displayed")
    public void verifyYouHoveredTheTextFieldIsDisplayed() {
        Assert.assertEquals(widgets.toolTipTextField.getText(), ConfigReader.getProperty("verify_textField"));
        ReusableMethods.waitFor(2);
    }
}
