#!/usr/bin/env groovy

package dani.Docker

class Git implements Serializable {
    def pack

    Git(pack) {
        this.pack = pack
    }
    def Push() {
        pack.withCredentials([pack.string(credentialsId: "GitHub-Credentials2", variable: 'PASS')]) {
            pack.sh "git remote set-url origin https://${pack.PASS}@github.com/SharahovichDani/NodeProject.git"
            pack.sh 'git add .'
            pack.sh 'git commit -m "[ci skip]"'
            pack.sh 'git push origin HEAD:main'
        }
    }
    def Config() {
        pack.sh 'git config --global user.email "dancool11@gmail.com"'
        pack.sh 'git config --global user.name "jenkins"'
        pack.sh 'git config --list'
    }

}