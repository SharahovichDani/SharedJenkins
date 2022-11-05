#!/usr/bin/env groovy

import src.dani.Docker.Docker

def call(){
    return new Docker(this).LoginDocker()
}
