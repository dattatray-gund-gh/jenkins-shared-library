package com.example

class SystemConfig {
    static Properties loadConfig() {
        def properties = new Properties()
        try {
            def configFile = new File(this.class.protectionDomain.codeSource.location.path).parent + "/resources/config.properties"
            properties.load(new FileInputStream(configFile))
        } catch (IOException e) {
            throw new RuntimeException("Failed to load configuration properties.", e)
        }
        return properties
    }
}
