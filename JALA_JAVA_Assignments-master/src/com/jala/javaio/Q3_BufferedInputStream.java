package com.jala.javaio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Q3_BufferedInputStream {

    public static void main(String[] args) {

        try {
            BufferedInputStream input =
                    new BufferedInputStream(new FileInputStream("output.txt"));

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