package com.demoblaze.automation.steps;

import com.demoblaze.automation.pages.CheckoutPage;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutPageSteps {

    private CheckoutPage checkoutPage;

    @Step("Fill the checkout form")
    public void fillCheckoutForm(String name, String country, String creditCard, String month, String year) {
        checkoutPage.enterCustomerDetails(name, country, creditCard, month, year);
    }

    @Step("Complete purchase")
    public void completePurchase() {
        checkoutPage.confirmPurchase();
    }

    @Step("Verify purchase success")
    public boolean isPurchaseSuccessful() {
        return checkoutPage.isPurchaseConfirmed();
    }
}
