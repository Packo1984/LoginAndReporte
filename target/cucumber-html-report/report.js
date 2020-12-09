$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/AltaCliente.feature");
formatter.feature({
  "name": "Funcionalidad Alta Cciente de Individual Privado",
  "description": "  Se dan de alta cliente spara poder realizar\n  Emisiones en la linea de negocio de individual privado.",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Alta Cliente",
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
  "name": "Se ha ingresado en sección clientes",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.StepsClient.seccionCliente() in file:/C:/Users/Hitss/IdeaProjects/PruebasCucunber1/target/test-classes/"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat steps.StepsClient.seccionCliente(StepsClient.java:16)\r\n\tat ✽.Se ha ingresado en sección clientes(///C:/Users/Hitss/IdeaProjects/PruebasCucunber1/src/test/resources/AltaCliente.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "usuario Ingresa datos del cliente",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepsClient.usuarioIngresadatosdelcliente() in file:/C:/Users/Hitss/IdeaProjects/PruebasCucunber1/target/test-classes/"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "muestra ID",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepsClient.muestraID() in file:/C:/Users/Hitss/IdeaProjects/PruebasCucunber1/target/test-classes/"
});
formatter.result({
  "status": "skipped"
});
});