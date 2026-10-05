package com.jala.javaio;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Q2_OutputStream {

    public static void main(String[] args) {

        try {
            OutputStream output =
                    new FileOutputStream("output.txt");

            String text = "Hello Purna\nThis text is written using OutputStream.";

            output.write(text.getBytes());

            output.close();

            System.out.println("Data written successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}