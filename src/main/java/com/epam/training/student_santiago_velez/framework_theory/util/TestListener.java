package com.epam.training.student_santiago_velez.framework_theory.util;

import com.epam.training.student_santiago_velez.framework_theory.base.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        takeSnapShot();
    }

    //takes a screenshot and saves it in a specified location (target > screenshots):
    public void takeSnapShot() {
        try {
            File srcFile = ((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.FILE);

            File destFile = new File(System.getProperty("user.dir") + "\\screenshots\\" + timeStamp() + ".png");

            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            System.out.println("Screen capture failed, " + e.getMessage());
        }
    }

    public String timeStamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }
}
