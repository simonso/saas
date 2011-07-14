package com.example.saas.services;

import org.cloudfoundry.runtime.env.CloudEnvironment;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class CloudApplicationContextInitializer  implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        CloudEnvironment cloudEnv = new CloudEnvironment();
        ConfigurableEnvironment env = applicationContext.getEnvironment();
        if (cloudEnv.getInstanceInfo() != null) {
            env.setActiveProfiles("cloud");
        } else {
            env.setActiveProfiles("default");
        }
    }

}
