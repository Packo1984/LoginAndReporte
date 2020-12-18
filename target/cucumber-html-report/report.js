$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/AltaCliente.feature");
formatter.feature({
  "name": "Funcionalidad Alta Clientes",
  "description": "  Validar que se permita el alta de clientes Persona Fisica",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Alta Clientes Persona Fisica",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Ingresa al sistema satisfactoriamente \"N3250232\" y \"1DfVLd2T\"",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.StepsAltaClientes.ingresaSatisfactoriamente(String,String) in file:/C:/Users/Hitss/IdeaProjects/PruebasCucunber1%20-%2011122020-Login%20y%20alta%20cliente%20(sinLogin)/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Usuario llena datos del cliente",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepsAltaClientes.IngresaDatosClientes() in file:/C:/Users/Hitss/IdeaProjects/PruebasCucunber1%20-%2011122020-Login%20y%20alta%20cliente%20(sinLogin)/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validar id de clientes",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepsAltaClientes.validar_id_de_clientes() in file:/C:/Users/Hitss/IdeaProjects/PruebasCucunber1%20-%2011122020-Login%20y%20alta%20cliente%20(sinLogin)/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
});