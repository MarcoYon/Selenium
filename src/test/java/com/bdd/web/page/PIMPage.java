package com.bdd.web.page;

import com.bdd.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PIMPage extends Util{

    WebDriver driver;

    @FindBy(xpath = "//button[text()=' Add ' or text()='Add']")
    protected WebElement btnAgregar;

    @FindBy(css = "input[name=firstName]")
    protected WebElement txtFirstName;

    @FindBy(css = "input[name='middleName']")
    protected WebElement txtMiddleName;

    @FindBy(css = "input[name='lastName']")
    protected WebElement txtLastName;


    @FindBy(css = "input[type='checkbox']")
    protected WebElement chkDetails;

    @FindBy(css = "input[type='checkbox']:first-of-type + span")
    protected WebElement chkDetailsEleccion;


    @FindBy(xpath = "//label[text()='Username']//parent::div//parent::div//input")
    protected WebElement txtUserName;

    @FindBy(css = "div.oxd-radio-wrapper input:first-of-type + span")
    protected List<WebElement> chkStatus;

    @FindBy(css = "input[type='password']")
    protected List<WebElement> txtPassword;

    @FindBy(xpath = "//button[text()=' Save ' or text()='Save']")
    protected WebElement btnSave;

    @FindBy(xpath = "//button[text()=' Cancel ']")
    protected WebElement btnCancel;

    @FindBy(css = "div.orangehrm-tabs div:nth-child(1) a")
    protected WebElement saveEmployee;


    public PIMPage() {
        this.driver = getDriver();
        PageFactory.initElements(getDriver(), this);
    }

    public void presionarBtnAgregar()
    {
        scrollToElement(btnAgregar);
        waitForElementAndClick(btnAgregar,15);
        System.out.println("Presionar botón agregar");
    }

    public void completarNombresUser(String firstName, String middleName, String lastName)  {
        waitUntilElementIsVisible(txtFirstName);
        txtFirstName.sendKeys(firstName);
        txtMiddleName.sendKeys(middleName);
        txtLastName.sendKeys(lastName);


//        if(chkDetails.isSelected())
//        {
//            try {
//                Thread.sleep(5);
//            }
//            catch (InterruptedException e) {
//                e.getStackTrace();
//            }
//            chkDetailsEleccion.click();
//
//            try {
//                Thread.sleep(10);
//            }
//            catch (InterruptedException e) {
//                e.getStackTrace();
//            }
//
//            waitUntilElementIsVisible(txtUserName).sendKeys("mayn");
//            chkStatus.get(1).click();
//
//        }
//        else
//        {
//            System.out.println("Si estoy seleccionado" + chkDetails.isSelected());
//        }


    }

    public boolean CheckLogin(String chkLogin)
    {
        System.out.println("Estado - Create Login Details: " + chkDetails.isSelected());

        boolean selectChkLogin = Boolean.parseBoolean(chkLogin);
        if(selectChkLogin)
        {
            chkDetailsEleccion.click();
            System.out.println("Estado - Create Login Details: (habilitado) " + chkDetails.isSelected());
            return true;
        }

        return false;
    }

    public void rellenarCreateLogin01(String userName, String chkStatus)
    {
        waitUntilElementIsVisible(txtUserName).sendKeys(userName);
    }

    public void rellenarCreateLogin02(String pwd)
    {
        System.out.println("Ingresando mi contrasena");
        waitUntilElementIsVisible(txtPassword.get(0)).sendKeys(pwd);
        waitUntilElementIsVisible(txtPassword.get(1)).sendKeys(pwd);
        btnSave.click();

        waitUntilElementIsVisible(saveEmployee);

        System.out.println("usuario agregado");
    }

}
