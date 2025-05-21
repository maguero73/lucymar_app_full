pipeline {
    agent {
        docker {
            image 'maven:3.9.6-eclipse-temurin-17'
        }
    }

    stages {
        stage('Clonar Repo') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/maguero73/lucymar_app_full.git'
            }
        }

        stage('Construir backend') {
            steps {
                sh 'cd backend && mvn clean package'
                sh 'docker build -t mi-backendgastos-java2 ./backend'
            }
        }

        stage('Construir frontend') {
            steps {
                sh 'docker build -t mi-frontendgastos-vue ./frontend'
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

