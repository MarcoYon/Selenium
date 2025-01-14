package com.bdd;
/*
import org.graalvm.compiler.core.common.util.Util;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.logging.Level;

public final class  WebDriverManager {

    private static final String CLASS_NAME = WebDriverManager.class.getName();
    private static final String USER_DIR= "user.dir";
    private static final String OS_NAME= "os.name";
    private static final String MSJ_OS= "Sistema operativo";
    private static WebDriver webDriver;
    private static final String HEADLESS = "--headless";
    private static final String USE_AUTOMATION_EXTENSION = "useAutomationExtension";
    private static final String BROWSER_SUPPORTED = "CHROME|SAFARI|FIREFOX";
    private static final String CAPABILITIES_SHOW = "Capabilities --->";

    private WebDriverManager() {
    }


//    public static WebDriver setWebDriver(WebDriver driver) {
//
//    }

    public static void stopWebDriver() {
        if(webDriver != null){
            UtilWeb.logger(WebDriverManager.class).log(Level.INFO, "Deteniendo el driver {0}", webDriver);
            webDriver.quit();
        }

    }

    public static WebDriver getWebDriver() {
        if(webDriver == null){
            UtilWeb.logger(WebDriverManager.class).log(Level.WARNING, "Driver no existe");
        }

        return webDriver;
    }

    public static void setUrl(String url) {
        if(webDriver == null){
            webDriver.get(url);
            UtilWeb.logger(WebDriverManager.class).log(Level.INFO, "Abriendo la pagina -->\n{0}",url);
        }
        else {
            UtilWeb.logger(WebDriverManager.class).log(Level.WARNING, "Driver no existe");
        }
    }


    public static void setDriverImplicitWait(Duration duration) {
        getWebDriver().manage().timeouts().implicitlyWait(duration);
    }

    public static void maximizeWindow() {
        getWebDriver().manage().window().maximize();
    }
    public static void fullScreenWindow() {
        getWebDriver().manage().window().fullscreen();
    }





}
*/