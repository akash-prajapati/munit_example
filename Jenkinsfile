
node {
    
   def mvnHome
    
   stage('SCM') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/akash-prajapati/auto-web-project.git'
     
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured in the global configuration.
      mvnHome = tool 'MAVEN_HOME'
   }
   
   /* Deploying to the local Machine*/
   stage('Build') {
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
      } else {
         // bat(/"${mvnHome}\bin\mvn" clean install jboss-as:deploy -Djboss.hostname=127.0.0.1 -Djboss.admin.user=admin -Djboss.admin.password=Oct@@2016/)
            bat(/"${mvnHome}\bin\mvn" clean install jboss-as:deploy -Djboss.hostname=127.0.0.1 -Djboss.admin.user=akash -Djboss.admin.password=akash@123/)
      }    
   }
   
   /* Deploying to the QA Machine*/
   stage('QA') {
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
      } else {
         // bat(/"${mvnHome}\bin\mvn" clean install jboss-as:deploy -Djboss.hostname=01HW1006775 -Djboss.admin.user=admin -Djboss.admin.password=Oct@@2016/)
         // bat(/"${mvnHome}\bin\mvn" clean install jboss-as:deploy -Djboss.hostname=01HW912710 -Djboss.admin.user=akash -Djboss.admin.password=akash@123/)
            bat(/"${mvnHome}\bin\mvn" clean install jboss-as:deploy -Djboss.hostname=127.0.0.1 -Djboss.admin.user=akash -Djboss.admin.password=akash@123/)
      }    
   }
   
   /* Confirmation for Production Deployment. */
   stage("userInput") {
            def userInput = input(id: 'userInput', message: 'Let\'s promote?', parameters: [
        [$class: 'TextParameterDefinition', defaultValue: 'yes', description: 'Go Ahead', name: 'response']])
        
        
    }
   
    /* Deploying to the Production Machine*/
   stage("Prod"){
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
     } else {
         // bat(/"${mvnHome}\bin\mvn" clean install jboss-as:deploy -Djboss.hostname=127.0.0.1 -Djboss.admin.user=admin -Djboss.admin.password=Oct@@2016/)
         // bat(/"${mvnHome}\bin\mvn" clean install jboss-as:deploy -Djboss.hostname=10.26.9.96 -Djboss.admin.user=admin -Djboss.admin.password=jbosseap1!/)
            bat(/"${mvnHome}\bin\mvn" clean install jboss-as:deploy -Djboss.hostname=127.0.0.1 -Djboss.admin.user=akash -Djboss.admin.password=akash@123/)
     }  
   }    
}
