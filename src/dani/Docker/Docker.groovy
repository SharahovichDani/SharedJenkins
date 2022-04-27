#!/usr/bin/env groovy

package dani.Docker

class Docker implements Serializable {

    def pack

    Docker(pack) {
        this.pack = pack
    }
    def LoginDocker() {
        pack.withCredentials([pack.usernamePassword(credentialsId: "docker-hub", usernameVariable: "USER", passwordVariable: "PASS")]) {
            pack.sh "echo $pack.PASS | docker login -u $pack.USER --password-stdin"
        }
    }
    def BuildDocker(string ImageName) {
        pack.sh "docker build -t $ImageName ."
    }
    def PushDocker(string ImageName) {
        pack.sh "docker push $ImageName"
    }
}
