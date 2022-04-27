#!/usr/bin/env groovy

import dani.docker.Git

def call(){
    return new Git(this).Push
}
