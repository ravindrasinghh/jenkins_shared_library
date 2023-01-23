def call() 
{
    sh '''
    aws ecr get-login-password --region ${AWSREGION} | docker login --username AWS --password-stdin ${ECRREPOSITORY}
    docker build  -t ${DOCKERIMAGE}:latest .
    docker tag ${DOCKERIMAGE}:${DOCKERTAG} ${ECRREPOSITORY}:${DOCKERTAG}
    docker push ${ECRREPOSITORY}:${DOCKERTAG}
    '''
}
