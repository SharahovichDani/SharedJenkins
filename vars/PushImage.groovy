#!/usr/bin/env groovy

import dani.Docker.Docker

def call(){
    return new Docker(this).PushDocker()
}
