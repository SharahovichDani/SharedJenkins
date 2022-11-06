#!/usr/bin/env groovy

import src.modules.Git

def call(String url){
    return new Git(this).Push(url)
}
