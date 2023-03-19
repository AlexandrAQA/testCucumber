package com.aqa.steps;

import com.aqa.pages.OnlinerSearchPage;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class OnlinerSearchSteps {

    OnlinerSearchPage searchPage = new OnlinerSearchPage();

    @Given("User is on {string} page")
    public void userIsOnPage(String pageAddress) {
        open(pageAddress);
    }

    @When("User searches for {string}")
    public void userSearchesFor(String searchText) {
        searchPage.searchInCatalog(searchText);
    }

    @Then("{string} is the first search result")
    public void isTheFirstSearchResult(String searchResultTitle) {
        ElementsCollection productTitles = searchPage.getProductTitles();

        String actualTitle = productTitles.first().getText();
        assertThat(actualTitle)
                .as("The first searchResult is incorrect")
                .contains(searchResultTitle);
        //System.out.println();
    }

    @And("The browser is maximized")
    public void theBrowserIsMaximized() {
        getWebDriver().manage().window().maximize();
    }

    @And("Search result contains the next characteristics")
    public void searchResultContainsTheNextCharacteristics(DataTable characteristics) {
        ElementsCollection productDetails = searchPage.getProductDetails();
        String actualDescription = productDetails.first().getText();
        List<Map<String, String>> maps = characteristics.asMaps();
        Map<String, String> characteristicsMap = maps.get(0);

        assertThat(actualDescription).as("The characteristics string is invalid")
                                     .contains(characteristicsMap.get("OS"));
        assertThat(actualDescription).as("The characteristics string is invalid")
                                     .contains(characteristicsMap.get("screen"));
    }
}

