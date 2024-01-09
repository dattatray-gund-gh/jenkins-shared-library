# jenkins-shared-library
Jenkins Shared Library Demo


<pre>
@Library('jenkins-shared-library') _

pipeline {
    agent any

    stages {
        stage('Say Hello') {
            steps {
                buildStage()
            }
        }
    }
}

</pre>