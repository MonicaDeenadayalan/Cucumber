Feature: Shopping in flipkart page

Background:
 Given Enter the Url
    And Skip the Login page
		
@ElectronicsPage
  Scenario: Adding Lowest price laptop to Cart
 		When Move Cursor to the Electronics
    And Move to Laptop and desktop
    And click Gaming Laptop
    And Select lowest Price laptop 
   	#And Click add to Cart 
    #Then Validate the Add to cart page

 @TVandAppliance
  Scenario: Adding Lowest price of TV to Cart
  	When Select Applianances
    And Navigated to Tv & Appliances
    And Navigate to Samsung TV
    #And Select lowest price TV
    #And Select add to Cart 
   	#Then Validate the Add to cart page
    
@HomeSofa
  Scenario: Adding Lowest price of TV to Cart
    When Click Home
    And Move to LivingRoom Furniture
    And click Sofa
    And Select Highest price sofa 
    And Click add to Cart 
   	Then Validate the Add to cart page
    
@HomeCoffee
  Scenario: Adding Lowest price of TV to Cart
    When Move Cursor to the Home
    And Move to TableWare and Dinnerware
    And click CoffeMug
    And Select lowest price sofa 
    And Click add to Cart
    Then Validate the Add to cart page