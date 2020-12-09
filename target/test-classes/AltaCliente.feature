Feature: Funcionalidad Alta clientes

  Validar que se permita el alta de clientes Persona Fisica

# Scenario Example
  @Login
  Scenario Outline: Alta Clientes Persona Fisica

    Given Ingresa al sistema satisfactoriamente <usuario> And <password>
    When Usuario Ingresa Seccion Clientes
    And usuario Ingresa datos mínimos de captura
    And usuario captura datos generales
    And usuario captura Lugar de nacimiento
    And usuario captura domicilios
    And usuario ingresa Telefonos
    And usuario ingresa Redes Sociales
    Then Captura Folio

    Examples:
    |usuario|password|
    |N3262623|SanchWz90|