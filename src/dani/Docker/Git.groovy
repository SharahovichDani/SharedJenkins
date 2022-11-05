#!/usr/bin/env groovy

package dani.Docker

class Git implements Serializable {
    def pack

    Git(pack) {
        this.pack = pack
    }
    def Push(String url) {
        pack.withCredentials([pack.string(credentialsId: "GitHub-Credentials2", variable: 'PASS')]) {
            pack.sh '''git remote set-url origin https://'''+pack.PASS+'''@'''+url+''''''
            pack.sh 'git add .'
            pack.sh 'git commit -m "[ci skip]"'
            pack.sh 'git push origin HEAD:main'
        }
    }
    def Config(String Mail) {
        pack.sh "echo $Mail"
        pack.sh '''git config --global user.email '''+Mail+''''''
        pack.sh 'git config --list'
    }

}
