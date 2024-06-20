package com.crowdar.examples.steps;

import com.crowdar.api.rest.Response;
import com.crowdar.examples.services.ApiHelperService;
import com.crowdar.examples.services.EntryService;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.testng.annotations.BeforeTest;

public class EntrySteps {
    @And("selecciona crear nuevo proyecto")
    public void seleccionaCrearNuevoProyecto() {
        EntryService.createProject();
    }

    @Then("el proyecto se crea correctamente y se encuentra en el inicio")
    public void elProyectoSeCreaCorrectamenteYSeEncuentraEnElInicio() {
        EntryService.verifyProject();
    }

    @And("rellena las casillas de (.*) y (.*)")
    public void rellenaLasCasillasDeY(String horario, String descripcion) {
        EntryService.setProjectValues(horario, descripcion);
    }

    @And("cancela la creacion de la entrada")
    public void cancelaLaCreacionDeLaEntrada() {
        EntryService.cancelEntry();
    }

    @Then("el usuario vuelve a la pantalla de entradas")
    public void elUsuarioVuelveALaPantallaDeEntradas() {
        EntryService.verifyBack();
    }

    @And("se selecciona una (.*) para el proyecto")
    public void seSeleccionaUnaFechaParaElProyecto(int date) {
        EntryService.selectDate(date);
    }

    @And("presiona el boton guardar")
    public void presionaElBotonGuardar() {
        EntryService.saveEntry();
    }
}
