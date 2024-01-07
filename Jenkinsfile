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
                bat "cmd.exe"
                bat "echo Hello from the new command prompt window!"
                bat "mvn spring-boot:run"
			}
		}
	}
}