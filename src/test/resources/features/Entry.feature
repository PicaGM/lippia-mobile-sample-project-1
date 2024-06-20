@Entry @Regression
Feature: Generar una entrada de datos en Clockify

  @TimeEntry @Smoke
  Scenario Outline: Crear una entrada en la app de Clockify
    Given el usuario abre la app
    When el usuario inicia sesion con mail y contraseña
    And selecciona crear nuevo proyecto
    And rellena las casillas de <horario> y <descripcion>
    And presiona el boton guardar
    Then el proyecto se crea correctamente y se encuentra en el inicio

    Examples:
      | horario | descripcion |
      | 12      | Integrador  |
      | 08      | TPFinal     |

  @DateEntry @Smoke
  Scenario Outline: Crear una entrada en la app de Clockify
    Given el usuario abre la app
    When el usuario inicia sesion con mail y contraseña
    And selecciona crear nuevo proyecto
    And rellena las casillas de <horario> y <descripcion>
    And se selecciona una <fecha> para el proyecto
    And presiona el boton guardar
    Then el proyecto se crea correctamente y se encuentra en el inicio

    Examples:
      | horario | descripcion | fecha |
      | 12      | Integrador  | 15    |
      | 08      | TPFinal     | 23    |

  @CancelEntry @Smoke
  Scenario Outline: Crear una entrada en la app de Clockify
    Given el usuario abre la app
    When el usuario inicia sesion con mail y contraseña
    And selecciona crear nuevo proyecto
    And rellena las casillas de <horario> y <descripcion>
    And cancela la creacion de la entrada
    Then el usuario vuelve a la pantalla de entradas

    Examples:
      | horario | descripcion |
      | 12      | Integrador  |
      | 08      | TPFinal     |