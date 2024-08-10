package com.epam.training.student_santiago_velez.framework_theory.pageobjectsclasses;

import com.epam.training.student_santiago_velez.framework_theory.base.BaseClass;
import com.epam.training.student_santiago_velez.framework_theory.service.TestDataReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleCloudCalculatorPage extends BaseClass {
    @FindBy(xpath = "//h1[contains(text(), 'Welcome to Google')]")
    private WebElement pageTitle;
    @FindBy(xpath = "//button/span[contains(text(), 'Add to estimate')][1]")
    private WebElement addToEstimateButton;
    @FindBy(xpath = "//h2[text()='Compute Engine']")
    private WebElement computeEngineCard;

    public GoogleCloudCalculatorPage(){
        PageFactory.initElements(driver, this);
    }

    public void clickOnAddToEstimateButton() {
        addToEstimateButton.click();
    }

    public void clickOnComputeEngineCard() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.DzHYNd>:nth-child(1)")));
        computeEngineCard.click();
    }

    public void findPageTitle() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(), 'Welcome to Google')]")));
    }

    public String getGoogleCloudCalculatorUrl() {
        return TestDataReader.getTestData("testdata.googlecloudcalculatorpage.url");
    }

}
