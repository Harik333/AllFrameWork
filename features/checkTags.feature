@End2End
Feature: Checking Tags functionality in Cucumber

  @PositiveTest @GUITest
  Scenario: Happy Path
    Given Positive Test but GUI


  @PositiveTest @APITest
  Scenario: Negative Path
    Given Positive Test but API
