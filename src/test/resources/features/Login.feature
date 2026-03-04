Feature: all login related test scenarios

Scenario: verify doctor can login login successfully

  Given user goes to sign in page
  When user enters username "dr.chen@mediflow.com"
  And user enters password "Test@1234"
  And user enters clicks on sign in button
  Then verify user signed in successfully


  Scenario: verify nurse can login login successfully
    Given user goes to sign in page
    When user enters username "nurse.garcia@mediflow.com"
    And user enters password "Test@1234"
    And user enters clicks on sign in button
    Then verify user signed in successfully

  Scenario: verify manager can login login successfully
    Given user goes to sign in page
    When user enters username "mgr.wilson@mediflow.com"
    And user enters password "Test@1234"
    And user enters clicks on sign in button
    Then verify user signed in successfully