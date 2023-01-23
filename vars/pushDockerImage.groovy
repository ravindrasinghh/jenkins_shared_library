def pushDockerImage(dockerImage,dockerTag,ecrRepository) {
    def loginCommand = "aws ecr get-login-password --region ${AWS_REGION} | docker login --username AWS --password-stdin ${ecrRepository}"
    sh loginCommand
    def tagCommand = "docker tag ${dockerImage}:${dockerTag} ${ecrRepository}:${dockerTag}"
    sh tagCommand
    def pushCommand = "docker push ${ecrRepository}:${dockerTag}"
    sh pushCommand
}
