@tesla
  Feature: TeslaFunctionsVerification

    @teslaMainPage
    Scenario: Presence of elements
      Given I go to "tesla" site
      And I wait for 1 sec
      And I Verifying title is "Electric Cars, Solar & Clean Energy | Tesla"
      And I wait for 1 sec
      Then I verify elements visibility on main page
      And I wait for 1 sec
      And I Verifying presence of elements in modal panel

    @teslaTCLogin01
    Scenario: Login function verification with valid credentials
      Given I go to "tesla" site
      And I login with valid "userData" credentials
      And I wait for 2 sec
      And I verify I'm log in and title is "Tesla Account | Tesla"

    @teslaTCLogin02
    Scenario: Login function verification with invalid credentials 1
      Given I go to "tesla" site
      Then I login with invalid email and valid password "userData"
      And "We don't recognize this sign in combination" message should be displayed

    @teslaTCLogin03
    Scenario: Login function verification with invalid credentials 2
      Given I go to "tesla" site
      Then I login with valid email and invalid password "userData"
      And "We don't recognize this sign in combination" message should be displayed

    @teslaTCLogin04
    Scenario: Login function verification with invalid credentials 3
      Given I go to "tesla" site
      Then I login with invalid email and invalid password "userData"
      Then "We don't recognize this sign in combination" message should be displayed

    @teslaTCOrderModelS01-02
    Scenario: Order functionality verification
      Given I go to "tesla" site
      Then I navigate to ModelS page
      And I click Order Now button
      Then I choose options
      And I click Continue
      Then I select financing option
      And I click Order with Card
      Then I fill out Account Details from "userData"
      Then I fill out Shipping details from "userData"
      Then I fill out Card details from "userData"
      And I click Place Order
      And I wait for 3 sec