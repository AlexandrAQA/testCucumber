Feature: Onliner search
  Scenario: Search for "iPhone 14 Pro" in the Onliner Catalog
    Given User is on "https://www.onliner.by/" page
    When User searches for "iPhone 14 Pro"
    Then "Смартфон Apple iPhone 14 Pro 128GB (космический черный)" is the first search result