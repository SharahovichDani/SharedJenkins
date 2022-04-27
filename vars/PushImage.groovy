#!/usr/bin/env groovy

import dani.Docker.Docker

def call(ImageName){
    return new Docker(this).PushDocker(string ImageName)
}
