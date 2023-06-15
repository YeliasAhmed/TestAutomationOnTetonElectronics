package stepDefinitions.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.Login.LoginPage;
import pages.PageObjectManager.PageObjectManager;
import utils.TestContextSetup;

import java.util.Random;

public class LoginSteps {
    public WebDriver driver;

    TestContextSetup testContextSetup;
    LoginPage loginPage;

    public LoginSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
        this.driver = loginPage.driver;
    }

    @Given("Home page is displayed")
    public void HomePage() throws InterruptedException {

        Assert.assertTrue(loginPage.getTetonHomePage().isDisplayed());
        Thread.sleep(1000);

        Assert.assertEquals(loginPage.getTetonHomePage().getText(),"HOME");
        Thread.sleep(1000);


    }
// TC_01
    @Then("Check that the all home page options are available")
    public void AllHomePageOptions() throws InterruptedException {
        Assert.assertTrue(loginPage.getTetonHomePage().isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(loginPage.getTetonHomePage().getText(),"HOME");
        Thread.sleep(1000);

        Assert.assertTrue(loginPage.getAboutUs().isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(loginPage.getAboutUs().getText(),"ABOUT US");
        Thread.sleep(1000);

        Assert.assertTrue(loginPage.getProducts().isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(loginPage.getProducts().getText(),"PRODUCTS");
        Thread.sleep(1000);

        Assert.assertTrue(loginPage.getFaqs().isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(loginPage.getFaqs().getText(),"FAQ");
        Thread.sleep(1000);

        Assert.assertTrue(loginPage.getContactUs().isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(loginPage.getContactUs().getText(),"CONTACT US");
        Thread.sleep(1000);

        Assert.assertTrue(loginPage.getFavorite().isDisplayed());
        Thread.sleep(1000);

        Assert.assertTrue(loginPage.getLogin().isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(loginPage.getLogin().getText(),"LOGIN");
        Thread.sleep(1000);

    }
//TC_02
    @Then("Check that the login option is available")
    public void checkThatTheLoginOptionIsAvailable() throws InterruptedException {
        Assert.assertTrue(loginPage.getLogin().isDisplayed());
        Thread.sleep(1000);

        Assert.assertEquals(loginPage.getLogin().getText(),"LOGIN");
        Thread.sleep(1000);

    }

    @When("Click on the login option")
    public void clickOnTheLoginOption() throws InterruptedException {
        loginPage.getLogin().click();
        Thread.sleep(1000);

    }

    @Then("Check that the login form is displayed")
    public void checkThatTheLoginFormIsDisplayed() throws InterruptedException {
        Assert.assertTrue(loginPage.getLoginFormLabel().isDisplayed());
        Thread.sleep(1000);

        Assert.assertEquals(loginPage.getLoginFormLabel().getText(),"LOGIN");
        Thread.sleep(1000);
    }

    @When("users give unregistered email with password")
    public void usersGiveUnregisteredEmailWithPassword() throws InterruptedException {
        Assert.assertTrue(loginPage.getEmailInputField().isDisplayed());
        Thread.sleep(1000);
        loginPage.getEmailInputField().sendKeys("abdc@gmail.com");
        loginPage.getPasswordInputField().sendKeys("12345");
        Thread.sleep(1000);
    }

    @And("Click on the login Button")
    public void clickOnTheLoginButton() throws InterruptedException {
        Assert.assertTrue(loginPage.getLoginButton().isDisplayed());
        loginPage.getLoginButton().click();
        Thread.sleep(1000);
    }

    @Then("Check that the {string} message is displayed")
    public void checkThatTheMessageIsDisplayed(String text) throws InterruptedException {
        Assert.assertTrue(loginPage.getErrorMessage().isDisplayed());
        Thread.sleep(1000);

        Assert.assertEquals(loginPage.getErrorMessage().getText(),text);
        Thread.sleep(1000);

    }
    
//TC_03
    @Then("Check that the register button is available")
    public void checkThatTheRegisterButtonIsAvailable() throws InterruptedException {
        Assert.assertTrue(loginPage.getRegisterButton().isDisplayed());
        Thread.sleep(1000);

        Assert.assertEquals(loginPage.getRegisterButton().getText(),"register");
        Thread.sleep(1000);
    }


    @When("Click on the register button")
    public void clickOnTheRegisterButton() throws InterruptedException {
        Assert.assertTrue(loginPage.getRegisterButton().isDisplayed());
        Thread.sleep(1000);
        loginPage.getRegisterButton().click();
    }

    @Then("Check that the registration form is displayed")
    public void checkThatTheRegistrationFormIsDisplayed() throws InterruptedException {
        Assert.assertTrue(loginPage.getRegistrationForm().isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(loginPage.getRegistrationForm().getText(),"REGISTRATION\n" +
                "FULL NAME *\n" +
                "E-MAIL *\n" +
                "MOBILE *\n" +
                "+88 (BD)\n" +
                "PASSWORD *\n" +
                "I accept Terms & Conditions\n" +
                "REGISTER\n" +
                "Already have an account? login");
        Thread.sleep(1000);

    }

    @When("Fill up the all mandatory field")
    public void fillUpTheAllMandatoryField() throws InterruptedException {
        Random random = new Random();
        int value=random.nextInt(999);
        int value1=random.nextInt(9);
        Assert.assertTrue(loginPage.getRegNameInputField().isDisplayed());
        Thread.sleep(1000);
        loginPage.getRegNameInputField().sendKeys("Test"+value);

        try {
            Assert.assertTrue(loginPage.getRegEmailInputField().isDisplayed());
            Thread.sleep(1000);
            loginPage.getRegEmailInputField().sendKeys("Abc"+value+"@gmail.com");
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Already registered try with another email");
        }

        try {
            Assert.assertTrue(loginPage.getRegPhoneInputField().isDisplayed());
            Thread.sleep(1000);
            loginPage.getRegPhoneInputField().sendKeys("19256"+value1+"4583");
        }catch (Exception e){
            System.out.println(e);
            loginPage.getRegPhoneInputField().sendKeys("1985488956");

        }

        Assert.assertTrue(loginPage.getRegPassInputField().isDisplayed());
        Thread.sleep(1000);
        loginPage.getRegPassInputField().sendKeys("12"+value);

        Assert.assertTrue(loginPage.getRegButton().isDisplayed());
        Thread.sleep(1000);
        loginPage.getRegButton().click();

    }

    @And("hover to the user profile")
    public void hoverToTheUserProfile() throws InterruptedException {
        PageObjectManager.hoverToElement(loginPage.getprofile());
        Thread.sleep(1000);
    }

    @And("Click on the settings")
    public void clickOnTheSetting() throws InterruptedException {
        Assert.assertTrue(loginPage.getRegSetting().isDisplayed());
        Thread.sleep(1000);
        loginPage.getRegSetting().click();

    }

    @Then("Check that the registered user information is displayed")
    public void checkThatTheRegisteredUserInformationIsDisplayed() throws InterruptedException {
        Assert.assertTrue(loginPage.getRegisteredInformation().isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(loginPage.getRegisteredInformation().getText(),"GENERAL INFORMATION\n" +
                "NAME\n" +
                "E-MAIL\n" +
                "MOBILE *\n" +
                "+88 (BD)\n" +
                "CHANGE PASSWORD\n" +
                "UPDATE");
        Thread.sleep(1000);

    }
}
