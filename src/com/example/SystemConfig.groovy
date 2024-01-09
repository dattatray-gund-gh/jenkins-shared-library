package com.example

class SystemConfig {
    static Properties loadConfig() {
        def properties = new Properties()
        try {
            def currentDir = System.getProperty("user.dir")
            properties.load(new FileInputStream("${currentDir}/resources/config.properties"))
        } catch (IOException e) {
            throw new RuntimeException("Failed to load configuration properties.", e)
        }
        return properties
    }
}
