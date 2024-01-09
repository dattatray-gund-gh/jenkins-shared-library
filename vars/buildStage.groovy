#!/usr/bin/env groovy
import com.example.SystemConfig
import com.example.Utils
import com.example.constants.ApplicationConstants

def call(String name = null) {
    script {
       // def config = SystemConfig.loadConfig()
//        def configValue = config.getProperty(ApplicationConstants.NAME)
//        def greeting = new Utils().sayHello(configValue)

        def properties = new Properties()
        def configFile = new File(this.getClass().getResource('/resources/config.properties').toURI())
        properties.load(configFile.newReader())

        def config = properties.getProperty(ApplicationConstants.NAME)
        echo "Greeting: $config"
    }
}
