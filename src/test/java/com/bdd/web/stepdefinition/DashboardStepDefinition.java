package com.bdd.web.stepdefinition;

import com.bdd.web.step.DashboardStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DashboardStepDefinition {

    DashboardStep dashboardStep = new DashboardStep();

    @Then("valido que ingrese a la pantalla principal Dashboard")
    public void validoQueIngreseALaPantallaPrincipalDashboard() {
        dashboardStep.validarInicio();
    }

    @And("selecciono la opcion {string} del menu")
    public void seleccionoLaOpcionDelMenu(String itemMenu) {
        dashboardStep.selectItemMenu(itemMenu);
    }
}
