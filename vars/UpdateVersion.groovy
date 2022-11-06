#!/usr/bin/env groovy

import src.modules.Npm

def call(){
    return new Npm(this).update()
}
