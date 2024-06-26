package com.crowdar;

import com.crowdar.examples.services.ApiHelperService;
import io.cucumber.java.Before;

public class Hooks {
    @Before("eliminar las entradas creadas")
    public void eliminarLasEntradasCreadas() {
        ApiHelperService.sendDeleteRequest();
    }
}
