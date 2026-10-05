package com.jala.javaio;

import java.io.FileInputStream;

public class Q9_FileInputStream {

    public static void main(String[] args) {

        try {
            FileInputStream input =
                    new FileInputStream("output.txt");

            int data;

            while ((data = input.read()) != -1) {
                System.out.print((char) data);
            }

            input.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}