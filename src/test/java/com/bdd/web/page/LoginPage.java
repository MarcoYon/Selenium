package com.bdd.web.page;



import com.bdd.Util;
//import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;


public class LoginPage extends Util {

    WebDriver driver;

    @FindBy(css = "input[name='username']")
    protected WebElement txtUser;

    @FindBy(css = "input[name='password']")
    protected WebElement txtPassword;

    @FindBy(xpath = "//form//button[text()=' Login ']")
    protected WebElement btnLogin;

    @FindBy(css = "div.orangehrm-login-forgot p")
    protected WebElement lblForgotPassword;

    public LoginPage() {
        this.driver = getDriver();
        PageFactory.initElements(getDriver(), this);
    }

    public void inicializar() {
        open();
        getDriver().manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
    }

    public void loginUser(String user, String password)
    {
        txtUser.sendKeys(user);
        txtPassword.sendKeys(password);
        scrollToElement(lblForgotPassword);
        btnLogin.click();

    }

}
