Feature: Onliner search
  @smoke
  Scenario: Search for "iPhone 14 Pro" in the Onliner Catalog
    Given User is on "https://www.onliner.by/" page
    And The browser is maximized
    When User searches for "iPhone 14 Pro"
    Then "Смартфон Apple iPhone 14 Pro" is the first search result