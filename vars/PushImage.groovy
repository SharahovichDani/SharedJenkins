#!/usr/bin/env groovy

import src.modules.Docker

def call(String ImageName){
    return new Docker(this).PushDocker(ImageName)
}
