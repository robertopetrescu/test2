pipeline    {
    agent any
    parameters  {
             choice choices: ['TestNg', 'jUnit'], description: 'Run using TestNg or jUnit',name: 'PROJECT'
             booleanParam(
                   defaultValue: true,
                   description: 'Run parallel',
                   name: 'RUN_PARALLEL'
                 )
    }

    stages {
        stage('Getting the project from GIT') {
            steps {
              echo 'Pulling..'
                 git branch: 'master',
                   url: 'https://github.com/robertopetrescu/test2.git'
           }
    }

    stage("Build"){
        steps{
            echo 'Building the application'
        }
    }

    stage("Testing the application") {
        steps {
            script {
                if (env.PROJECT == 'TestNg') {
                    echo 'Testing the application using TestNg'
                    bat "mvn test"
                }
                if (env.PROJECT == 'jUnit') {
                  //  echo 'Testing the application using jUnit'
                  //  bat "mvn clean test -Dtest=TestSeleniumJunit"
                }
            }
        }
    }

        stage("Generating report") {
            steps {
                cucumber buildStatus: 'UNCHANGED', customCssFiles: '', customJsFiles: '', failedFeaturesNumber: -1, failedScenariosNumber: -1, failedStepsNumber: -1, fileIncludePattern: '*.json', pendingStepsNumber: -1, skippedStepsNumber: -1, sortingMethod: 'ALPHABETICAL', undefinedStepsNumber: -1
            }
        }
                   /*  steps{
                        echo 'Testing the application';
                        bat "mvn -D clean test"
                    } */


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
