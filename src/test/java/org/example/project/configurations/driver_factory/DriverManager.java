package org.example.project.configurations.driver_factory;

import groovy.util.logging.Log4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

@Log4j
public class DriverManager {
    private static WebDriver driver;
    private DriverManager(){
    }
    public static WebDriver getDriver(){
        if (driver == null){
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void closeDriver(){
        if(driver!= null) {
            driver.quit();
            driver=null;
        }
    }

}
