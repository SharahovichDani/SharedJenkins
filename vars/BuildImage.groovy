#!/usr/bin/env groovy

import src.classes.Docker

def call(String ImageName){
        return new Docker(this).BuildDocker(ImageName)
}
