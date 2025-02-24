package com.demoblaze.automation.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckoutPage extends PageObject {

    public void enterCustomerDetails(String name, String country, String creditCard, String month, String year) {
        $("#name").type(name);
        $("#country").type(country);
        $("#card").type(creditCard);
        $("#month").type(month);
        $("#year").type(year);
    }

    public void confirmPurchase() {
        $(By.xpath("//button[contains(@class, 'btn-primary') and contains(text(),'Purchase')]")).click();
    }

    public boolean isPurchaseConfirmed() {
        return $(".sweet-alert").isDisplayed();
    }
}

