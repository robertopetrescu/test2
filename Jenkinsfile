pipeline{
    agent any

    stages {

     stage('Setup parameters') {
         steps {
              script {
                properties([
                      parameters([
                           choice(
                               choices: ['TestNg', 'jUnit'],
                               name: 'PROJECT',
                               description: 'TestNg or jUnit',
                              // def PROJECT = params.PROJECT
                          )
                       ])
                   ])
                }
             }
         }

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
                        bat "mvn -D clean test"
                    }


            /* post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                   publishHTML([
                       allowMissing: false,
                       alwaysLinkToLastBuild: false,
                       keepAll: false,
                       reportDir: 'target/surefire-reports/',
                       reportFiles: 'emailable-report.html',
                       reportName: 'HTML Report',
                       reportTitles: '',
                       useWrapperFileDirectly: true])
                }
            } */
        }



    }
}
