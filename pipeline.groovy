stage('One') {
    steps {
        script {
            currentBuild.displayName = currentBuild.displayName + ": VERSION_NAME"
        }
        sh "ls -la"
    }
}
stage('Two') {
    steps {
        echo "two"
    }
}
