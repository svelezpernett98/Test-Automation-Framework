package com.epam.training.student_santiago_velez.framework_theory.model;

import java.util.Objects;

public class ComputeEngine {
    private String numberOfInstances;
    private String operatingSystem;
    private String machineFamily;
    private String series;
    private String machineType;
    private String GPUType;
    private String numberOfGUPs;
    private String localSSD;
    private String region;

    public ComputeEngine(String numberOfInstances, String operatingSystem,
                         String machineFamily, String series, String machineType,
                         String GPUType, String numberOfGUPs, String localSSD, String region) {
        this.numberOfInstances = numberOfInstances;
        this.operatingSystem = operatingSystem;
        this.machineFamily = machineFamily;
        this.series = series;
        this.machineType = machineType;
        this.GPUType = GPUType;
        this.numberOfGUPs = numberOfGUPs;
        this.localSSD = localSSD;
        this.region = region;
    }

    @Override
    public String toString() {
        return "ComputeEngine{" +
                "numberOfInstances='" + numberOfInstances + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", machineFamily='" + machineFamily + '\'' +
                ", series='" + series + '\'' +
                ", machineType='" + machineType + '\'' +
                ", GPUType='" + GPUType + '\'' +
                ", numberOfGUPs='" + numberOfGUPs + '\'' +
                ", localSSD='" + localSSD + '\'' +
                ", region='" + region + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputeEngine that = (ComputeEngine) o;
        return Objects.equals(numberOfInstances, that.numberOfInstances)
                && Objects.equals(operatingSystem, that.operatingSystem)
                && Objects.equals(machineFamily, that.machineFamily)
                && Objects.equals(series, that.series)
                && Objects.equals(machineType, that.machineType)
                && Objects.equals(GPUType, that.GPUType)
                && Objects.equals(numberOfGUPs, that.numberOfGUPs)
                && Objects.equals(localSSD, that.localSSD)
                && Objects.equals(region, that.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfInstances, operatingSystem, machineFamily,
                series, machineType, GPUType, numberOfGUPs, localSSD, region);
    }

    public String getNumberOfInstances() {
        return numberOfInstances;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getMachineFamily() {
        return machineFamily;
    }

    public String getSeries() {
        return series;
    }

    public String getMachineType() {
        return machineType;
    }

    public String getGPUType() {
        return GPUType;
    }

    public String getNumberOfGUPs() {
        return numberOfGUPs;
    }

    public String getLocalSSD() {
        return localSSD;
    }

    public String getRegion() {
        return region;
    }
}
