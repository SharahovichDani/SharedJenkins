#!/usr/bin/env groovy

import modules.Docker

def call(){
    return new Docker(this).LoginDocker()
}
