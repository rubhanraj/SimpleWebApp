node {
   stage('Preparation') {
      git 'https://github.com/rubhan/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
}