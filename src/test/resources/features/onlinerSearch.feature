Feature: Onliner search
#  before all tests
  Background:
     Given User is on "https://www.onliner.by/" page

  @smoke
  Scenario Outline: Search for "iPhone 14 Pro" in the Onliner Catalog
    And The browser is maximized
    When User searches for "<phone>"
    Then "<description>" is the first search result
    Examples:
      | phone            | description                  |
      | iPhone 14 Pro    | Смартфон Apple iPhone 14 Pro |
      | Samsung s23      | Смартфон Samsung Galaxy S23  |
      | Xiaomi 12S Ultra | Смартфон Xiaomi 12S Ultra    |