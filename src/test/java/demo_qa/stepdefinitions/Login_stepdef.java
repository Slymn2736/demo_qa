package demo_qa.stepdefinitions;

import demo_qa.pages.Login;
import demo_qa.utilities.ConfigReader;
import demo_qa.utilities.Driver;
import demo_qa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Login_stepdef {

    Login login = new Login();

    @Given("User goes to webpage")
    public void userGoesToWebpage() {
        Driver.getDriver().get(ConfigReader.getProperty("application_login"));
        ReusableMethods.waitFor(3);
    }
    @And("User clicks the User Name box and enters a valid User Name")
    public void userClicksTheUserNameBoxAndEntersAValidUserName() {
        login.userName.click();
        login.userName.sendKeys(ConfigReader.getProperty("user_name"));
        ReusableMethods.waitFor(2);
    }
    @And("User clicks the password box and enters a valid password")
    public void userClicksThePasswordBoxAndEntersAValidPassword() {
        login.password.click();
        login.password.sendKeys(ConfigReader.getProperty("user_password"));
        ReusableMethods.waitFor(2);
    }
    @And("User clicks the login button")
    public void userClicksTheLoginButton() {
        login.loginButton.click();
        ReusableMethods.waitFor(2);
    }


}
