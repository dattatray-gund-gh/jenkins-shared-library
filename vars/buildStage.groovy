#!/usr/bin/env groovy
import com.example.SystemConfig
import com.example.Utils
import com.example.constants.ApplicationConstants

def call(String name = null) {
    script {
        def config = SystemConfig.loadConfig(this)
//        def configValue = config.getProperty(ApplicationConstants.NAME)
//        def greeting = new Utils().sayHello(configValue)
        echo "Greeting: $config"
    }
}
