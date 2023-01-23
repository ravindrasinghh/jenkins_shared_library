def call() 
{
    sh '''
    aws ecr get-login-password --region ${awsRegion} | docker login --username AWS --password-stdin ${ecrRepository}
    docker tag ${dockerImage}:${dockerTag} ${ecrRepository}:${dockerTag}
    docker push ${ecrRepository}:${dockerTag}
    '''
}
