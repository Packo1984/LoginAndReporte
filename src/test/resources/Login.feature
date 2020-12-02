Feature: Login Functionality

  In order to do internet banking
  As a valid automationpractice customer
  I want to login successfully

# Scenario Example
  @Login
  Scenario: Login Successful

    Given Usuario esta en al pantalla de login de la aplicación automationpractice
    When Usuario ingresa credenciales validas
    Then muestra pagina de inicio
