#!/usr/bin/env groovy

package src.dani.Docker

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
    }
        def update() {
            pack.dir("app") {
                pack.sh "npm version ${pack.params.Version}"
                pack.env.VERSION2 = pack.sh(script: "npm pkg get version", returnStdout: true)
                pack.env.VERSION2 = pack.sh(script: "echo \"${pack.env.VERSION2}\" | sed 's/\"//g' | tr -d '\n'", returnStdout: true)
            }
        }
    }
