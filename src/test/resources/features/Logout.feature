@Logout @Regression
  Feature: Comprobar el cierre de sesion en Clockify

    @LogoutExitoso @Smoke
      Scenario: Salir de la cuenta correctamente
      Given el usuario abre la app
      When el usuario inicia sesion con mail y contraseña
      And hace click en la barra de opciones y luego en Logout
      And confirma el cierre de sesion
      Then salimos de sesion y volvemos a la pantalla de login