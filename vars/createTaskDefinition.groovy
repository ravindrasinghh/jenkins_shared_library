def call() {
    sh '''
     "aws ecs register-task-definition --family ${taskDefinition} --cli-input-json --region ${awsRegion} file://${taskDefinitionFile}"
    '''
}
