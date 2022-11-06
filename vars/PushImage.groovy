#!/usr/bin/env groovy

import modules.Docker

def call(String ImageName){
    return new Docker(this).PushDocker(ImageName)
}
