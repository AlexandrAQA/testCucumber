Feature: Onliner search
#  before all tests
  Background:
    Given User is on "https://www.onliner.by/" page

#  @smoke
#  Scenario Outline: Search for "iPhone 14 Pro" in the Onliner Catalog
#    And The browser is maximized
#    When User searches for "<phone>"
#    Then "<description>" is the first search result
#    Examples:
#      | phone            | description         |
#      | iPhone 14 Pro    | Apple iPhone 14 Pro |
#      | Samsung s23      | Samsung Galaxy S23  |
#      | Xiaomi 12S Ultra | Xiaomi 12S Ultra    |

  @smoke
  Scenario: Search for "iPhone 14 Pro" in the Onliner Catalog
    Given User is on "https://www.onliner.by/" page
    And The browser is maximized
    When User searches for "iPhone 14 Pro"
    Then "Apple iPhone 14" is the first search result
    And Search result contains the next characteristics

      | OS        | screen                |
      | Apple iOS | 6.1" OLED (1179x2556) |

