package com.epam.training.student_santiago_velez.framework_theory.pageobjectsclasses;

import com.epam.training.student_santiago_velez.framework_theory.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CostEstimateSummaryPage extends BaseClass {
    @FindBy(xpath = "//h4[(text()='Cost Estimate Summary')]")
    private WebElement pageTitle;
    @FindBy(xpath = "//span[contains(text(), 'Number of Instances')]/following-sibling::span")
    private WebElement numberOfInstancesValue;
    @FindBy(xpath = "//span[contains(text(), 'Operating System / Software')]/following-sibling::span")
    private WebElement operatingSystemValue;
    @FindBy(xpath = "//span[contains(text(), 'Provisioning Model')]/following-sibling::span")
    private WebElement provisioningModelValue;
    @FindBy(xpath = "//span[contains(text(), 'Machine type')]/following-sibling::span")
    private WebElement machineType;
    @FindBy(xpath = "//span[contains(text(), 'Add GPUs')]/following-sibling::span")
    private WebElement addGPUsValue;
    @FindBy(xpath = "//span[contains(text(), 'GPU Model')]/following-sibling::span")
    private WebElement GPUModelValue;
    @FindBy(xpath = "//span[contains(text(), 'Number of GPUs')]/following-sibling::span")
    private WebElement numberOfGPUsValue;
    @FindBy(xpath = "//span[contains(text(), 'Local SSD')]/following-sibling::span")
    private WebElement localSSDModel;
    @FindBy(xpath = "//span[contains(text(), 'Region')]/following-sibling::span")
    private WebElement region;

    public CostEstimateSummaryPage(){
        PageFactory.initElements(driver, this);
    }
    public String getNumberOfInstancesValue() {
        return numberOfInstancesValue.getText();
    }

    public String getOperatingSystemValue() {
        return operatingSystemValue.getText();
    }

    public String getProvisioningModelValue() {
        return provisioningModelValue.getText();
    }

    public String getMachineType() {
        return machineType.getText();
    }

    public String getaddGPUsValue() {
        return addGPUsValue.getText();
    }

    public String getGPUModelValue() {
        return GPUModelValue.getText();
    }

    public String getNumberOfGPUsValue() {
        return numberOfGPUsValue.getText();
    }

    public String getLocalSSDModel() {
        return localSSDModel.getText();
    }

    public String getRegion() {
        return region.getText();
    }

    public void findPageTitle() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[(text()='Cost Estimate Summary')]")));
    }
}
