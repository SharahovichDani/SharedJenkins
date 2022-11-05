#!/usr/bin/env groovy

import src.Git

def call(String url){
    return new Git(this).Push(url)
}
