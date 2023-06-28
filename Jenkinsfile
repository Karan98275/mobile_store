pipeline{
  environment{
    registry="skillassure/mobilestore-amadeus"
    registryCredentials="docker_hub_Auth"
    dockerImage=""
  }
     agent any
     stages{
         stage('Build the project'){
           steps{
               echo 'building the project'
               sh 'mvn clean install -DskipTests'
             }
         }
         stage('codequality analyzing'){
          steps{
             echo 'codequality analyzing'
              sh 'mvn spring-boot:run'
       }
         }
         stage('building the docker image'){
          steps{
             echo 'build the docker image '
            dockerImage=docker.build registry+":$BUILD_NUMBER"
       }
         }
         stage('push the image to docker hub'){
          steps{
             echo 'pushing the docker image to docker hub'
             script{
              docker.withRegistry("",'registryCredentials'){
                dockerImage.push()
                dockerImage.push("$BUILD_NUMBER")
              }
             }
              sh 'mvn spring-boot:run'
       }

  }
}
     }       
