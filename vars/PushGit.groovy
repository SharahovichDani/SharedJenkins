#!/usr/bin/env groovy

import src.classes.Git

def call(String url){
    return new Git(this).Push(url)
}
