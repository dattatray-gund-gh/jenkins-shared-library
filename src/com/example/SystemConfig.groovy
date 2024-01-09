package com.example

import java.io.InputStream
import java.util.Properties

class SystemConfig {

    private static SystemConfig INSTANCE = null

    private Properties properties

    private SystemConfig() {
        try {
            println("Loading properties...")
            properties = new Properties()
            InputStream inputStream = getClass().getResourceAsStream("config.properties")

            if (inputStream != null) {
                properties.load(inputStream)
            } else {
                throw new IllegalStateException("Unable to load config.properties. File not found.")
            }
        } catch (Exception e) {
            throw new IllegalStateException("Error loading properties: ${e.message}", e)
        }
    }

    static SystemConfig getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SystemConfig()
        }

        return INSTANCE
    }

    String getProperty(String configKey) {
        if (properties == null) {
            throw new IllegalStateException("Properties cannot be null")
        }

        println("Getting property for key: $configKey")

        // Print all properties
        properties.each { key, value ->
            println("$key = $value")
        }

        return properties.getProperty(configKey)
    }
}
