package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends ParentPage {


    @FindBy(xpath =".//input[@type='text']")
    private WebElement inputText;

    @FindBy(xpath =".//div[5]/center[1]/input[@value='Поиск в Google']")
    private WebElement buttonSubmit;
    public GooglePage(WebDriver webDriver){
        super(webDriver);
    }
    public void openGooglePage(){
        open("https://google.com");
    }

    public void enterTextForGooglePage(String text){
        webElements.enterText(inputText, text);
    }

    public void clickOnSubmit(){
        webElements.clickOnElement(buttonSubmit);

    }

}
