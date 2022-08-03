package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MapPage extends ParentPage {


    public MapPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(css = "div[id='sidebar'] form[class='search_form px-1 py-2'] img")
    private WebElement buttonRoute;

    @FindBy(xpath = "//div[@id='sidebar']//input[@id='route_from']")
    private WebElement inputStart;

    @FindBy(xpath = "//div[@id='sidebar']//input[@id='route_to']")
    private WebElement inputFinish;

    @FindBy(xpath = "//div[@id='sidebar']//select[@name='routing_engines']")
    private WebElement buttonSelect;

    @FindBy(css = "div[id='sidebar'] select[name='routing_engines'] option[value='0']")
    private WebElement buttonBicycle;

    @FindBy(css = "div[id='sidebar'] form[class='directions_form pb-3'] input[name='commit']")
    private WebElement buttonFind;


    public void clickToButtonRoute() {
        webElements.clickOnElement(buttonRoute);
    }
    public void clickToButtonSelect() {
        webElements.clickOnElement(buttonSelect);
    }
    public void clickToButtonBicycle() {
        webElements.clickOnElement(buttonBicycle);
    }
    public void clickToButtonFind() {
        webElements.clickOnElement(buttonFind);
    }
    public void setStartAndFinish(String start, String finish){
        webElements.enterText(inputStart, start);
        webElements.enterText(inputFinish, finish);
    }
}

