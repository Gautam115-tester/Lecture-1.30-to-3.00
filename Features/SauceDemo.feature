Feature: Login

  Scenario Outline: Verify login by provide multiple data
    Given Open browser
    And open saucedemo site.
    When Enter username field  "<username>"
    And Enter password field "<password>"
    And Click on Login Button.
    Then Verfiy login by checking url
    And click on menu option
    And click on logout button

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |
