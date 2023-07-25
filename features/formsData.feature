@FormDataAllMarkets
Feature: Form data for different markets



  Scenario Outline: form data for different company codes
    Given Launch form data URL in edge browser and perform login
    When  Enter general form data for particual company code like "<firstname>", "<lastname>" and "<age>"
    Then  message is "Success"
    
  Examples:
  
  | firstname | lastname | age |
  
  | Harish    | K        | 30  |
  
  | Roger     | Federer  | 41  |
  
  
    
    



