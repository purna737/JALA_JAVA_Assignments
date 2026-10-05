package com.jala.javaio;

import java.io.FileInputStream;
import java.io.InputStream;

public class Q1_InputStream {

    public static void main(String[] args) {

        try {
            InputStream input = new FileInputStream("sample.txt");

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