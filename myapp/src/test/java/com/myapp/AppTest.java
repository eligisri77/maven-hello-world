package com.myapp;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class AppTest {

    @Test
    public void shouldPrintHelloWorld() {
        // Capture System.out
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Run the main method
        App.main(new String[]{});

        // Check the output contains the expected text
        String output = out.toString().trim();
        assertTrue("Output should contain 'Eli, Hello World!'", 
                   output.contains("Eli, Hello World!"));
    }
}
