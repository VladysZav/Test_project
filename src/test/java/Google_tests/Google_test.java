package Google_tests;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import parentTest.Parent_test;


public class Google_test extends Parent_test {

    WebDriver webDriver;

    @Test
    public void googleTest(){
       // webDriver.get("https://google.com");
        //webDriver.findElement(By.xpath(".//img[@alt='Google']"));
        //webDriver.findElement(By.xpath(".//input[@type='text']")).sendKeys("maven selenium java");
        //webDriver.findElement(By.xpath(".//div[5]/center[1]/input[@value='Поиск в Google']")).click();
        //System.out.println("Page was opened");
        //  webDriver.close(); //закрывать вкладку
        googlePage.openGooglePage();
        googlePage.enterTextForGooglePage("maven selenium java");
        googlePage.clickOnSubmit();
    }


    }

