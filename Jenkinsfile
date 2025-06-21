pipeline {
    agent any

    stages {
//         stage('Checkout SCM') {
//             steps {
//                 git branch: "master" , url: "https://github.com/MarcoYon/Selenium.git"
//             }
//         }
        stage('Compile') {
            steps {
                bat "mvn clean compile -B -ntp"
            }
        }
        stage('Test') {
            steps {
                bat "mvn test -B -ntp"
            }
        }
        stage('Build') {
             steps {
                 bat "mvn package -DskipTests -B -ntp"
             }
         }

    }
}
