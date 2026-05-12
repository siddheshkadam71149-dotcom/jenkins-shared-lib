def call (String ProjectName, String ImageTag, String DockerHubUser){
  sh "docker built -t ${DockerHubUser}/${ProjectName}:$(ImageTag} ."
}
