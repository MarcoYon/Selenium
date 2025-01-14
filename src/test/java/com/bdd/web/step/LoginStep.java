package com.bdd.web.step;


import com.bdd.web.page.LoginPage;
//import net.serenitybdd.annotations.Steps;

public class LoginStep {

    //@Steps
    //private LoginPage loginPage;


    LoginPage loginPage= new LoginPage();

    public void abrirPagina() {
        loginPage.inicializar();
    }

}
