package com.bdd.web.page;



import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;


public class LoginPage extends PageObject {

    @FindBy(xpath = "//bcp-title/h2")
    protected WebElement txtTituloFormulario;

    public void inicializar() {
        open();
        getDriver().manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
    }

}
