def call() {
    def common = load('common.groovy')
    stage('Clone') {
        checkoutVv credentialsId: '57137eb5-c677-4b23-ad2a-510919a8e2cd'
    }
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
