#!/usr/bin/env groovy

node {
   stage 'Checkout'
   checkout scm

   def mvnHome = tool 'Maven350'

   stage 'Build'
   sh "${mvnHome}/bin/mvn clean install"
}