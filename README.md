This is my personal Jenkins Shared Library.

This repository contains a library of Jenkins Global Variables & Helper Variables that I can use in my project's `Jenkinsfile`

Based on the following articles:
- [How-To-Build-Your-Own-Jenkins-Shared-Library](https://www.jenkins.io/doc/book/pipeline/shared-libraries/)

### Import Library

As per the instructions on the [Jenkins Documentation], to include this library; in your `Jenkinsfile`:

```groovy
@Library('jenkins-shared-library@1.0.0') _
```
note that the name is the `id` of the Shared Library configured under Jenkins Configuration and the version after the `@` sign 
can be `master` which points to the master branch of this library or simply omitted which would pick up the 
default version configured under Jenkins Configuration (if you have it configured there).

### Using Global Variables

To use one of the global variables or helper variables defined in this library you just simply call it like the following examples.

```groovy
@Library('jenkins-shared-library@1.0.0')_
```

See under `vars/` to see list of full available Global Variables/Helper Variables to use.

Alternatively, you can check out this example demo project which shows some use cases of this Shared Library:
[Jenkins Pipelines](http://github.com/colinbut/jenkins-pipelines.git)
