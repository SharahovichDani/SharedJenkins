#!/usr/bin/env groovy

import dani.Docker.Docker

def call(string ImageName){
    pack.dir("app") {
        return new Docker(this).BuildDocker(string ImageName)
    }
}
