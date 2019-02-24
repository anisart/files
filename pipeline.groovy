def common = load('common.groovy')

def call() {
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
