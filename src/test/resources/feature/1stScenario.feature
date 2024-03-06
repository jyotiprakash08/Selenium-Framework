Feature: Find smartphone by applying filters

  Scenario: Find smartphone by applying price, condition, item location filter
    Given Initialize the browser with chrome
    Given Navigate to "https://www.ebay.com/" site
    When Navigate to search by "Cell Phones & Accessories"
    Then Click on All Filters
    Then Add filters as Condition, Price & Item Location 
    And Click on apply
    
