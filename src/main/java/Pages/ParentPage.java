package Pages;


import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ParentPage {
    WebDriver webDriver;
    Logger logger;

    public ParentPage(WebDriver webDriver){
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
        PageFactory.initElements(webDriver, this);
    }

    /**
     * method opens url
     * parent url
     */
    public void open(String url){
        try{
            webDriver.get(url);
            logger.info("Page was opened" + url);
        } catch(Exception e){
            logger.error("page cant not opened" + url);
            Assert.fail("page cant not opened" + url);
        }
    }
}
