def createTaskDefinition(taskDefinitionFile) {
    def createTaskDefinitionCommand = "aws ecs register-task-definition --cli-input-json file://${taskDefinitionFile}"
    sh createTaskDefinitionCommand
}
