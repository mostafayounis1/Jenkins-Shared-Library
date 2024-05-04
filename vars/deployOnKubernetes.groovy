#!/usr/bin/env groovy

def call(String k8sCredentialsID) {
    withCredentials([[$class: 'KubernetesCredentialsBinding', credentialsId: "${k8sCredentialsID}", variable: 'KUBECONFIG_FILE']]) {
        sh "kubectl apply -f . --kubeconfig=${env.KUBECONFIG_FILE}"
    }
}

