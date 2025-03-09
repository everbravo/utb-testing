pipeline {
    agent any

    triggers {
        githubPush()
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: "${env.BRANCH_NAME}", url: 'https://github.com/usuario/repo.git'
            }
        }

        stage('Build') {
            steps {
                echo "Compilando código en ${env.BRANCH_NAME}..."
                sh 'mvn clean install -DskipTests'
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
