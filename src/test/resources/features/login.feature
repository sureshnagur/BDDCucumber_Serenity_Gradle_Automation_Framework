Feature: Application login
  I want to use this template for my feature file
  
  Background:  #we use background keyword when we want to run common steps before running any 
  #scenario in that case will use backgrounfd keyword whatever steps associated with this keyword will 
  #be executed  first after that repective scenario will run which is mentioned in runner file tag
  Given set the environment
  Then check the environment

# we can give more than one tag also for single scenario.
  @tag1
  Scenario: Admin page login
    Given User is on landing page
    When User enter usename as sureshnagur and password as test123 login into application
    Then home page is displayed
    And crede card details should be displayed

  @tag3
  Scenario Outline: Admin page login   #we will use scenario outline when we want to run same test cases again and again with multple sets of data.
    Given User is on landing page
    When User enter usename as <username> and password as <password> login into application
    Then home page is displayed
    And crede card details should be displayed

    Examples: 
      | username | password |
      | suresh   | test123  |
      | akash    | test234  |

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with "<name>"
    When I check for the "<value>" in step
    Then I verify the "<status>" in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |

  @tag4
  Scenario: User is on Sign in Page
    Given User is on signin page
    When User enter signin details
    | rahul |
    | shetty |
    |46646446654|
    |test@gmail.com|
    Then home page is displayed
    And crede card details should be displayed
