def createTaskDefinition(taskDefinitionFile) {
    def createTaskDefinitionCommand = "aws ecs register-task-definition --family ${taskDefinition} --cli-input-json --region ${awsRegion} file://${taskDefinitionFile}"
    sh createTaskDefinitionCommand
}
