package com.crowdar.examples.steps;

import com.crowdar.examples.services.LogoutService;
import io.cucumber.java.en.*;

public class LogoutSteps {
    @And("hace click en la barra de opciones y luego en Logout")
    public void haceClickEnLaBarraDeOpcionesYLuegoEnLogout() {
        LogoutService.logoutProcess();
    }

    @And("confirma el cierre de sesion")
    public void confirmaElCierreDeSesion() {
        LogoutService.logoutConfirm();
    }

    @Then("salimos de sesion y volvemos a la pantalla de login")
    public void salimosDeSesionYVolvemosALaPantallaDeLogin() {
        LogoutService.logoutAssert();
    }
}
