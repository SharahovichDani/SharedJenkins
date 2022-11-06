#!/usr/bin/env groovy

import modules.Git

def call(String Mail){
    return new Git(this).Config(Mail)
}
