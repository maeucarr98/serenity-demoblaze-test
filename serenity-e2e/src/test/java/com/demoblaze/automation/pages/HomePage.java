package com.demoblaze.automation.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoblaze.com")
public class HomePage extends PageObject {

    public void openHomePage() {
        open();
    }

    public void addProductById(int productId) {
        $(By.cssSelector("a[href='prod.html?idp_=" + productId + "']")).click();
        $(By.cssSelector("a[onclick='addToCart(" + productId + ")']")).click();
    }

    public void navigateToCart() {
        $("#cartur").click();
    }
}
