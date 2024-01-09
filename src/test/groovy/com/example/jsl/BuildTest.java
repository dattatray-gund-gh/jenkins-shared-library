package com.example.jsl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildTest {

    @Test
    void build() {
        Build build = new Build();
        assertEquals("Building dev...", build.build("dev"));
    }
}