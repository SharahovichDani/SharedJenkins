#!/usr/bin/env groovy

import modules.Npm

def call(){
    return new Npm(this).update()
}
