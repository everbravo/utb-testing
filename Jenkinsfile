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
              maven clean install
                echo "Compilando código en ${env.BRANCH_NAME}..."
                sh 'echo Build completado'
            }
        }

        stage('Test') {
            steps {
                echo "Ejecutando pruebas..."
                sh 'echo Tests ejecutados correctamente'
            }
        }

        stage('Deploy') {
            when {
                branch 'main'
            }
            steps {
                echo "Desplegando a producción..."
                sh 'echo Despliegue realizado en producción'
            }
        }
    }
}
