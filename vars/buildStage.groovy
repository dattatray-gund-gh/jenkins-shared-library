#!/usr/bin/env groovy

import com.example.constants.ApplicationConstants

def call(String name = null) {
    def resource = libraryResource 'config.properties'
    ech "resource: $resource"
    //def props = readProperties text: resource
//    def configname = props[ApplicationConstants.NAME]
    echo "Greeting: $configname"
}
