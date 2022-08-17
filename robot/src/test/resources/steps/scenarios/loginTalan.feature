@loginTalan
Feature: loginTalan (login to talan academy)

  Scenario Outline:  login to talan academy

    Given I check that 'mail' '<mail>' is not empty
    Given I check that 'password' '<password>' is not empty

    Given 'TALAN_HOME' is opened
    Then The TALAN home page is displayed
    And I update text $talan.TalanPage-emailField with '<mail>'
    And I update text $talan.TalanPage-passwordField with '<password>'
    And I click on $talan.TalanPage-submitButton
    And I wait 5 seconds
    And I click on $talan.TalanPage-menu
    And I click on $talan.TalanPage-userAccount
    And I click on $talan.TalanPage-profil
    And I update text $talan.TalanPage-phone with '52081543'
    And I wait 5 seconds
    And I click on $talan.TalanPage-save
    And I

  Examples:
    #DATA
    |id|mail|password|
    |1|jihene.saidane@talan.com|jihene123|
    #END
