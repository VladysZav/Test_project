package BDD.StepDefinion;

import Pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver webDriver;


    @Given("^Open the Chrome and launch the application$")
    public void open_the_chrome_and_launch_the_application() throws Throwable{
        File fileChromeDriver = new File("chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileChromeDriver.getAbsolutePath());
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.open(".https://stackoverflow.com/");
        System.out.println("This step open the chrome and launch the application");
    }

    @When("^Click to link Log In$")
    public void click_to_link_log_in() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickToLinkLogIn();
    }

    @When("^Enter the Username and Password$")
    public void enter_the_username_and_password() throws Throwable{
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUsernameAndPassword("vlad.zavaliy@gmail.com",
                "parol111");
        System.out.println("This step enter the Username and Password on login page");
    }
    @Then("^Click button submit$")
    public void click_button_submit() throws Throwable{
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickButtonSubmit();
        webDriver.quit();
        System.out.println("This step click button submit");
    }

}
