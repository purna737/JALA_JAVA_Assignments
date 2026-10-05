package com.jala.javaio;

import java.io.FileReader;

public class Q7_FileReader {

    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("output.txt");

            int data;

            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }

            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}