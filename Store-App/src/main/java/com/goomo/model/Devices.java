package com.goomo.model;



import java.util.List;

public class Devices {

    List<Device> devices;
    String brandName="Samnung";

    @Override
    public String toString() {
        return "Devices{" +
                "devices=" + devices +
                ", brandName='" + brandName + '\'' +
                '}';
    }

    public Devices(List<Device> devices) {
        this.devices = devices;
    }

    public Devices() {
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
