#!/usr/bin/env groovy

import src.dani.Docker.Docker

def call(String ImageName){
    return new Docker(this).PushDocker(ImageName)
}
