pipeline {
    agent any

    stages {
        stage('Checkout SCM') {
            steps {
                git branch: "master" , url: "https://github.com/MarcoYon/Selenium.git"
            }
        }
        stage('Build') {
            steps {
                bat "mvn clean package -DskipTests -B -ntp"
            }
        }
    }
}
