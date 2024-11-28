Feature: Product

  Scenario: Verify Product Link Is Click able or not
    Given Launch Chrome Browser
    And Open flipkart site
    When Search the product
    And Click on the Search Product
    Then Verify the product has been open or not by title.
	