pipeline {
    agent {
        docker {
            image 'maven:3.9.6-eclipse-temurin-17'
        }
    }

    stages {
        stage('Construir backend') {
            steps {
                dir('backend') {
                    sh 'mvn clean package'
                    sh 'docker build -t mi-backendgastos-java2 .'
                }
            }
        }

        stage('Construir frontend') {
            steps {
                dir('frontend') {
                    sh 'docker build -t mi-frontendgastos-vue .'
                }
            }
        }

        stage('Deploy') {
            steps {
                sh 'docker compose down'
                sh 'docker compose up -d --build'
            }
        }
    }
}

