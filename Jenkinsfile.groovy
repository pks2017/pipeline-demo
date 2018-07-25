pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'				
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
        
        stage('Test') {
            steps {               
				echo 'Testing..'
				bzt 'C:/Users/psingh/.jenkins/workspace/test-Api/ApiTesting/Uber/TestSuits/test-dev-backend-uber-Suite-Smoke.yml'
            }
        }
        
        stage('Release') {
            steps {
                echo 'Releasing to production..'
            }
        }        
    }
}
