#!/usr/bin/env groovy

import com.example.constants.ApplicationConstants

def call(String name = null) {
    script {

        // Load config.properties file from resources folder and read the name property
        def properties = new Properties()
        properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"))
        def config = properties.getProperty(ApplicationConstants.NAME)
        echo "Greeting: $config"
    }
}
