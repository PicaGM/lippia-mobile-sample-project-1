package com.crowdar.examples.steps;

import com.crowdar.examples.services.ConfigService;
import com.crowdar.examples.services.EntryService;
import io.cucumber.java.en.*;

public class ConfigSteps {
    @And("hace click en la barra de opciones y luego en Settings")
    public void haceClickEnLaBarraDeOpcionesYLuegoEnSettings() {
        ConfigService.settings();
    }

    @And("hace click en App Theme y selecciona el tema Dark")
    public void haceClickEnAppThemeYSeleccionaElTemaDark() {
        ConfigService.selectTheme();
    }

    @Then("se aplica el tema oscuro en la app")
    public void seAplicaElTemaOscuroEnLaApp() {
        ConfigService.themeConfirm();
    }
}
