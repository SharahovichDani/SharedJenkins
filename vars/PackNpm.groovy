#!/usr/bin/env groovy

import src.classes.Npm

def call(){
    return new Npm(this).pack()
}
