package com.aqa.steps;

import com.codeborne.selenide.ElementsCollection;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class OnlinerStepsDefinition {

    @Given("User is on {string} page")
    public void user_is_on_page(String pageAddress) {
        //open(pageAddress);
        open(pageAddress);
    }

    @When("User searches for {string}")
    public void user_searches_for(String searchText) {
        $x("//input[@class='fast-search__input']")
                .sendKeys(searchText);
    }

    @Then("{string} is the first search result")
    public void isTheFirstSearchResult(String searchResultTitle) {
        switchTo().frame($(".modal-iframe"));//iframe and css
        ElementsCollection productTitles =
                $$(".result__item_product .product__title .product__title-link");
//        System.out.println();
        String actualTitle = productTitles.first()
                                          .getText();
        assertThat(actualTitle)
                .as("The first searchResult is incorrect")
                .contains(searchResultTitle);
    }
}

