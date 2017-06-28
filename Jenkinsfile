#!/usr/bin/env groovy

node {
    stage('Checkout') {
        checkout scm
    }

    stage('Build') {
        def mvnHome = tool 'Maven350'
        sh "${mvnHome}/bin/mvn clean install"
    }
   
}