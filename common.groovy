def func1() {
  sh 'uname -a'
}

def func2(String whoAreYou) {
  echo "Look at this, ${whoAreYou}! You loaded this from another file!"
}

return this
