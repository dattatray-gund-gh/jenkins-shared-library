package com.example

import com.example.constants.ApplicationConstants

class SystemConfig {

    private static SystemConfig INSTANCE = null;

    private Properties properties

    private SystemConfig() {
        properties = loadSystemConfig()
    }

    private Properties loadSystemConfig() {
        Properties properties = new Properties()
        properties.load(getClass().getResourceAsStream("/" + ApplicationConstants.SYSTEM_CONFIG_FILE))
        return properties
    }

    static SystemConfig getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new SystemConfig()
        }

        return INSTANCE
    }

    String getProperty(String configKey) {

        if(properties == null) {
            throw new IllegalStateException("Properties cannot be null")
        }

        println "Getting property for key: $configKey"

        // print all properties
        properties.each { key, value ->
            println "$key = $value"
        }

        return properties.getProperty(configKey)
    }
}
