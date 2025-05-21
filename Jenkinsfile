pipeline {
    agent any

    environment {
        DOCKER_BUILDKIT = '1'
    }

    stages {
        stage('Clonar Repo') {
            steps {
                // Jenkins ya clona el repo automáticamente si usás Pipeline from SCM
                echo 'Repositorio clonado automáticamente por Jenkins.'
                sh 'ls -la' // Verificamos que estemos en un repo Git
            }
        }

        stage('Construir backend') {
            agent {
                docker {
                    image 'maven:3.9.6-eclipse-temurin-17'
                }
            }
            steps {
                dir('backend') {
                    sh 'mvn clean package'
                    sh 'docker build -t backend .'
                }
            }
        }

        stage('Construir frontend') {
            steps {
                dir('frontend') {
                    sh 'docker build -t frontend .'
                }
            }
        }

        stage('Deploy') {
            steps {
                sh 'docker compose down || true'  // Por si no está corriendo
                sh 'docker compose up -d --build'
            }
        }
    }
}

