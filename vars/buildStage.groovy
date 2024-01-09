#!/usr/bin/env groovy

def call(String name = "India") {
    def greeting = com.example.Utils.sayHello(name)
    echo "Greeting: $greeting"
}
