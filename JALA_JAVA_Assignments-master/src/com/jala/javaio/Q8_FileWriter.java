package com.jala.javaio;

import java.io.FileWriter;

public class Q8_FileWriter {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("fileWriter.txt");

            writer.write("Hello Purna");
            writer.write("\nThis text is written using FileWriter.");

            writer.close();

            System.out.println("Data written successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}