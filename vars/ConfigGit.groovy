#!/usr/bin/env groovy

import dani.Docker.Git

def call(String Mail){
    return new Git(this).Config(Mail)
}
