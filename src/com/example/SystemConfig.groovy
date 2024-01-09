package com.example

class SystemConfig {
    static Properties loadConfig() {
        def properties = new Properties()
        try {
            properties.load(new FileInputStream("resources/config.properties"))
        } catch (IOException e) {
            throw new RuntimeException("Failed to load configuration properties.", e)
        }
        return properties
    }
}
