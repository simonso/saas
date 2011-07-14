package com.example.mdm.service.impl;

import com.example.mdm.persistence.device.AppleDeviceInfo;
import com.example.mdm.persistence.device.AppleDeviceInfoDao;
import com.example.mdm.service.AppleDeviceInfoService;

public class AppleDeviceInfoServiceImpl implements AppleDeviceInfoService {

    private AppleDeviceInfoDao dao;

    @Override
    public void setAppleDeviceInfoDao(AppleDeviceInfoDao dao) {
        this.dao = dao;
    }

    @Override
    public AppleDeviceInfo getAppleDeviceInfo(final long id) {
        return dao.getAppleDeviceInfo(id);
    }

    @Override
    public void setAppleDeviceInfo(final AppleDeviceInfo deviceInfo) {
        dao.setAppleDeviceInfo(deviceInfo);
    }
}
