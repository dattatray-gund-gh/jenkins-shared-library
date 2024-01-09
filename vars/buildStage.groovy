#!/usr/bin/env groovy

import com.example.Utils

def call(String name = "India") {
    def greeting = new Utils().sayHello(name)
    echo "Greeting: $greeting"
}
