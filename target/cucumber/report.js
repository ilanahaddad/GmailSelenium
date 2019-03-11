$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("gmail.feature");
formatter.feature({
  "line": 1,
  "name": "Gmail",
  "description": "As a Gmail User\nIn order to send photos to others\nI want to be able to attach an image to an email",
  "id": "gmail",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 11,
      "value": "#    NORMAL FLOW:"
    }
  ],
  "line": 12,
  "name": "Successfully sending an email with a valid image attached to a valid recipient",
  "description": "",
  "id": "gmail;successfully-sending-an-email-with-a-valid-image-attached-to-a-valid-recipient",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "User enters \u003crecipient\u003e in the recipient field",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User enters \u003csubject\u003e in the subject field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User selects \u003cimage\u003e from their files",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User sends the email",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "a pop up message should appear saying Message Sent",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "gmail;successfully-sending-an-email-with-a-valid-image-attached-to-a-valid-recipient;",
  "rows": [
    {
      "cells": [
        "recipient",
        "subject",
        "image"
      ],
      "line": 19,
      "id": "gmail;successfully-sending-an-email-with-a-valid-image-attached-to-a-valid-recipient;;1"
    },
    {
      "cells": [
        "\"arielleilana428@gmail.com\"",
        "\"ecse428 gmail test001\"",
        "\"/Users/ilanahaddad/Desktop/428images/image001.jpg\""
      ],
      "line": 20,
      "id": "gmail;successfully-sending-an-email-with-a-valid-image-attached-to-a-valid-recipient;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "User is on the gmail main page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User logs into a valid gmail account",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User is ready to send a new email",
  "keyword": "And "
});
formatter.match({
  "location": "GmailSteps.user_is_on_the_gmail_main_page()"
});
formatter.result({
  "duration": 1301942659,
  "error_message": "java.lang.AssertionError: Timeout waiting for Page Load Request to complete.\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat com.ilana.arielle.GmailSteps.waitForPageLoaded(GmailSteps.java:47)\n\tat com.ilana.arielle.GmailSteps.user_is_on_the_gmail_main_page(GmailSteps.java:59)\n\tat ✽.Given User is on the gmail main page(gmail.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "location": "GmailSteps.user_logs_into_a_valid_gmail_account()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GmailSteps.user_is_ready_to_send_a_new_email()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 20,
  "name": "Successfully sending an email with a valid image attached to a valid recipient",
  "description": "",
  "id": "gmail;successfully-sending-an-email-with-a-valid-image-attached-to-a-valid-recipient;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "User enters \"arielleilana428@gmail.com\" in the recipient field",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User enters \"ecse428 gmail test001\" in the subject field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User selects \"/Users/ilanahaddad/Desktop/428images/image001.jpg\" from their files",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User sends the email",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "a pop up message should appear saying Message Sent",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "arielleilana428@gmail.com",
      "offset": 13
    }
  ],
  "location": "GmailSteps.user_enters_in_the_recipient_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "ecse428 gmail test001",
      "offset": 13
    }
  ],
  "location": "GmailSteps.user_enters_in_the_subject_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "/Users/ilanahaddad/Desktop/428images/image001.jpg",
      "offset": 14
    }
  ],
  "location": "GmailSteps.user_selects_from_their_files(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GmailSteps.user_sends_the_email()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GmailSteps.a_pop_up_message_should_appear_saying_Message_Sent()"
});
formatter.result({
  "status": "skipped"
});
});