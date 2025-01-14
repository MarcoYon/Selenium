package com.bdd.web.stepdefinition;

import com.bdd.web.step.LoginStep;
//import net.thucydies.core.annotations.Steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
//import net.serenitybdd.annotations.Steps;
import org.junit.Assert;


public class LoginStepDefinition {

//    @Steps
//    private LoginStep loginStep;

    LoginStep loginStep= new  LoginStep();

    @Given("que abro la pagina de organizate")
    public void queAbroLaPaginaDeOrganizate() {
        loginStep.abrirPagina();
    }

    @When("presiono el boton inicio de sesion")
    public void presionoElBotonInicioDeSesion() {
    }

    @And("relleno el formulario con los datos del cliente")
    public void rellenoElFormularioConLosDatosDelCliente() {
    }

    @And("ingreso el password {string}")
    public void ingresoElPassword(String arg0) {
    }


}
