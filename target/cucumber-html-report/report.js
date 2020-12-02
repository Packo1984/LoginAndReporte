$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Login.feature");
formatter.feature({
  "name": "Login Functionality",
  "description": "  In order to do internet banking\n  As a valid automationpractice customer\n  I want to login successfully",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login Successful",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Usuario esta en al pantalla de login de la aplicación automationpractice",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.Steps.estarPantallaLogin() in file:/C:/Users/Hitss/IdeaProjects/PruebasCucunber1/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Usuario ingresa credenciales validas",
  "keyword": "When "
});
formatter.match({
  "location": "steps.Steps.IngresarCredencialesValidas() in file:/C:/Users/Hitss/IdeaProjects/PruebasCucunber1/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "muestra pagina de inicio",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.Steps.muestraPaginaInicio() in file:/C:/Users/Hitss/IdeaProjects/PruebasCucunber1/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});