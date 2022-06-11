Feature: US03 Auto Exercise
 Scenario: TC-01 Negative Test


   Given  Navigate to url 'http://automationexercise.com'
   Then Verify that home page is visible successfully
   Then Click on 'Signup / Login' button
   Then Verify 'Login to your account' is visible
   Then Enter incorrect email address and password
   Then Click 'login' button
   And  Verify error 'Your email or password is incorrect!' is visible