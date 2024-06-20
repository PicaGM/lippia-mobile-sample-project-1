@Login @Regression
Feature: Como cliente de la applicacion quiero probar el correcto inicio de sesion de la misma

  @LoginExitoso @Smoke
  Scenario: Iniciar sesion en la app de Clockify
    Given el usuario abre la app
    When el usuario inicia sesion con mail y contraseña
    Then se inicia sesion con la cuenta