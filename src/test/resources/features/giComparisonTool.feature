Feature: Comparison tool program search feature and font

@searchProgram
  Scenario: user is able to search for programs in Comparison Tool

  Given User is able to locate Comparison Tool and search for an institution
  When User clicks on the institution, scrolls down and is able to click on Non College-Degree programs
  And User is taken to the search page with filters
  Then User is able to search programs with the intended font in display