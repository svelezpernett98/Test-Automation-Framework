package com.epam.training.student_santiago_velez.framework_theory.service;

import com.epam.training.student_santiago_velez.framework_theory.model.ComputeEngine;

public class ComputeEngineCreator {
    public static final String TESTDATA_NUMBER_OF_INSTANCES = "testdata.computeengine.numberofinstances";
    public static final String TESTDATA_OPERATIVE_SYSTEM = "testdata.computeengine.operativesystem";
    public static final String TESTDATA_MACHINE_FAMILY = "testdata.computeengine.machinefamily";
    public static final String TESTDATA_SERIES = "testdata.computeengine.series";
    public static final String TESTDATA_MACHINE_TYPE = "testdata.computeengine.machinetype";
    public static final String TESTDATA_GPU_TYPE = "testdata.computeengine.gputype";
    public static final String TESTDATA_NUMBER_OF_GPUS = "testdata.computeengine.numberofgpus";
    public static final String TESTDATA_LOCAL_SSD = "testdata.computeengine.localssd";
    public static final String TESTDATA_REGION = "testdata.computeengine.region";

    public static ComputeEngine createComputeEngineWithRequiredData() {
        return new ComputeEngine(TestDataReader.getTestData(TESTDATA_NUMBER_OF_INSTANCES), TestDataReader.getTestData(TESTDATA_OPERATIVE_SYSTEM),
                TestDataReader.getTestData(TESTDATA_MACHINE_FAMILY), TestDataReader.getTestData(TESTDATA_SERIES),
                TestDataReader.getTestData(TESTDATA_MACHINE_TYPE), TestDataReader.getTestData(TESTDATA_GPU_TYPE),
                TestDataReader.getTestData(TESTDATA_NUMBER_OF_GPUS), TestDataReader.getTestData(TESTDATA_LOCAL_SSD),
                TestDataReader.getTestData(TESTDATA_REGION));
    }

}
