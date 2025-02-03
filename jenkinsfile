pipeline {
    agent any

    stages {
        stage('Checkout SCM') {
            steps {
                git branch: "master" , url: "https://github.com/MarcoYon/Selenium.git"
            }
        }
    }

     stages {
        stage('Build') {
            steps {
                sh "mvn clean package -DskipTests -B -ntp"
            }
        }
    }
}
