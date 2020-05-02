$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("accountOverview.feature");
formatter.feature({
  "line": 1,
  "name": "parabank Account Overview functionality",
  "description": "",
  "id": "parabank-account-overview-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Valid user should be able to view account overview",
  "description": "",
  "id": "parabank-account-overview-functionality;valid-user-should-be-able-to-view-account-overview",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user already login in Account Overview page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on Account Overview link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should click on logout page",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountOverview.user_already_login_in_Account_Overview_page()"
});
formatter.result({
  "duration": 25263208600,
  "status": "passed"
});
formatter.match({
  "location": "AccountOverview.user_click_on_Account_Overview_link()"
});
formatter.result({
  "duration": 582557500,
  "status": "passed"
});
formatter.match({
  "location": "AccountOverview.user_should_click_on_logout_page()"
});
formatter.result({
  "duration": 3450056300,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "parabank login functionality",
  "description": "",
  "id": "parabank-login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Valid user should be able to login successfully",
  "description": "",
  "id": "parabank-login-functionality;valid-user-should-be-able-to-login-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user already in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click on logout button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.user_already_in_login_page()"
});
formatter.result({
  "duration": 14461162701,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.user_enter_valid_credentials()"
});
formatter.result({
  "duration": 6173764900,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.user_click_on_login_button()"
});
formatter.result({
  "duration": 3518164100,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.user_click_on_logout_button()"
});
formatter.result({
  "duration": 3733560100,
  "status": "passed"
});
formatter.uri("openNewAccount.feature");
formatter.feature({
  "line": 1,
  "name": "parabank Open New Account functionality",
  "description": "",
  "id": "parabank-open-new-account-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Valid user should be able Open New Account",
  "description": "",
  "id": "parabank-open-new-account-functionality;valid-user-should-be-able-open-new-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user already in Account Overview page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on Open New Account",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user click on type of Account drop down and select account type",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click on OPEN NEW ACCOUNT button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user click on logout page",
  "keyword": "And "
});
formatter.match({
  "location": "OpenNewAccount.user_already_in_Account_Overview_page()"
});
formatter.result({
  "duration": 25037893100,
  "status": "passed"
});
formatter.match({
  "location": "OpenNewAccount.user_click_on_Open_New_Account()"
});
formatter.result({
  "duration": 3823949500,
  "status": "passed"
});
formatter.match({
  "location": "OpenNewAccount.user_click_on_type_of_Account_drop_down_and_select_account_type()"
});
formatter.result({
  "duration": 3087355599,
  "status": "passed"
});
formatter.match({
  "location": "OpenNewAccount.click_on_OPEN_NEW_ACCOUNT_button()"
});
formatter.result({
  "duration": 3052039099,
  "status": "passed"
});
formatter.match({
  "location": "OpenNewAccount.user_click_on_logout_page()"
});
formatter.result({
  "duration": 3454738600,
  "status": "passed"
});
});