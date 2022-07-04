package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage{
    public LoginPage(WebDriver webDriver){
        super(webDriver);
    }
    @FindBy(xpath = ".//a[contains(text(),'Log in')]")
    private WebElement linkLogin;

    @FindBy(xpath = ".//input[@id='email']")
    private WebElement inputUsername;

    @FindBy(xpath = ".//input[@id='password']" )
    private WebElement inputPassword;

    @FindBy(xpath = ".//button[@id='submit-button']")
    private WebElement buttonSubmit;

    public void openStackoverflour(String url){
        open(url);
    }

    public void  clickToLinkLogIn(){
        webElements.clickOnElement(linkLogin);
    }

    public void setUsernameAndPassword(String username, String password){
        webElements.enterText(inputUsername, username);
        webElements.enterText(inputPassword, password);
    }

    public void clickButtonSubmit(){
        webElements.clickOnElement(buttonSubmit);
    }

}
