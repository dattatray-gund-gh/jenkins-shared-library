#!/usr/bin/env groovy
import com.example.SystemConfig
import com.example.Utils
import com.example.constants.ApplicationConstants

def call(String name = null) {
    def sysConfig = SystemConfig.getInstance()
    String toSomeValue = name ?: sysConfig.getProperty(ApplicationConstants.NAME)
    def greeting = new Utils().sayHello(toSomeValue)
    echo "Greeting: $greeting"
}
