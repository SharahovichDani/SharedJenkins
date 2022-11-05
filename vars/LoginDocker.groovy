#!/usr/bin/env groovy

import src.classes.Docker

def call(){
    return new Docker(this).LoginDocker()
}
