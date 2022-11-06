#!/usr/bin/env groovy

import src.modules.Git

def call(String Mail){
    return new Git(this).Config(Mail)
}
