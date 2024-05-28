package org.example.project.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.codehaus.groovy.transform.stc.TypeCheckingExtension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WevDriverManager {
    public static WebDriverManager chromedriver() {
        return WebDriverManager.chromedriver();
    }
}