pipeline {
    agent any
    
    tools{
	maven 'Maven 3.9.9'
	jdk 'Java23'
    }
    stages {
        stage('Checkout') {
            steps {
                // Replace with your Git repository URL
                git 'https://github.com/tejusbhargava/DevOps.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
    }

    post {
        always {
            echo 'Pipeline execution completed.'
        }
        success {
            echo 'Build succeeded!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
