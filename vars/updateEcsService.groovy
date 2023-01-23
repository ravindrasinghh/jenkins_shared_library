def updateEcsService(taskDefinition, service, cluster) {
    def updateCommand = "aws ecs update-service --cluster ${cluster} --service ${service} --task-definition ${taskDefinition}"
    sh updateCommand
}
