def call() {
    stage('One') {
                currentBuild.displayName = currentBuild.displayName + ": VERSION_NAME"
            sh "ls -la"
        }
    }
    stage('Two') {
            echo "two"
    }
}

return this
