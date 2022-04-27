#!/usr/bin/env groovy

import dani.Docker.Git

def call(){
    return new Git(this).Config()
}
