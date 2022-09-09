@tags
Feature: Search for laptops on Emag


  Scenario: 1 Verify that I can see a product page
    Given that i am on emag page
    When I go to the Laptops page
    And I click on the first laptop
    Then The Item Page will display the "Adauga la Favorite" button


  Scenario:  2 Verify that search will open the correct page
    Given that i am on emag page
    When I search for "laptop" text
    And I click on the first item
    Then The Item Page will display the "Adauga la Favorite" button


  Scenario:  3 Verify that search result elements are in correct order
    Given that i am on emag page
    When I search for "laptop" text
    And I order the results by "Pret descrescator"
    Then Order list was changed


  Scenario Outline:  4 Verify that search will open the correct page
    Given that i am on emag page
    When I search for "<searchProduct>" text
    And I click on the first item
    Then The Item Page will display the "Adauga la Favorite" button
    Examples:
      | searchProduct |
      | tv            |
      | phone         |

  Scenario: Verify that the price is calculated correctly
  Given that i am on emag page
  When I search for "Xbox" text
  And I click on the first item
  And I click on adauga in cos
  And I click on see details
  Then The page will display the total price


#    Homework
#    Steps:
#    1. Open emag page
#    2. Search for "XBOX"
#    3. Add first item from result list in cart
#    4. Go to cart page
#    5. Verify if product cost + shipping = total cost