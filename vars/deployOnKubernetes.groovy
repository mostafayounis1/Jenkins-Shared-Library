#!/usr/bin/env groovy

// KubernetesCredentialsID 'KubeConfig file'
def call(String k8sCredentialsID) {

    // login to k8s Cluster via KubeConfig file
    withCredentials([file(credentialsId: "${k8sCredentialsID}", variable: 'KUBECONFIG_FILE')]) {
        sh "export KUBECONFIG=${newconf} && kubectl apply -f . "
    }
}


