Feature: Get an insurance quote

  Scenario: New car insurance quote
    Given user is on the home page
    When user select Small Business option from product drop down
    And put zip code in zipcode field
    And click on Start a quote button
    Then Find a State Farm Agent Near You page shows up
#these are called @CucumberOptions tag
