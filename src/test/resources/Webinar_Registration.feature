Feature: Webinar Registration
  Scenario: To check whether after entering valid data user has taken to the landing page or not
    Given User is on Webinar Registration page "https://bldev.bridgelabz.com/webinar"
    When user enter the valid value to Phone number field "8142833524"
    And user enter the valid email to Email Id field "vijaya.kadiyala@bridgelabz.com"
    And user enter the valid Full name to Full name field "kadiyala vijaya"
    And user select the Year of Passout "2023"
    And user select the Education qualification "Engineering (CS/IT)"
    And click on Enter Room button
    Then The user should successfully registered and should navigate to the landing page


