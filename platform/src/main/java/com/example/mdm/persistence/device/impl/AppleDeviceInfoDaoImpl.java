package com.example.mdm.persistence.device.impl;

import com.example.mdm.persistence.device.AppleDeviceInfo;
import com.example.mdm.persistence.device.AppleDeviceInfoDao;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional
public class AppleDeviceInfoDaoImpl implements AppleDeviceInfoDao {

    @PersistenceContext
    private EntityManager em;

    public AppleDeviceInfo getAppleDeviceInfo(final long id) {
        return em.find(AppleDeviceInfo.class, id);
    }

    public void setAppleDeviceInfo(final AppleDeviceInfo deviceInfo) {
        em.persist(deviceInfo);
    }

}
