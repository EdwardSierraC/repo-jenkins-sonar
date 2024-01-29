#Author: Edward Sierra

  Feature: Login to the de academy website
    As a user, I want to log in to the choucair academy website to study

  @Login
  Scenario Outline: Login to the website
    Given I have to login in the website
    When I type my username and password
      | user   | password   |
      | <user> | <password> |
    Then I should see the courses Pensum Choucair

    Examples:
      | user     | password    |
      | esierrac | Edw4rd2024* |