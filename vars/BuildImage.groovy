#!/usr/bin/env groovy

import src.Docker

def call(String ImageName){
        return new Docker(this).BuildDocker(ImageName)
}
