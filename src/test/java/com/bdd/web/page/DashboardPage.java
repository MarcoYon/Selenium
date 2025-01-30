package com.bdd.web.page;

import com.bdd.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;


public class DashboardPage extends Util {

    WebDriver driver;

    @FindBy(css = "a.oxd-main-menu-item:first-child")
    protected WebElement dashboard;

    @FindBy(css = "a.oxd-main-menu-item span")
    protected List<WebElement> lstItemsMenu;

    @FindBy(xpath = "//h5[text()='System Users']")
    protected WebElement pantAdmin;

    @FindBy(xpath = "//label[contains(text(),'Username')]//parent::div/parent::div//div[2]//input")
    protected WebElement txtUserName;






    public DashboardPage() {
        this.driver = getDriver();
        PageFactory.initElements(getDriver(), this);
    }

    public boolean validarInicioSesion()
    {
        try
        {
            waitUntilElementIsVisible(dashboard);
            return dashboard.isDisplayed();
        } catch(Exception e)
        {   return false;}
    }

    public void seleccionarItemMenuHome(String item)
    {

        for (WebElement menu: lstItemsMenu)
        {
            String menuName = menu.getText();
            if(menuName.equals(item))
            {
                System.out.println("Opcion del menu: "+menuName);
                waitForElementAndClick(menu,15);
                break;

            }
        }

    }

}
