#!/usr/bin/env groovy

import dani.Docker.Git

def call(String url){
    return new Git(this).Push(url)
}
