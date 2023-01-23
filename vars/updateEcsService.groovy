def call()
{
    sh '''
    aws ecs update-service --cluster ${CLUSTER} --service ${SERVICE} --task-definition ${TASKDEFINITION}
    '''
}
