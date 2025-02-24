package com.demoblaze.automation.features;

import com.demoblaze.automation.steps.CartPageSteps;
import com.demoblaze.automation.steps.CheckoutPageSteps;
import com.demoblaze.automation.steps.HomePageSteps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class ShoppingCartTest {

    @Steps
    private HomePageSteps homePageSteps;  // ✅ Ensure it's annotated with @Steps

    @Steps
    private CartPageSteps cartPageSteps;

    @Steps
    private CheckoutPageSteps checkoutPageSteps;

    @Test
    void completePurchaseFlow() {
        homePageSteps.openApplication();  // 🚀 Fix: This should now be properly injected
        homePageSteps.addProductToCart(1);
        homePageSteps.addProductToCart(2);
        homePageSteps.goToCart();
        cartPageSteps.verifyCartItems();
        cartPageSteps.proceedToCheckout();
        checkoutPageSteps.fillCheckoutForm("Maria Carrillo", "Ecuador", "4785963214", "12", "2025");
        checkoutPageSteps.completePurchase();
        assertThat(checkoutPageSteps.isPurchaseSuccessful()).isTrue();
    }
}
