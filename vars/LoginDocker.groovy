#!/usr/bin/env groovy

import src.modules.Docker

def call(){
    return new Docker(this).LoginDocker()
}
