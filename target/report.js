$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/krith/workspace/cum-pro/src/test/resources/Features/MobValidate.feature");
formatter.feature({
  "name": "Mobile validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@mobile"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_launches_flipkart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user handles the login",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_handles_the_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Mobile Validation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@mobile"
    }
  ]
});
formatter.step({
  "name": "user search mobile",
  "keyword": "When "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_search_mobile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the mobile and click add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_select_the_mobile_and_click_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user doing the payment",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_doing_the_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user recieve the confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_recieve_the_confirmation_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_launches_flipkart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user handles the login",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_handles_the_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Mobile Validation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@mobile"
    },
    {
      "name": "@map"
    }
  ]
});
formatter.step({
  "name": "user search mobile in oneD map",
  "rows": [
    {
      "cells": [
        "A11",
        "iPhone"
      ]
    },
    {
      "cells": [
        "B11",
        "SAMSUNG"
      ]
    },
    {
      "cells": [
        "C11",
        "realme"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_search_mobile_in_oneD_map(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the mobile and click add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_select_the_mobile_and_click_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user doing the payment",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_doing_the_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user recieve the confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_recieve_the_confirmation_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Mobile Validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@outline"
    }
  ]
});
formatter.step({
  "name": "user search mobile \"\u003cPhone\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user select the mobile and click add to cart",
  "keyword": "And "
});
formatter.step({
  "name": "user doing the payment",
  "keyword": "And "
});
formatter.step({
  "name": "user recieve the confirmation message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Phone"
      ]
    },
    {
      "cells": [
        "iPhone"
      ]
    },
    {
      "cells": [
        "SAMSUNG"
      ]
    },
    {
      "cells": [
        "realme"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_launches_flipkart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user handles the login",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_handles_the_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Mobile Validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@mobile"
    },
    {
      "name": "@outline"
    }
  ]
});
formatter.step({
  "name": "user search mobile \"iPhone\"",
  "keyword": "When "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_search_mobile(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the mobile and click add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_select_the_mobile_and_click_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user doing the payment",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_doing_the_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user recieve the confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_recieve_the_confirmation_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_launches_flipkart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user handles the login",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_handles_the_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Mobile Validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@mobile"
    },
    {
      "name": "@outline"
    }
  ]
});
formatter.step({
  "name": "user search mobile \"SAMSUNG\"",
  "keyword": "When "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_search_mobile(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the mobile and click add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_select_the_mobile_and_click_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user doing the payment",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_doing_the_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user recieve the confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_recieve_the_confirmation_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_launches_flipkart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user handles the login",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_handles_the_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Mobile Validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@mobile"
    },
    {
      "name": "@outline"
    }
  ]
});
formatter.step({
  "name": "user search mobile \"realme\"",
  "keyword": "When "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_search_mobile(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the mobile and click add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_select_the_mobile_and_click_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user doing the payment",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_doing_the_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user recieve the confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_recieve_the_confirmation_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});