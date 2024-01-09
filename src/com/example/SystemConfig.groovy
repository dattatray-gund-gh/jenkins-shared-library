package com.example

class SystemConfig {
    static Properties loadConfig(String configPath) {
        def properties = new Properties()
        try {
            properties.load(new FileInputStream(configPath))
        } catch (IOException e) {
            throw new RuntimeException("Failed to load configuration properties.", e)
        }
        return properties
    }
}
