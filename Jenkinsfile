pipeline {
    agent any
    stages {
        stage('Compile stage'){
            steps{


                withMaven(maven : 'maven-3.5.4') {
                    sh 'mvn clean compile'
                }

            }
        }
        stage('Testing stage'){
            steps{
                withMaven(maven : 'Maven') {
                    sh 'mvn test'
                }

            }
        }
        stage('Deploy stage'){
            steps{


                withMaven(maven : 'Maven') {
                    sh 'mvn deploy'
                }
            }
        }
    }
}