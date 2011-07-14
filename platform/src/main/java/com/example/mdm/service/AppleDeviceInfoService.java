package com.example.mdm.service;

import com.example.mdm.persistence.device.AppleDeviceInfo;
import com.example.mdm.persistence.device.AppleDeviceInfoDao;


public interface AppleDeviceInfoService {

    void setAppleDeviceInfoDao(final AppleDeviceInfoDao dao);

    AppleDeviceInfo getAppleDeviceInfo(final long id);

    void setAppleDeviceInfo(final AppleDeviceInfo deviceInfo);
}
