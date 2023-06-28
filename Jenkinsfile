pipeline{
  environment{
    registry="Karansi98275/mobilestore-amadeus"
    registryCredential="docker_hub_Auth"
    dockerImage=""
  }
     agent any
     stages{
      
         stage('Build the project'){
           steps{
               echo 'building the project'
               
             }
         }
         stage('codequality analyzing'){
          steps{
             echo 'codequality analyzing'
              
       }
         }
         stage('building the docker image'){
          steps{
             echo 'build the docker image '
             script{
            dockerImage=docker.build registry+":$BUILD_NUMBER"
             }
       }
         }
         stage('push the image to docker hub'){
          steps{
             echo 'pushing the docker image to docker hub'
             script{
              docker.withRegistry('',registryCredentials){
                dockerImage.push()
                dockerImage.push('Latest')
              }
             }
       }

  }
  stage('deploying in to dev env'){
    steps{
      echo "employment to the developer environment"
      sh 'docker rm -f mobilestore-amadeus || true'
      sh 'docker run -d  --name=mobilestore-amadeus -p 8099:8099 skillassure/mobilestore-amadeus'
    }
  }
}
     }       
