#!/usr/bin/env groovy

import modules.Git

def call(String url){
    return new Git(this).Push(url)
}
