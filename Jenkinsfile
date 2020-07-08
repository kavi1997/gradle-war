pipeline {
    agent any
 tools{
    gradle 'gradle'
    }
    stages {

      stage('clean')
            {
                steps
                 { 
                    sh 'gradle clean build'
                 }
            }
      }
}
