def createTaskDefinition(taskDefinitionFile) {
    def createTaskDefinitionCommand = "aws ecs register-task-definition --family ${FAMILY} --cli-input-json --region ${AWS_REGION} file://${taskDefinitionFile}"
    sh createTaskDefinitionCommand
}
