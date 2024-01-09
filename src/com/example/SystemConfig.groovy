package com.example

final class SystemConfig {

    Properties properties = new Properties()

    private SystemConfig(){
        properties.load(new StringReader(resource))
    }

    static SystemConfig getInstance() {
        return new SystemConfig()
    }

    String getProperty(String key) {
        return properties.getProperty(key)
    }
}
