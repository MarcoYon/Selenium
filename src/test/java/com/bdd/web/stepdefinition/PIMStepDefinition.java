package com.bdd.web.stepdefinition;

import com.bdd.web.page.PIMPage;
import com.bdd.web.step.PIMStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PIMStepDefinition {

    PIMStep pimStep = new PIMStep();
    static boolean createPwd;

    @And("presiono el boton agregar")
    public void presionoElBotonAgregar() {
        pimStep.clickBtnAgregar();
    }

    @And("ingreso los datos del usuario {string}, {string}, {string}")
    public void ingresoLosDatosDelUsuario(String firstName, String middleName, String lastName) {
        pimStep.completarNombresUser(firstName,middleName,lastName);
    }

    @And("habilitamos la creacion de su Login {string}")
    public void habilitamosLaCreacionDeSuLogin(String checkLogin) {
       createPwd = pimStep.habilitarLogin(checkLogin);
    }

    @And("ingresamos el {string}, seleccionamos el status {string}")
    public void ingresamosElSeleccionamosElStatus(String userName, String chkStatus ) {
        if(createPwd==true){
            pimStep.rellenarCreateLogin01(userName,"admin");
        }
    }

    @And("ingresamos el password {string} y confirmamos el password")
    public void ingresamosElPasswordYConfirmamosElPassword(String pwd) {
        if(createPwd==true){
            pimStep.rellenarCreateLogin02(pwd);
        }
    }

    @Then("presionamos en save para crear el empleado")
    public void presionamosEnSaveParaCrearElEmpleado() {
        pimStep.rellenarCreateLogin03();
    }
}
