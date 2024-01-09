#!/usr/bin/env groovy
import com.example.SystemConfig
import com.example.Utils
import com.example.constants.ApplicationConstants

def call(String name = null) {
    script {
        def libPath = "${JENKINS_HOME}/jobs/${JOB_NAME}"
        sh "ls -l ${libPath}"
//        def configPath = "${libPath}/resources/config.properties"
//        echo "Config Path: $configPath"
//        def config = SystemConfig.loadConfig(configPath)
//        def configValue = config.getProperty(ApplicationConstants.NAME)
//        def greeting = new Utils().sayHello(configValue)
        echo "Greeting: $libPath"
    }
}
