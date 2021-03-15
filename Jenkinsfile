node {
   stage('Preparation') {
      git 'https://github.com/rubhanraj/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
}