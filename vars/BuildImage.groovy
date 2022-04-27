#!/usr/bin/env groovy

import dani.Docker.Docker

def call(string ImageName){
    return new Docker(this).BuildDocker(string ImageName)
}
