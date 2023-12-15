pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/rakhisanjeev/DemoTest.git'

                // Run Maven on a Unix agent.
                //sh "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                 bat "mvn clean package"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit 'target/surefire-reports/**/*.xml'
                    archiveArtifacts 'target/*.jar'
                }
                always {
            // Archive TestNG HTML reports as artifacts
            archiveArtifacts allowEmptyArchive: true, artifacts: 'target/surefire-reports/emailable-report.html, target/surefire-reports/index.html', onlyIfSuccessful: false
        }
            }
        }
    }
}
