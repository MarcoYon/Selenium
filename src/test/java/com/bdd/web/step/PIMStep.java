package com.bdd.web.step;

import com.bdd.web.page.PIMPage;

public class PIMStep {

    PIMPage pimPage= new PIMPage();

    public void clickBtnAgregar()
    {
        pimPage.presionarBtnAgregar();
    }
    public void completarNombresUser(String firstName, String middleName, String lastName)
    {
        pimPage.completarNombresUser(firstName,  middleName, lastName);
    }

    public boolean habilitarLogin(String checkLogin)
    {
       return pimPage.CheckLogin(checkLogin);
    }

    public void rellenarCreateLogin01(String userName, String chkStatus )
    {
        pimPage.rellenarCreateLogin01(userName, chkStatus);
    }

    public void rellenarCreateLogin02(String pwd )
    {
        pimPage.rellenarCreateLogin02(pwd);
    }

}
