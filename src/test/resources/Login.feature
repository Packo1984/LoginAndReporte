Feature: Login Functionality

  In order to do internet banking
  As a valid automationpractice customer
  I want to login successfully

# Scenario Example
  @Login
  Scenario: Login Successful

    Given Usuario esta en al pantalla de login de la aplicación automationpractice
    When Usuario ingresa credenciales validas
    When Usuario Ingresa Seccion Clientes
    When usuario Ingresa datos mínimos de captura
    When usuario elige tipo persona
    When usuario captura datos generales
    When usuario captura domicilios
    Then muestra pagina de inicio
