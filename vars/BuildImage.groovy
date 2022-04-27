#!/usr/bin/env groovy

import dani.Docker.Docker

def call(String ImageName){
        return new Docker(this).BuildDocker(ImageName)
}
