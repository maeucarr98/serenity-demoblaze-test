package com.demoblaze.automation.steps;

import com.demoblaze.automation.pages.CartPage;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class CartPageSteps {

    public CartPage cartPage;

    @Step("Verify cart items")
    public void verifyCartItems() {
        assertThat(cartPage.isCartNotEmpty()).isTrue();
    }

    @Step("Proceed to checkout")
    public void proceedToCheckout() {
        cartPage.clickCheckoutButton();
    }
}