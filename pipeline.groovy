def call(Map config) {
    def common = load('.files/common.groovy')
    // stage('Clone')
    common.checkoutVv credentialsId: config.gitCredentialsId

    stage('One') {
       currentBuild.displayName = currentBuild.displayName + ": VERSION_NAME"
       sh "ls -la"
       common.func1()
    }
    stage('Two') {
       echo "two"
       common.func2('Qwert')
    }
}

return this
