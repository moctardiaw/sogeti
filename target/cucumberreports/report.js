$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login Sogeti",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@prod"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Se connecter via le lien mot de passe oublie",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "je suis sur la page de connexion",
  "keyword": "Given "
});
formatter.step({
  "name": "cliquer sur Lost your password?",
  "keyword": "When "
});
formatter.step({
  "name": "Saisir un \u0027\u003cemail invalid\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "cliquer sur Reset Password",
  "keyword": "And "
});
formatter.step({
  "name": "Un message d’erreur s’affiche \u0027Invalid username or e-mail\u0027",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email invalid"
      ]
    },
    {
      "cells": [
        "tes@yopmail.com.toto"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Se connecter via le lien mot de passe oublie",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@prod"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "je suis sur la page de connexion",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.je_suis_sur_la_page_de_connexion()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cliquer sur Lost your password?",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.cliquer_sur_Lost_your_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Saisir un \u0027tes@yopmail.com.toto\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.saisirUnEmailInvalid(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cliquer sur Reset Password",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.cliquer_sur_Reset_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Un message d’erreur s’affiche \u0027Invalid username or e-mail\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.un_message_d_erreur_s_affiche(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});