Feature: Purchase Order


@s1
  Scenario Outline: Purchase Order
   Given User is logged into SWAGLABS application with <UN> and <PW>
   When I select few products from Products page and click on shopping cart icon
   Then I verify the selected products on Your Cart page
   And I click on CHECKOUT button on Your Cart page
   And I provide user information on Checkout page and I click on CONTINUE
      | Savitha  |
      | Phadake |
      | Bangalore |
   Then I verify Items total amount in shipping information section
   When I click on FINISH button on Overview page
   Then I verify Order is placed successfully
   And I logout from SWAGLABS application

Examples: 
| UN | PW | Product1 | Product2 |
| standard_user | secret_sauce | Product1 | Product2 |
#| locked_out_user | secret_sauce | Product1 | Product2 |