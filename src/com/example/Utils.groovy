package com.example

class Utils {
    String sayHello(String name) {

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty")
        }

        return "Hello, $name!"
    }
}