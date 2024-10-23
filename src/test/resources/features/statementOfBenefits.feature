Feature: testing the login page

  @wip

  Scenario: User signs in to see statement of Benefits Page

  Given user on VA staging environment for statement of benefits
  When user signs in to staging environment statement of benefits
  Then user is able to see their statement of Benefits page

@print

Scenario: User signs in to statement of Benefits and is able to print the page

  Given user signs in to staging environment using ID.me
  When user checks statement of benefits
  Then user is able to print their statement of benefits page