package com.example

class SystemConfig {
    static Properties loadConfig() {
        def properties = new Properties()
        def configFile = new File('/resources/config.properties')
        properties.load(configFile.newReader())
        return properties
    }
}
