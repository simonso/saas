package com.example.mdm.persistence.device;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="APPL_DEVICE_INFO")
public class AppleDeviceInfo implements Serializable {

    private static final long serialVersionUID = 8496087166198616020L;

    private long id;

    private String udid;

    private String deviceName;

    private String iosVersion;

    private String iosBuild;

    private String modelName;

    private String modelNumber;

    private String serialNumber;

    private String imei;

    private String modemFirmware;

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name="UDID")
    public String getUdid() {
        return udid;
    }

    public void setUdid(String udid) {
        this.udid = udid;
    }

    @Column(name="DEVICE_NAME")
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    @Column(name="IOS_VERSION")
    public String getIosVersion() {
        return iosVersion;
    }

    public void setIosVersion(String iosVersion) {
        this.iosVersion = iosVersion;
    }

    @Column(name="IOS_BUILD")
    public String getIosBuild() {
        return iosBuild;
    }

    public void setIosBuild(String iosBuild) {
        this.iosBuild = iosBuild;
    }

    @Column(name="MODEL_NAME")
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Column(name="MODEL_NUMBER")
    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    @Column(name="SERIAL_NUMBER")
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Column(name="IMEI")
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    @Column(name="MODEM_FIRMWARE")
    public String getModemFirmware() {
        return modemFirmware;
    }

    public void setModemFirmware(String modemFirmware) {
        this.modemFirmware = modemFirmware;
    }
}
