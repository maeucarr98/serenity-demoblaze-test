package com.demoblaze.automation.pages;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.WebDriver;

public class BasePage {
    static WebDriver driver;

    @BeforeAll
    static void setupDriver() {
        System.setProperty("webdriver.edge.driver", "C:/Users/marug/Proyecto Testing/serenity-e2e/src/test/resources/drivers/msedgedriver.exe");

        EdgeOptions options = new EdgeOptions();
        driver = new EdgeDriver(options); // This will force open Edge
    }

}
