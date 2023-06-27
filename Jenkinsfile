pipeline{
     agent any
     stages{
         stage('Build the project'){
           steps{
               echo 'building the project'
               sh 'mvn clean install -DskipTests'
             }
         }
       stage('Run the maven'){
          steps{
             echo 'run the project'
              sh 'mvn spring-boot:run'
       }
       stage("My stage") {            
        steps {
            bat label: 'My batch script',
                script: ''' @echo off
                            return_1_if_success.exe   // command which returns 1 in case of success, 0 otherwise
                            IF %ERRORLEVEL% EQU 1 (exit /B 0) ELSE (exit /B 1)'''
        }
      }
    }
  }
        
