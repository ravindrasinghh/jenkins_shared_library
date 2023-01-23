def call()
{
    sh '''
    aws ecs update-service --cluster ${CLUSTER} --service ${SERVICE} --region ${AWSREGION} --task-definition ${TASKDEFINITION}
    '''
}
