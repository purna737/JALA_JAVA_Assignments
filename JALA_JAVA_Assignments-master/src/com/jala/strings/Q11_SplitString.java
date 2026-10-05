package com.jala.strings;

public class Q11_SplitString {

    public static void main(String[] args) {

        String text = "Java Full Stack Developer";

        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}