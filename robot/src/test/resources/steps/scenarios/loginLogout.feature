@loginLogout
Feature: loginLogout (Scenario that 1st sample. Is it a login and logout on a JHipster sample.) 

  Scenario Outline:  Scenario that 1st sample. Is it a login and logout on a JHipster sample.

    Given I check that 'user' '<user>' is not empty
    Given I check that 'password' '<password>' is not empty

    Given 'JHIPSTERSAMPLE_HOME' is opened
    Then The JHIPSTERSAMPLE home page is displayed

    When I log in to JHIPSTERSAMPLE as '<user>' '<password>'
    Then The JHIPSTERSAMPLE portal is displayed with the login '<user>'

    When I log out of JHIPSTERSAMPLE
    Then The JHIPSTERSAMPLE logout page is displayed

    And I go back to 'JHIPSTERSAMPLE_HOME'
  Examples:
    #DATA
    |id|user|password|
    |1|user1|password1|
    |2|user2|password2|
    #END
