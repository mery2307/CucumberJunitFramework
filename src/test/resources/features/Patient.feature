@regression @many
Feature: patient page related test cases

  Background:
    And user goes to sign in page
    And user enters username "nurse.garcia@mediflow.com"
    And user enters password "Test@1234"
    And user clicks on sign in button

  @newPatient
  Scenario Outline: verify user can create a new patient
    And user navigates to Patients page
    And user clicks on New Patient button
    And user fills the form with following data
      | firstName | <firstName> |
      | lastName  | <lastName>  |
      | dob       | <dob>       |
      | gender    | <gender>    |
      | phone     | <phone>     |
    And user clicks on Create Patient button
    And verify new patient was created
    And delete patient
    Examples:
      | firstName | lastName | dob        | gender | phone      |
      | Brad      | Pitt     | 12/15/1955 | Male   | 1239946457 |
      | Elon      | Musk     | 11/23/1965 | Male   | 1223429654 |
      | Sam       | Altman   | 06/10/1945 | Female | 1231244684 |
      | Tim       | Cook     | 12/15/1996 | Female | 1234762424 |


  @genderTest @smoke @otherTag
  Scenario: verify gender filter in patients list: female, male and other
    And user navigates to Patients page
#    When user selects gender verify patients display correct gender
#      | Female |
#      | Male   |
#      | Other  |

#  Scenario: verify gender filter in patients list: female, male and other
#    And user navigates to Patients page
#    When user selects "Female" in All Genders dropdown
#    Then verify "Female" patients are displayed
