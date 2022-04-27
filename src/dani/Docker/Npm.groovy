#!/usr/bin/env groovy

package dani.Docker

class Npm implements Serializable {
    def pack

    Npm(pack) {
        this.pack = pack
    }
    def install() {
        pack.dir("app") {
            pack.sh "npm install"
        }
    }
    def test() {
        pack.dir("app") {
            pack.sh "npm test"
        }
    }
    def pack() {
        pack.dir("app") {
            pack.sh "rm -f bootcamp-node-project*"
            pack.sh "npm pack"
        }
        def update() {
            dir("app") {
                sh "npm version ${params.Version}"
                env.VERSION2 = sh(script: "npm pkg get version", returnStdout: true)
                env.VERSION2 = sh(script: "echo \"${env.VERSION2}\" | sed 's/\"//g' | tr -d '\n'", returnStdout: true)
            }
        }
    }

}
