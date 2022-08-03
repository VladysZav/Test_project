package BDD.StepDefintiion;

import Pages.MapPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class RouteTest {
    WebDriver webDriver;


    @Given("^I am on the openstreetmap$")
    public void openStreetMap() throws Throwable{
        File fileChromeDriver = new File("chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileChromeDriver.getAbsolutePath());
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MapPage mapPage = new MapPage(webDriver);
        mapPage.open("https://www.openstreetmap.org/#map=5/51.110/15.293");
        System.out.println("This step open openstreetmap");
    }

    @When("^I enter 'Радищева, Київ' in From, enter 'Кембридж' in To,  select 'Bicycle OSRM'$")
    public void enter_from_to() {
        MapPage mapPage = new MapPage(webDriver);
        mapPage.clickToButtonRoute();
        mapPage.setStartAndFinish("Радищева, Київ",
                "Кембридж");
        mapPage.clickToButtonBicycle();
        System.out.println("This step enter 'Радищева, Київ' in From, enter 'Кембридж' in To");
    }
    @Then("^I click 'Find' button$")
    public void click_button_find() throws Throwable{
        MapPage mapPage = new MapPage(webDriver);
        mapPage.clickToButtonFind();
        TimeUnit.SECONDS.sleep(10);
        webDriver.close();
        System.out.println("This step click 'Find' button");
    }

}
