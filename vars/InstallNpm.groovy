#!/usr/bin/env groovy

import dani.Docker.Npm

def call(){
    return new Npm(this).install()
}
