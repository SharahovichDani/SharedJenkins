#!/usr/bin/env groovy

import dani.Docker.Git

def call(String Name, String Mail){
    return new Git(this).Config(Name, Mail)
}
