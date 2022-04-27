#!/usr/bin/env groovy

import dani.docker.Npm

def call(){
    return new Npm(this).install()
}
