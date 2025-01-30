package com.bdd.web.stepdefinition;

import com.bdd.web.step.LoginStep;
//import net.thucydies.core.annotations.Steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefinition {

//    @Steps
//    private LoginStep loginStep;

    LoginStep loginStep = new LoginStep();

    @Given("que abro la pagina de OrangeHRM")
    public void queAbroLaPaginaDeOrangeHRM() {
        loginStep.abrirPagina();
    }

    @When("me logueo con mi usuario {string} y {string}")
    public void meLogueoConMiUsuarioY(String user, String password) {
        loginStep.loginUser(user, password);
    }


}
