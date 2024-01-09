package com.example

final class SystemConfig {

    Properties properties = new Properties()

    private SystemConfig(){
        def resource = libraryResource 'config.properties'
        properties.load(new StringReader(resource))
    }

    static SystemConfig getInstance() {
        return new SystemConfig()
    }

    String getProperty(String key) {
        return properties.getProperty(key)
    }
}
