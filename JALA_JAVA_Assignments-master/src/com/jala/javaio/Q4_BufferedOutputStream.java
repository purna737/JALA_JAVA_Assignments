package com.jala.javaio;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Q4_BufferedOutputStream {

    public static void main(String[] args) {

        try {
            BufferedOutputStream output =
                    new BufferedOutputStream(
                            new FileOutputStream("bufferedOutput.txt"));

            String text = "Hello Purna\nThis text is written using BufferedOutputStream.";

            output.write(text.getBytes());

            output.flush();
            output.close();

            System.out.println("Data written successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}