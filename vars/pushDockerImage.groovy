def call() 
{
    sh '''
    aws ecr get-login-password --region ${AWSREGION} | docker login --username AWS --password-stdin ${ECR_REPOSITORY}
    docker build  -t ${DOCKER_IMAGE}:latest .
    docker tag ${DOCKER_IMAGE}:${DOCKER_TAG} ${ECR_REPOSITORY}:${DOCKER_TAG}
    docker push ${ECR_REPOSITORY}:${DOCKER_TAG}
    '''
}
