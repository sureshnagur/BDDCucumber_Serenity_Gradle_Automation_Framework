Feature: Application login I want to use this template for my feature file

#  Background: #we use background keyword when we want to run common steps before running any
    #scenario in that case will use backgrounfd keyword whatever steps associated with this keyword will
    #be executed  first after that repective scenario will run which is mentioned in runner file tag
    #the scope of background keyword is limited to that particular feature file only.
#  Given set the environment
#  Then check the environment

  # we can give more than one tag also for single scenario.
  @netBanking
  Scenario:Admin page login
    Given User is on landing page
    When User enter usename as sureshnagur and password as test123 login into application
    Then home page is displayed
    And crede card details should be displayed

  @mortgage
  Scenario: Mortage page login
    Given User is on landing page
    When User enter usename as akash and password as test234 login into application
    Then home page is displayed
    And crede card details should be displayed
