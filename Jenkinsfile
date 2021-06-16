pipeline {
    agent any
        tools {
        maven 'Maven 3.8.1'
        jdk 'JDK 1.8'
    }
    stages {
        stage("Build Maven") {
            steps {
                echo 'Building the application..'
            }
        }
        stage("Run Gatling Test") {
            steps {
                sh 'mvn clean test-compile gatling:test'
            }
            post {
                always {
                    echo 'Archive old report..'
//                     gatlingArchive()
                }
            }
        }
    }
}
