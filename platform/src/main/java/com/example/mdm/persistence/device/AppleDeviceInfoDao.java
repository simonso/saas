package com.example.mdm.persistence.device;


public interface  AppleDeviceInfoDao {

    AppleDeviceInfo getAppleDeviceInfo(final long id);

    void setAppleDeviceInfo(final AppleDeviceInfo deviceInfo);
}
