Feature: Mock Users with different scenarios are able to log in to see their Statement of Benefits Page

  @mock

  Scenario: mock user is able to see their statement of benefits page per expectation
    Given mock user on VA staging environment for statement of benefits
    When mock user signs in to staging environment statement of benefits
    Then mock user is able to see their statement of Benefits page
