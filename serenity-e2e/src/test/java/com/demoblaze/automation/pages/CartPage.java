package com.demoblaze.automation.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CartPage extends PageObject {

    public boolean isCartNotEmpty() {
        return $("#tbodyid").isDisplayed();
    }

    public void clickCheckoutButton() {
        $(By.xpath("//button[contains(text(),'Place Order')]")).click();
    }
}
