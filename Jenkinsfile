pipeline {
	agent any

	environment {
		mavenHome = tool 'jenkins-maven'
	}

	tools {
		jdk 'java-17'
		maven 'jenkins-maven'
	}

	stages {

		stage('Build'){
			steps {
				bat "mvn clean install -DskipTests"
			}
		}
/*
		stage('Test'){
			steps{
				bat "mvn test"
			}
		}
*/
		stage('Deploy') {
			steps {
			    bat "mvn jar:jar deploy:deploy"
			    bat "mvn exec:java"
			}
		}
	}
}