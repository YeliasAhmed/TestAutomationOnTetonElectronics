Feature: Verify the Login Functionality

#TC_01
  @Teton
  Scenario: Verify that the Teton home page all options are available
    Given Home page is displayed
    Then Check that the all home page options are available


#TC_02
  @Teton
  Scenario: Verify that the users receive an error message "This email is not registered"
    Given Home page is displayed
    Then Check that the login option is available
    When Click on the login option
    Then Check that the login form is displayed
    When users give unregistered email with password
    And Click on the login Button
    Then Check that the "This email is not registered" message is displayed


#TC_03
  @Teton
  Scenario: Verify that the new user is registered successfully
    Given Home page is displayed
    Then Check that the login option is available
    When Click on the login option
    Then Check that the register button is available
    When Click on the register button
    Then Check that the registration form is displayed
    When Fill up the all mandatory field
    And hover to the user profile
    And Click on the settings
    Then Check that the registered user information is displayed


#TC_04
  @Teton
  Scenario: Verify that the user can log in successfully with a valid email and password
    Given Home page is displayed


#TC_05
  @Teton
  Scenario: Verify that the user cannot log in successfully with an invalid email and password
    Given Home page is displayed



#TC_06
  @Teton
  Scenario: Verify that the users receive an error message after giving unregistered email to reset password
    Given Home page is displayed



#TC_07
  @Teton
  Scenario: Verify that the "Remember me" functionality is working properly
    Given Home page is displayed



#TC_08
  @Teton
  Scenario: Verify that the user's address is created  successfully
    Given Home page is displayed



#TC_09
  @Teton
  Scenario: Verify that the product is saved to the wishlist
    Given Home page is displayed


#TC_10
  @Teton
  Scenario: Verify that the ordered product summary is displayed after checkout
    Given Home page is displayed


