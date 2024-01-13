Feature: Test Facebook App

  Scenario Outline: Test Reg Page
    Given user is on reg Page
    When user enters "<firstname>", "<lastname>" ,"<username>" and "<password>"

    Examples: 
      | firstname | lastname | username      | password |
      | nikhil    | patil    | nik@gmail.com | Nik123   |
      | amol      | patil    | amol@gmail    | abhir    |
