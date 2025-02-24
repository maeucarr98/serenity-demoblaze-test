package com.demoblaze.automation.steps;

import com.demoblaze.automation.pages.HomePage;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.annotations.Step;

public class HomePageSteps extends ScenarioSteps {

    public HomePage homePage;  // Ensure this page object is correctly initialized

    @Step("Open the Demoblaze application")
    public void openApplication() {
        homePage.openHomePage();
    }

    @Step("Add product {0} to the cart")
    public void addProductToCart(int productId) {
        homePage.addProductById(productId);
    }

    @Step("Go to Cart")
    public void goToCart() {
        homePage.navigateToCart();
    }
}
