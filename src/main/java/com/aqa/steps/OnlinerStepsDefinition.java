package com.aqa.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class OnlinerStepsDefinition {

    @Given("User is on {string} page")
    public void user_is_on_page(String pageAddress) {
        //open(pageAddress);
        open("https://www.onliner.by/");
        //throw new io.cucumber.java.PendingException();
    }
    @When("User searches for {string}")
    public void user_searches_for(String searchText) {
        $x("//input[@class='fast-search__input']")
                .sendKeys(searchText);
       // throw new io.cucumber.java.PendingException();
    }
    @Then("{string} is the first search result")
    public void is_the_first_search_result(String string) {

       // throw new io.cucumber.java.PendingException();
    }


}

