#!/usr/bin/env groovy

import src.Docker

def call(){
    return new Docker(this).LoginDocker()
}
