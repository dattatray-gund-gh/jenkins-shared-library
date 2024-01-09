#!/usr/bin/env groovy
import com.example.SystemConfig
import com.example.Utils
import com.example.constants.ApplicationConstants

def call(String name = null) {
    script {

        def config = libraryResource('config.properties') as Properties
        def updatedName = name ?: config.getProperty(ApplicationConstants.NAME)
        Utils utils = new Utils()
        echo "Greeting: ${utils.sayHello(updatedName)}"
    }
}
