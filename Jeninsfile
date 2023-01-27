@Library('my-shared-library@master')_
pipeline {
    agent any
    options {
        ansiColor('xterm')
        buildDiscarder(logRotator(numToKeepStr: "10"))
    }
    environment {
        AWSREGION = "us-west-2"
        CLUSTER = "demo-meetup"
        SERVICE = "nginx-service"
        ECRREPOSITORY = "240633844458.dkr.ecr.us-west-2.amazonaws.com"
        DOCKERIMAGE = "nginx"
        DOCKERTAG = "latest"
        TASKDEFINITION = "nginx-container"
        TASKDEFINITIONFILE = "task-definition.json"
    }
    stages{

        stage("Build Docker Image and Push to ECR")
        {
            steps{
                pushDockerImage()
            }
        }
        stage("Update Task Definition")
        {
            steps{
                createTaskDefinition()
            }
        }
        stage("Update ECS Service")
        {
            steps{
                updateEcsService()
            }
        }
    }
}
