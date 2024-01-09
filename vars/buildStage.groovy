#!/usr/bin/env groovy
import com.example.SystemConfig
import com.example.Utils
import com.example.constants.ApplicationConstants

def call(String name = null) {
    script {
        def systemConfig = SystemConfig.getInstance()
        def updatedName = name ?: systemConfig.getProperty(ApplicationConstants.NAME)
        Utils utils = new Utils()
        echo "Greeting: ${utils.sayHello(updatedName)}"
    }
}
