package com.epam.training.student_santiago_velez.framework_theory.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public void setUpDriver(String browser) throws Exception {
        if (browser == null){
            throw new NullPointerException("browser name can't be null");
        }

        switch (browser.toLowerCase()){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                driver = new ChromeDriver();
                System.out.println("Chrome was selected as a browser by default, if you want to select Edge, send 'edge' as an argument for method setUpDriver()");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    public void setUpWait(WebDriver driver, int seconds) throws Exception {
        if (driver == null){
            throw new NullPointerException("WebDriver can't be null");
        }

        if (seconds <= 0){
            throw new IllegalArgumentException("seconds must be higher than 0");
        }

        wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
    }

    public void switchTabs(int tabIndexToSwitchTo, int waitForNumberOfTabsToBe){
        wait.until(ExpectedConditions.numberOfWindowsToBe(waitForNumberOfTabsToBe));
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabIndexToSwitchTo));
    }

}
