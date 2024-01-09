package com.example

import com.example.constants.ApplicationConstants

class SystemConfig {

    private static SystemConfig INSTANCE = null;

    private Properties properties

    private SystemConfig() {
        println("Loading properties...")
        properties.load(this.getClass().getResourceAsStream("/" + ApplicationConstants.SYSTEM_CONFIG_FILE))
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

        println("Getting property for key: $configKey")

        // print all properties
        properties.each { key, value ->
            println("$key = $value")
        }

        return properties.getProperty(configKey)
    }
}
