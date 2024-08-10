package com.epam.training.student_santiago_velez.framework_theory.service;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class TestDataReader {
    private static ResourceBundle resourceBundle;

    static {
        String environment = System.getProperty("environment", "dev");
        System.out.println("Loading properties for environment: " + environment);
        try {
            resourceBundle = ResourceBundle.getBundle(environment);
        } catch (MissingResourceException e) {
            throw new RuntimeException("Properties file not found for environment: " + environment, e);
        }
    }
    public static String getTestData(String key){
        return resourceBundle.getString(key);
    }
}
