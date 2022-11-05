#!/usr/bin/env groovy

import src.Git

def call(String Mail){
    return new Git(this).Config(Mail)
}
