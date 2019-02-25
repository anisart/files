def func1() {
  sh 'uname -a'
}

def func2(String whoAreYou) {
  echo "Look at this, ${whoAreYou}! You loaded this from another file!"
}

def checkoutVv(Map config) {
  checkout([
    $class: 'GitSCM',
    branches: [[name: 'fake']],
    doGenerateSubmoduleConfigurations: false,
    extensions: [
            [$class: 'CleanBeforeCheckout'],
            [$class: 'PruneStaleBranch'],
            [$class: 'CloneOption',
             noTags: false,
             timeout: 60]],
    submoduleCfg: [],
    userRemoteConfigs: [[url: 'https://github.com/anisart/VV.git', credentialsId: config.credentialsId]]
  ])
}

return this
