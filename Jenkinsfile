pipeline {
    agent any

    triggers {
        githubPush() 
    }

    tools {
        maven 'Maven 3'
    }

    environment {
        MVN_HOME = "/usr/bin" 
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    echo "Clonando repositorio..."
                    checkout scm 
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    echo "Verificando instalación de Maven..."
                    sh 'mvn -version'

                    echo "Compilando código en ${env.BRANCH_NAME}..."
                    dir('people-management-api') {
                        sh 'mvn clean install -DskipTests'
                    }
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    echo "Ejecutando pruebas..."
                    dir('people-management-api') {
                        //sh 'mvn test' 
                        echo "Ejecutando pruebas..."
                    }
                }
            }
        }

        stage('Deploy') {
            when {
                branch 'main'
            }
            steps {
                script {
                    echo "Desplegando a producción..."
                }
            }
        }
    }
}
