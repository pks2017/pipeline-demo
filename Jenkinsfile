pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
				git credentialsId: '486f2c77-dfb7-4a1f-9f75-cb8623d36754', url: 'https://github.com/pks2017/pipeline-demo.git'				
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
				bzt 'C:\\Users\\psingh\\.jenkins\\workspace\\test-Api\\ApiTesting\\Uber\\TestSuits\\test-dev-backend-uber-Suite-Smoke.yml'
            }
        }
        
        stage('Release') {
            steps {
                echo 'Releasing to production..'
            }
        }        
    }
}