package com.jala.javaio;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Q6_BufferedWriter {

    public static void main(String[] args) {

        try {
            BufferedWriter writer =
                    new BufferedWriter(new FileWriter("bufferedWriter.txt"));

            writer.write("Hello Purna");
            writer.newLine();
            writer.write("This text is written using BufferedWriter.");

            writer.close();

            System.out.println("Data written successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}