#!/usr/bin/env groovy

node {
    stage('Checkout') {
        checkout scm

        def model = readMavenPom
        echo "Your artifact is $model.groupId $model.artifactId $model.version"
    }

    stage('Build') {
        def mvnHome = tool 'Maven350'
        sh "${mvnHome}/bin/mvn clean install"
    }
   
}