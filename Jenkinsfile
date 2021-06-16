pipeline {
    agent any
    stages {
        stage("Build Maven") {
            steps {
                echo 'Building the application..'
            }
        }
        stage("Run Gatling Test") {
            steps {
                sh 'mvn clean test-compile gatling:test -Dgatling.simulationClass=performance.UserInfoSimulation'
            }
            post {
                always {
                    gatlingArchive()
                }
            }
        }
    }
}
