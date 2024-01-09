package com.example

import com.example.constants.ApplicationConstants

class SystemConfig {

    private static final SystemConfig INSTANCE = new SystemConfig()

    private Properties properties

    private SystemConfig() {
        properties = loadSystemConfig()
    }

    private Properties loadSystemConfig() {
        Properties properties = new Properties()
        properties.load(getClass().getResourceAsStream(ApplicationConstants.SYSTEM_CONFIG_FILE))
        return properties
    }

    static SystemConfig getInstance() {
        return INSTANCE
    }

    String getProperty(String key) {
        return properties.getProperty(key)
    }
}
