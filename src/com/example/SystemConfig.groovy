package com.example

class SystemConfig {
    static Properties loadConfig() {
        def properties = new Properties()
        def configFile = new File(this.getClass().getResource('/resources/config.properties').toURI())
        properties.load(configFile.newReader())
        return properties
    }
}
