def call() {
    sh '''
     "aws ecs register-task-definition --family ${TASK_DEFINITION} --cli-input-json --region ${AWS_REGION} file://${TASK_DEFINITION_FILE}"
    '''
}
