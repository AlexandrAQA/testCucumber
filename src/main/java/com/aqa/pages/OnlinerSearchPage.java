package com.aqa.pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$;

public class OnlinerSearchPage {

    public void searchInCatalog(String searchText){
        $x("//input[@class='fast-search__input']")
                .sendKeys(searchText);
    }

    public ElementsCollection getProductTitles(){
        switchTo().frame($(".modal-iframe"));//iframe and css
        return  $$(".result__item_product .product__title .product__title-link");
    }

    //TODO check in what frame we are
    public ElementsCollection getProductDetails(){
        return $$(".product__details .product__description");
    }
}