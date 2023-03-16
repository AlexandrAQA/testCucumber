package com.aqa.pages;

import static com.codeborne.selenide.Selenide.$x;

public class OnlinerSearchPage {

    public void searchInCatalog(String searchText){
        $x("//input[@class='fast-search__input']")
                .sendKeys(searchText);
    }
}
