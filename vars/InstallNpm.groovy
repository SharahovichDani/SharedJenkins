#!/usr/bin/env groovy

import src.dani.Docker.Npm

def call(){
    return new Npm(this).install()
}
