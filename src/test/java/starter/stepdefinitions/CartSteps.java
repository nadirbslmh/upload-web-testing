package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.ProductsPage;

public class CartSteps {
    @Steps
    ProductsPage productsPage;

    @When("I add item to the cart")
    public void addItemToTheCart() {
        Assertions.assertTrue(productsPage.addToCartButtonIsDisplayed());
        productsPage.clickAddToCartButton();
    }

    @Then("Item is added to the cart")
    public void itemIsAddedToTheCart() {
        Assertions.assertTrue(productsPage.validateCartCounterIsDisplayed());
        Assertions.assertTrue(productsPage.validateCartCounter());
    }

}
