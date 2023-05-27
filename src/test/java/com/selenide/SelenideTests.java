package com.selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.logging.Level;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Saimanikandan V on 27-05-2023
 */
public class SelenideTests {
    By google_name=By.name("q");
    By google_sbtn=By.name("btnK");

    @BeforeSuite
    public void setUp()
    {
        SelenideLogger.addListener("AllureSelenide",new AllureSelenide()
                .screenshots(true));
    }

    @Test
    public void googleTest()
    {
        open("http://www.google.com");
        $(google_name).setValue("facebook");
        $(google_sbtn).click();
    }

    @Test
    public void googleTest2()
    {
        open("http://www.google.com");
        $(google_name).setValue("gmail");
        $(google_sbtn).click();
    }
}
