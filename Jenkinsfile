pipeline {
    agent any

    triggers {
        githubPush()
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: "${env.BRANCH_NAME}", url: 'https://github.com/everbravo/utb-testing.git'
            }
        }

        stage('Build') {
            steps {
                echo "Compilando código en ${env.BRANCH_NAME}..."
                sh 'mvn -f people-management-api/pom.xml clean install'
            }
        }

        stage('Test') {
            steps {
                echo "Ejecutando pruebas..."
            }
        }

        stage('Deploy') {
            when {
                branch 'main'
            }
            steps {
                echo "Desplegando a producción..."
            }
        }
    }
}
