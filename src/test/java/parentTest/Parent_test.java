package parentTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;

public class Parent_test {

    public WebDriver webDriver;

    public Parent_test() {

    }
    @Before
    public void setUp(){
        File fileChromeDriver = new File("chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileChromeDriver.getAbsolutePath());
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void tearDown(){
        webDriver.quit();
    }

    public void checkactualRwithExpectedR(String message, boolean actualR, boolean expectedR) {
        Assert.assertThat(message, actualR, is(expectedR));
    }
}
