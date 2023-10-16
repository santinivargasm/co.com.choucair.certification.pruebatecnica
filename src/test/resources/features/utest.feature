# Autor: Santiago vargas
  @stories
  Feature: Utest
    As a user, I want to be able to register on the utest page
  @scenario1
  Scenario: the user wants to register
    Given than user wants to register in utest
    When user enters the utest page
    | name     | lastName | email                   | birthMonth | birthDay | birthYear | city   | zip    | country | computer | version | lenguage | movil | model      | system  | pwd   |
    | Santiago | Vargas   | santinivargasm@gmail.com| November   | 12       | 1993      | Bogota | 250258 | Colombia| Linux    | Mint    | Spanish  | Apple  | iPhone 3G | iOS 2.0 | 12345 |

    Then user makes a registration
    | finalText       |
    | Complete Setup  |

