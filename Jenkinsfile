pipeline {
    agent any

    triggers {
        githubPush()
    }

    stages {
        stage('Checkout') {
            steps {
                def branch = env.BRANCH_NAME ?: 'main'
                sh "git init"
                sh "git remote add origin https://github.com/everbravo/utb-testing.git || true"
                sh "git fetch --all"
                sh "git checkout ${branch}"
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
