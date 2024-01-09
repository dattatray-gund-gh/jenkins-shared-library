package com.example

import com.example.constants.ApplicationConstants

class SystemConfig {

    private static SystemConfig INSTANCE = null;

    private Properties properties

    private SystemConfig() {
        echo "Loading properties..."
        def clazz = this.getClass()
        echo "Class: $clazz"

        def stream = clazz.getResourceAsStream("/" + ApplicationConstants.SYSTEM_CONFIG_FILE)
        echo "Stream: $stream"

        properties.load(stream)
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

        echo "Getting property for key: $configKey"

        // print all properties
        properties.each { key, value ->
            echo "$key = $value"
        }

        return properties.getProperty(configKey)
    }
}
