Feature: Gmail
  As a Gmail User
  In order to send photos to others
  I want to be able to attach an image to an email

  Background:
    Given User is on the gmail main page
    And User logs into a valid gmail account
    And User is ready to send a new email

#    NORMAL FLOW:
  Scenario Outline: Successfully sending an email with a valid image attached to a valid recipient
    Given User enters <recipient> in the recipient field
    And User enters <subject> in the subject field
    And User selects <image> from their files
    And User sends the email
    Then a pop up message should appear saying Message Sent
    Examples:
      | recipient | subject | image |
      | "arielleilana428@gmail.com" | "ecse428 gmail test001" |"/Users/ilanahaddad/Desktop/428images/image001.jpg" |
#      | "ilana.haddad97@gmail.com" | "ecse428 gmail test002" |"/Users/ilanahaddad/Desktop/428images/image002.jpg" |
#      | "ilana_haddad@hotmail.com" | "ecse428 gmail test003" |"/Users/ilanahaddad/Desktop/428images/image003.jpg" |
#      | "ilana.haddad@mail.mcgill.ca" | "ecse428 gmail test004" |"/Users/ilanahaddad/Desktop/428images/image004.jpg" |
#      | "arielle.lasry@mail.mcgill.ca" | "ecse428 gmail test005" |"/Users/ilanahaddad/Desktop/428images/image005.jpg" |

