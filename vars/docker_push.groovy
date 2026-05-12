def call (String project, String ImageTag, String dockerHubUser){
     withCredentials([usernamePassword('credentialsId':"dockerHubCred",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
        sh "docker login -u ${dockerHubUser} -p {dockerHubPass}"
                  
        sh "docker push ${dockerHubUser}/${project}:${ImageTag}"
     }

     }
                 
