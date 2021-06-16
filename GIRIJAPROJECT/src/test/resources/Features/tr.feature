Feature: test login functionality

  Scenario Outline: 
    Given the user login to browser functionality
    When the user clicks <email> button
    And the user clicks <pass> butt
    Then the user clicks submit button

    Examples: 
      | email                   | pass       |
      | tanujaanvitha@gmail.com | tanujarith |
