@Configuration @Regression
  Feature: Comprobar el funcionamiento de las configuraciones de Clockify

    @DarkTheme @Smoke
    Scenario: Activar el modo oscuro en la apk
      Given el usuario abre la app
      When el usuario inicia sesion con mail y contraseña
      And hace click en la barra de opciones y luego en Settings
      And hace click en App Theme y selecciona el tema Dark
      Then se aplica el tema oscuro en la app