#@activity3
#Feature:Testing with Tags
#  @smokeTest
#  Scenario: Testing with Simple Alert
#    Given User is on the page
#    When User clicks the Simple Alert button
#    Then Alert opens
#    And Read the text from it and print it
#  And Close the alert
#  And Read the result text
#  And Close Browser
#
#  @smokeTest
#  Scenario: Testing with Confirm Alert
#    Given User is on the page
#    When User clicks the Simple Alert button
#    Then Alert opens
#    And Read the text from it and print it
#  And Close the alert
#  And Read the result text
#  And Close Browser
#
#  @smokeTest
#  Scenario: Testing with Prompt Alert
#    Given User is on the page
#    When User clicks the Simple Alert button
#    Then Alert opens
#    And Read the text from it and print it
#  And Close the alert
#  And Read the result text
#  And Close Browser
  @activity3
  Feature: Testing with Tags

  @SmokeTest
  @SimpleAlert
  Scenario: Testing with Simple Alert
    Given User is on the page
    When User clicks the Simple Alert button
    Then Alert opens
    And Read the text from it and print it
    And Close the alert
    And Read the result text
    And Close Browser

  @ConfirmAlert
  Scenario: Testing with Confirm Alert
    Given User is on the page
    When User clicks the Confirm Alert button
    Then Alert opens
    And Read the text from it and print it
    And Close the alert with cancel
    And Read the result text
    And Close Browser

  @PromptAlert
  Scenario Outline: Testing with Prompt Alert
    Given User is on the page
    When User clicks the Prompt Alert button
    Then Alert opens
    And Read the text from it and print it
    And Write a custom message in it "<customMessage>"
    And Close the alert
    And Read the result text
    And Close Browser

    Examples:
      | customMessage   |
      | CustomMessage1  |
      | CustomMessage2  |


