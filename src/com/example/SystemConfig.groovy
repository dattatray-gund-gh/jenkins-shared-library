package com.example

class SystemConfig {
    static Properties loadConfig() {
        def properties = new Properties()
        try {
            //properties.load(new FileInputStream("${JENKINS_HOME}/jobs/${JOB_NAME}/workspace/my-shared-library/resources/config.properties"))
//            def configFile = new File(this.class.protectionDomain.codeSource.location.path).parent + "/resources/config.properties"
            properties.load(new FileInputStream(new FileInputStream("${JENKINS_HOME}/jobs/${JOB_NAME}/workspace/jenkins-shared-library/resources/config.properties"))
        } catch (IOException e) {
            throw new RuntimeException("Failed to load configuration properties.", e)
        }
        return properties
    }
}
