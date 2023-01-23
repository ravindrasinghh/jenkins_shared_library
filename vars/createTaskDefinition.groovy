def call() {
    sh '''
     "aws ecs register-task-definition --family ${TASKDEFINITION} --cli-input-json --region ${AWSREGION} file://aws/${TASKDEFINITIONFILE}"
    '''
}
