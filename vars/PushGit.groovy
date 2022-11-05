#!/usr/bin/env groovy

import src.dani.Docker.Git

def call(String url){
    return new Git(this).Push(url)
}
