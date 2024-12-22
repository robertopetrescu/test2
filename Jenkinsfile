pipeline{
    agent any

    stages {

    stage('Getting the project from GIT') {
               steps {
                  echo 'Pulling..';
                   git branch: 'master',
                   url: 'https://github.com/robertopetrescu/test2.git';
               }
           }
        stage("build"){
            steps{
                echo 'Building the application'

            }
        }

        stage("Testing the application"){
                    steps{
                        echo 'Testing the application';
                        sh 'mvn clean test'
                    }
                }
    }
}
