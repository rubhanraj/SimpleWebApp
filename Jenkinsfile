node {
   stage('Preparation') {
      git 'https://github.com/rubhanraj/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
   stage('deploy'){
        sh "git push https://git.heroku.com/intense-earth-00082.git master"
   }
}