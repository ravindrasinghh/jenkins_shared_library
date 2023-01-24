This is my personal Jenkins Shared Library.

This repository contains a library of Jenkins Global Variables & Helper Variables that I can use in my project's `Jenkinsfile`

Based on the following articles:
- [How-To-Build-Your-Own-Jenkins-Shared-Library](https://www.jenkins.io/doc/book/pipeline/shared-libraries/)

### Import Library

As per the instructions on the [Jenkins Documentation], to include this library; in your `Jenkinsfile`:

```groovy
@Library('jenkins-shared-library@branch_name') _
```
See under `vars/` to see list of full available Global Variables/Helper Variables to use.
```
Put your groovy files inside the vars/
```

Alternatively, you can check out this example demo project which shows some use cases of this Shared Library:
[Jenkins Pipelines](https://github.com/ravindrasinghh/docker-git.git)
