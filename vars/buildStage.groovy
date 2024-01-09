#!/usr/bin/env groovy

import com.example.constants.ApplicationConstants

def call(String name = null) {
    // Load config.properties file from resources folder and read the name property
    def properties = new Properties()
    InputStream stream = getClass().getClassLoader().getResourceAsStream("resources/config.properties")
    properties.load(stream)
    def config = properties.getProperty(ApplicationConstants.NAME)
    echo "Greeting: $config"
}
