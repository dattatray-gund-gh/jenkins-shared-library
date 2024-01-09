package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void sayHello() {
        Utils utils = new Utils();
        String result = utils.sayHello("World");
        assertEquals("Hello, World!", result);
    }
}