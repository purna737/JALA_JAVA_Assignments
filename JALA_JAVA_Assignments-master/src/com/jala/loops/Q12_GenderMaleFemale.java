package com.jala.loops;

public class Q12_GenderMaleFemale {

    public static void main(String[] args) {

        char gender = 'M';

        switch (gender) {

            case 'M':
                System.out.println("Gender is Male");
                break;

            case 'F':
                System.out.println("Gender is Female");
                break;

            default:
                System.out.println("Invalid Gender");
        }
    }
}