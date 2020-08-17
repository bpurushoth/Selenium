package tests;

import io.qameta.allure.*;
import twingo.twingo;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Google.Google.test;




//In order to eliminate attachment problem for Allure, you should add @Listener line.
//link: https://github.com/allure-framework/allure1/issues/730

@Epic("Regression Tests")
@Feature("Login Tests")
public class LoginTests extends BaseTest {

    /*@BeforeTest
    public void setupTestData () {
        //Set Test Data Excel and Sheet
        System.out.println("************Setup Test Level Data**********");
    }*/

    @Test (priority = 0)
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test Description: Loading the google home page")
    public void Google() throws InterruptedException  {
        //*************PAGE INSTANTIATIONS*************
        test test = new test();
        test.google(driver);
    }

    @Test (priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test Description: Load the Twingo Hoempage")
    public void Twingo () throws InterruptedException {
        
        //*************PAGE INSTANTIATIONS*************
        twingo Test = new twingo();

        //*************PAGE METHODS********************
        Test.twingo(driver);
       }

}
