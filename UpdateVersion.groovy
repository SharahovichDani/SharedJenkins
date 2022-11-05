#!/usr/bin/env groovy

import srcc.Npm

def call(){
    return new Npm(this).UpdateVersion()
}
