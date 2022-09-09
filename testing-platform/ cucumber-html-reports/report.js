$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Selenium.feature");
formatter.feature({
  "line": 2,
  "name": "Search for laptops on Emag",
  "description": "",
  "id": "search-for-laptops-on-emag",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tags"
    }
  ]
});
formatter.before({
  "duration": 4660693000,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "1 Verify that I can see a product page",
  "description": "",
  "id": "search-for-laptops-on-emag;1-verify-that-i-can-see-a-product-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "that i am on emag page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I go to the Laptops page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on the first laptop",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "The Item Page will display the \"Adauga la Favorite\" button",
  "keyword": "Then "
});
formatter.match({
  "location": "JunitStepDefs.that_i_am_on_emag_page()"
});
formatter.result({
  "duration": 4857091000,
  "status": "passed"
});
formatter.match({
  "location": "JunitStepDefs.iGoToTheLaptopsPage()"
});
formatter.result({
  "duration": 5339171000,
  "status": "passed"
});
formatter.match({
  "location": "JunitStepDefs.iClickOnTheFirstLaptop()"
});
formatter.result({
  "duration": 1129074100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adauga la Favorite",
      "offset": 32
    }
  ],
  "location": "JunitStepDefs.theItemPageWillDisplayTheButton(String)"
});
formatter.result({
  "duration": 158656900,
  "status": "passed"
});
formatter.after({
  "duration": 846675000,
  "status": "passed"
});
formatter.before({
  "duration": 1946100100,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "2 Verify that search will open the correct page",
  "description": "",
  "id": "search-for-laptops-on-emag;2-verify-that-search-will-open-the-correct-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "that i am on emag page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I search for \"laptop\" text",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I click on the first item",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "The Item Page will display the \"Adauga la Favorite\" button",
  "keyword": "Then "
});
formatter.match({
  "location": "JunitStepDefs.that_i_am_on_emag_page()"
});
formatter.result({
  "duration": 3933894700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "laptop",
      "offset": 14
    }
  ],
  "location": "JunitStepDefs.iSearchFor(String)"
});
formatter.result({
  "duration": 1830118200,
  "status": "passed"
});
formatter.match({
  "location": "JunitStepDefs.iClickOnTheFirstItem()"
});
formatter.result({
  "duration": 2305781500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adauga la Favorite",
      "offset": 32
    }
  ],
  "location": "JunitStepDefs.theItemPageWillDisplayTheButton(String)"
});
formatter.result({
  "duration": 173204500,
  "status": "passed"
});
formatter.after({
  "duration": 1009856600,
  "status": "passed"
});
formatter.before({
  "duration": 2345997600,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "3 Verify that search result elements are in correct order",
  "description": "",
  "id": "search-for-laptops-on-emag;3-verify-that-search-result-elements-are-in-correct-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "that i am on emag page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I search for \"laptop\" text",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I order the results by \"Pret descrescator\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Order list was changed",
  "keyword": "Then "
});
formatter.match({
  "location": "JunitStepDefs.that_i_am_on_emag_page()"
});
formatter.result({
  "duration": 4662166600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "laptop",
      "offset": 14
    }
  ],
  "location": "JunitStepDefs.iSearchFor(String)"
});
formatter.result({
  "duration": 1937596200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pret descrescator",
      "offset": 24
    }
  ],
  "location": "JunitStepDefs.iOrderTheResultsBy(String)"
});
formatter.result({
  "duration": 420046900,
  "status": "passed"
});
formatter.match({
  "location": "JunitStepDefs.order_list_was_changed()"
});
formatter.result({
  "duration": 45449000,
  "status": "passed"
});
formatter.after({
  "duration": 908886700,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 26,
  "name": "4 Verify that search will open the correct page",
  "description": "",
  "id": "search-for-laptops-on-emag;4-verify-that-search-will-open-the-correct-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 27,
  "name": "that i am on emag page",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "I search for \"\u003csearchProduct\u003e\" text",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I click on the first item",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "The Item Page will display the \"Adauga la Favorite\" button",
  "keyword": "Then "
});
formatter.examples({
  "line": 31,
  "name": "",
  "description": "",
  "id": "search-for-laptops-on-emag;4-verify-that-search-will-open-the-correct-page;",
  "rows": [
    {
      "cells": [
        "searchProduct"
      ],
      "line": 32,
      "id": "search-for-laptops-on-emag;4-verify-that-search-will-open-the-correct-page;;1"
    },
    {
      "cells": [
        "tv"
      ],
      "line": 33,
      "id": "search-for-laptops-on-emag;4-verify-that-search-will-open-the-correct-page;;2"
    },
    {
      "cells": [
        "phone"
      ],
      "line": 34,
      "id": "search-for-laptops-on-emag;4-verify-that-search-will-open-the-correct-page;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2725647700,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "4 Verify that search will open the correct page",
  "description": "",
  "id": "search-for-laptops-on-emag;4-verify-that-search-will-open-the-correct-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tags"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "that i am on emag page",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "I search for \"tv\" text",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I click on the first item",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "The Item Page will display the \"Adauga la Favorite\" button",
  "keyword": "Then "
});
formatter.match({
  "location": "JunitStepDefs.that_i_am_on_emag_page()"
});
formatter.result({
  "duration": 4264194700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tv",
      "offset": 14
    }
  ],
  "location": "JunitStepDefs.iSearchFor(String)"
});
formatter.result({
  "duration": 2326840200,
  "status": "passed"
});
formatter.match({
  "location": "JunitStepDefs.iClickOnTheFirstItem()"
});
formatter.result({
  "duration": 1901949000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adauga la Favorite",
      "offset": 32
    }
  ],
  "location": "JunitStepDefs.theItemPageWillDisplayTheButton(String)"
});
formatter.result({
  "duration": 343393400,
  "status": "passed"
});
formatter.after({
  "duration": 1013209700,
  "status": "passed"
});
formatter.before({
  "duration": 2283617400,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "4 Verify that search will open the correct page",
  "description": "",
  "id": "search-for-laptops-on-emag;4-verify-that-search-will-open-the-correct-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tags"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "that i am on emag page",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "I search for \"phone\" text",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I click on the first item",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "The Item Page will display the \"Adauga la Favorite\" button",
  "keyword": "Then "
});
formatter.match({
  "location": "JunitStepDefs.that_i_am_on_emag_page()"
});
formatter.result({
  "duration": 4216470000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "phone",
      "offset": 14
    }
  ],
  "location": "JunitStepDefs.iSearchFor(String)"
});
formatter.result({
  "duration": 2065185600,
  "status": "passed"
});
formatter.match({
  "location": "JunitStepDefs.iClickOnTheFirstItem()"
});
formatter.result({
  "duration": 1668249800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adauga la Favorite",
      "offset": 32
    }
  ],
  "location": "JunitStepDefs.theItemPageWillDisplayTheButton(String)"
});
formatter.result({
  "duration": 373990500,
  "status": "passed"
});
formatter.after({
  "duration": 917473000,
  "status": "passed"
});
});