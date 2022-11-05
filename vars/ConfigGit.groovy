#!/usr/bin/env groovy

import src.classes.Git

def call(String Mail){
    return new Git(this).Config(Mail)
}
