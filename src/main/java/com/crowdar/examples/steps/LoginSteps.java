package com.crowdar.examples.steps;
import com.crowdar.examples.services.LoginService;
import io.cucumber.java.en.*;

public class LoginSteps {
    @Given("el usuario abre la app")
    public void elUsuarioAbreLaApp() {
    }

    @When("el usuario inicia sesion con mail y contraseña")
    public void elUsuarioIniciaSesionConY() throws Exception {
        LoginService.loginClockify();
    }

    @Then("se inicia sesion con la cuenta")
    public void seIniciaSesionConLaCuenta() {
        LoginService.verifyLogin();
    }
}
