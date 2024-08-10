package com.epam.training.student_santiago_velez.framework_theory.pageobjectsclasses;

import com.epam.training.student_santiago_velez.framework_theory.base.BaseClass;
import com.epam.training.student_santiago_velez.framework_theory.model.ComputeEngine;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ComputeEnginePage extends BaseClass {
    @FindBy(css = "h1[aria-label='Selected product title']")
    private WebElement pageTitle;
    @FindBy(xpath = "//div[contains(text(), 'Number of instances')]/../following-sibling::div[2]/div[2]/div/label/span[2]/input")
    private WebElement numberOfInstancesInput;
    @FindBy(xpath = "//span[contains(text(), 'Operating System / Software')]/ancestor::*[3]/div[1]")
    private WebElement OperatingSystemDropDownList;
    @FindBy(xpath = "//label[text()='Regular']")
    private WebElement regularProvisioningModelButton;
    @FindBy(xpath = "//span[contains(text(), 'Machine Family')]/ancestor::*[3]/div[1]")
    private WebElement machineFamilyDropDownList;
    @FindBy(xpath = "//span[contains(text(), 'Series')]/ancestor::*[3]/div[1]")
    private WebElement seriesDropDownList;
    @FindBy(xpath = "//span[contains(text(), 'Machine type')]/ancestor::*[3]/div[1]")
    private WebElement machineTypeDropDownList;
    @FindBy(css = "button[role='switch'][aria-label='Add GPUs']")
    private WebElement addGPUsToggle;
    @FindBy(xpath = "//span[contains(text(), 'GPU Model')]/ancestor::*[3]/div[1]")
    private WebElement GPUtypeDropDownList;
    @FindBy(xpath = "//span[contains(text(), 'Number of GPUs')]/ancestor::*[3]/div[1]")
    private WebElement numberOfGPUsDropDownList;
    @FindBy(xpath = "//span[text()='Local SSD']/ancestor::*[3]/div[1]")
    private WebElement localSSDdropDownList;
    @FindBy(xpath = "//span[contains(text(), 'Region')]/ancestor::*[3]/div[1]")
    private WebElement regionDropDownList;
    @FindBy(xpath = "//span[contains(text(), 'Share')]")
    private WebElement shareButton;
    @FindBy(css = "a[track-name='open estimate summary']")
    private WebElement openEstimateSummaryButton;

    public ComputeEnginePage() {
        PageFactory.initElements(driver, this);
    }

    public void fillOutInstancesInput(ComputeEngine computeEngine) {
        numberOfInstancesInput.clear();
        numberOfInstancesInput.sendKeys(computeEngine.getNumberOfInstances());
    }

    public void selectOperativeSystem(ComputeEngine computeEngine) {
        OperatingSystemDropDownList.click();
        WebElement ulElement = driver.findElement(By.cssSelector("ul[aria-label='Operating System / Software']"));
        List<WebElement> liElements = ulElement.findElements(By.tagName("li"));

        for (WebElement liElement : liElements) {
            if (liElement.getText().equalsIgnoreCase(computeEngine.getOperatingSystem())) {
                liElement.click();
                break;
            }
        }
    }

    public void clickRegularProvisioningModelButton() {
        regularProvisioningModelButton.click();
    }

    public void selectMachineFamily(ComputeEngine computeEngine) {
        machineFamilyDropDownList.click();
        WebElement ulElement = driver.findElement(By.cssSelector("ul[aria-label='Machine Family']"));
        List<WebElement> liElements = ulElement.findElements(By.tagName("li"));

        for (WebElement liElement : liElements) {
            if (liElement.getText().equalsIgnoreCase(computeEngine.getMachineFamily())) {
                liElement.click();
                break;
            }
        }
    }

    public void selectSeries(ComputeEngine computeEngine) {
        seriesDropDownList.click();
        WebElement ulElement = driver.findElement(By.cssSelector("ul[aria-label='Series']"));
        List<WebElement> liElements = ulElement.findElements(By.tagName("li"));

        for (WebElement liElement : liElements) {
            if (liElement.getText().equalsIgnoreCase(computeEngine.getSeries())) {
                liElement.click();
                break;
            }
        }
    }

    public void selectMachineTypes(ComputeEngine computeEngine) {
        machineTypeDropDownList.click();
        WebElement ulElement = driver.findElement(By.cssSelector("ul[aria-label='Machine type']"));
        List<WebElement> liElements = ulElement.findElements(By.tagName("li"));

        for (WebElement liElement : liElements) {
            if (liElement.getText().equalsIgnoreCase(computeEngine.getMachineType())) {
                liElement.click();
                break;
            }
        }
    }

    public void clickAddGPUsToggle() {
        addGPUsToggle.click();
    }

    public void selectGPUtype(ComputeEngine computeEngine) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'GPU Model')]/ancestor::*[3]/div[1]")));
        GPUtypeDropDownList.click();
        WebElement ulElement = driver.findElement(By.cssSelector("ul[aria-label='GPU Model']"));
        List<WebElement> liElements = ulElement.findElements(By.tagName("li"));

        for (WebElement liElement : liElements) {
            if (liElement.getText().equalsIgnoreCase(computeEngine.getGPUType())) {
                liElement.click();
                break;
            }
        }
    }

    public void selectNumberOfGPUs(ComputeEngine computeEngine) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'Number of GPUs')]/ancestor::*[3]/div[1]")));
        numberOfGPUsDropDownList.click();
        WebElement ulElement = driver.findElement(By.cssSelector("ul[aria-label='Number of GPUs']"));
        List<WebElement> liElements = ulElement.findElements(By.tagName("li"));

        for (WebElement liElement : liElements) {
            if (liElement.getText().equalsIgnoreCase(computeEngine.getNumberOfGUPs())) {
                liElement.click();
                break;
            }
        }
    }

    public void selectLocalSSD(ComputeEngine computeEngine) {
        localSSDdropDownList.click();
        WebElement ulElement = driver.findElement(By.cssSelector("ul[aria-label='Local SSD']"));
        List<WebElement> liElements = ulElement.findElements(By.tagName("li"));

        for (WebElement liElement : liElements) {
            if (liElement.getText().equalsIgnoreCase(computeEngine.getLocalSSD())) {
                liElement.click();
                break;
            }
        }
    }

    public void selectRegion(ComputeEngine computeEngine) {
        regionDropDownList.click();
        WebElement ulElement = driver.findElement(By.cssSelector("ul[aria-label='Region']"));
        List<WebElement> liElements = ulElement.findElements(By.tagName("li"));

        for (WebElement liElement : liElements) {
            if (liElement.getText().toLowerCase().contains(computeEngine.getRegion().toLowerCase())) {
                liElement.click();
                break;
            }
        }
    }

    public void clickShareButton() {
        //Wait until the changes are saved and price is calculated:
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Service cost updated')]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'Share')]")));
        shareButton.click();
    }

    public void clickOpenEstimateSummaryButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[track-name='open estimate summary']")));
        openEstimateSummaryButton.click();
    }

    public void findPageTitle() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1[aria-label='Selected product title']")));
    }

}

