$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Home.feature");
formatter.feature({
  "name": "Home page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@All"
    },
    {
      "name": "@Home"
    }
  ]
});
formatter.scenario({
  "name": "Open Home page",
  "description": "Given: open the application on the browser",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@All"
    },
    {
      "name": "@Home"
    },
    {
      "name": "@TC_home_01"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The application should be open on the Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeTest.the_application_should_be_open_on_the_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});