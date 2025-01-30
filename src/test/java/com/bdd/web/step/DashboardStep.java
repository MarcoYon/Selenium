package com.bdd.web.step;

import com.bdd.web.page.DashboardPage;
import org.junit.Assert;

public class DashboardStep {

    DashboardPage dashboardPage = new DashboardPage();

    public void validarInicio() {
       Assert.assertTrue("Validacion Conforme",dashboardPage.validarInicioSesion());;
    }

    public void selectItemMenu(String item) {
        dashboardPage.seleccionarItemMenuHome(item);
    }
}
