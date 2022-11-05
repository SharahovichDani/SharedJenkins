#!/usr/bin/env groovy

import src.Npm

def call(){
    return new Npm(this).install()
}
