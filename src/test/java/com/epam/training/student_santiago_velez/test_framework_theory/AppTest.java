package com.epam.training.student_santiago_velez.test_framework_theory;

import com.epam.training.student_santiago_velez.framework_theory.base.Hooks;
import com.epam.training.student_santiago_velez.framework_theory.model.ComputeEngine;
import com.epam.training.student_santiago_velez.framework_theory.pageobjectsclasses.ComputeEnginePage;
import com.epam.training.student_santiago_velez.framework_theory.pageobjectsclasses.CostEstimateSummaryPage;
import com.epam.training.student_santiago_velez.framework_theory.pageobjectsclasses.GoogleCloudCalculatorPage;
import com.epam.training.student_santiago_velez.framework_theory.service.ComputeEngineCreator;
import com.epam.training.student_santiago_velez.framework_theory.service.TestDataReader;
import com.epam.training.student_santiago_velez.framework_theory.util.StringUtils;
import com.epam.training.student_santiago_velez.framework_theory.util.TestListener;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//COMMAND TO EXECUTE TESTS VIA SETTING THE ENVIRONMENT PROPERTY IN THE COMMAND LINE: mvn test -Denvironment=dev
//COMMAND TO EXECUTE TESTS VIA POM.XML PROFILE (DEV PROFILE): mvn test -Pdev

@Listeners(TestListener.class)
public class AppTest extends Hooks {
    @BeforeSuite(alwaysRun = true)
    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    @AfterSuite(alwaysRun = true)
    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    @Test(groups = {"smoke"})
    public void testValidateEstimatedCostTaskThree() {
        GoogleCloudCalculatorPage googleCloudCalculatorObject = new GoogleCloudCalculatorPage();
        driver.get(googleCloudCalculatorObject.getGoogleCloudCalculatorUrl());
        googleCloudCalculatorObject.findPageTitle();
        googleCloudCalculatorObject.clickOnAddToEstimateButton();
        googleCloudCalculatorObject.clickOnComputeEngineCard();

        ComputeEngine computeEngine = ComputeEngineCreator.createComputeEngineWithRequiredData();
        ComputeEnginePage computeEngineObject = new ComputeEnginePage();
        computeEngineObject.findPageTitle();
        computeEngineObject.fillOutInstancesInput(computeEngine);
        computeEngineObject.selectOperativeSystem(computeEngine);
        computeEngineObject.clickRegularProvisioningModelButton();
        computeEngineObject.selectMachineFamily(computeEngine);
        computeEngineObject.selectSeries(computeEngine);
        computeEngineObject.selectMachineTypes(computeEngine);
        computeEngineObject.clickAddGPUsToggle();
        computeEngineObject.selectGPUtype(computeEngine);
        computeEngineObject.selectNumberOfGPUs(computeEngine);
        computeEngineObject.selectLocalSSD(computeEngine);
        computeEngineObject.selectRegion(computeEngine);
        computeEngineObject.clickShareButton();
        computeEngineObject.clickOpenEstimateSummaryButton();

        switchTabs(1, 2);

        CostEstimateSummaryPage costEstimateSummaryObject = new CostEstimateSummaryPage();
        costEstimateSummaryObject.findPageTitle();
        Assert.assertEquals(costEstimateSummaryObject.getNumberOfInstancesValue(), TestDataReader.getTestData("testdata.computeengine.numberofinstances"));
        Assert.assertEquals(costEstimateSummaryObject.getOperatingSystemValue(), TestDataReader.getTestData("testdata.computeengine.operativesystem"));
        Assert.assertEquals(costEstimateSummaryObject.getProvisioningModelValue(), "Regular");
        Assert.assertTrue(StringUtils.equalsIgnoreLineBreaks(costEstimateSummaryObject.getMachineType().replaceAll("[,\\s]", ""), TestDataReader.getTestData("testdata.computeengine.machinetype").replaceAll("[,\\s]", ""))); //Used equalsIgnoreLineBreaks() method form StringUtils because the value is populated slighlty different in the drop down list option, vs the summary page with the results, but it is the same option
        Assert.assertEquals(costEstimateSummaryObject.getaddGPUsValue(), "true");
        Assert.assertEquals(costEstimateSummaryObject.getGPUModelValue(), TestDataReader.getTestData("testdata.computeengine.gputype"));
        Assert.assertEquals(costEstimateSummaryObject.getNumberOfGPUsValue(), TestDataReader.getTestData("testdata.computeengine.numberofgpus"));
        Assert.assertEquals(costEstimateSummaryObject.getLocalSSDModel(), TestDataReader.getTestData("testdata.computeengine.localssd"));
        Assert.assertEquals(costEstimateSummaryObject.getRegion(), TestDataReader.getTestData("testdata.computeengine.region"));
    }

    @Test
    public void testGeneralScope() {
        System.out.println("general scope test executed");
    }
}


