environment {
    DOCKERHUB_CREDENTIALS = credentials('docker-cred')
}
pipeline {
     agent {
        node {
            label "maven"
        }
    }
    stages {
        stage  ("build"){
            steps {
                echo "--------------------------------build start--------------------------------------------------"
                sh 'mvn clean package -Dmaven.test.skip=true'
                echo "--------------------------------build end----------------------------------------------------"
            }
        }

       
    }
}
