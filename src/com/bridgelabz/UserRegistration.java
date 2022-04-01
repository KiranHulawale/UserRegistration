package com.bridgelabz;
import java.util.regex.Matcher;
import  java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegistration {

    static Scanner scan = new Scanner(System.in);
    final String FIRST_NAME = "^[A-Z][a-z]{2,}$";

    public void firstName(String name) {

        Pattern pattern = Pattern.compile(FIRST_NAME);
        Matcher match = pattern.matcher(name);
      // System.out.println(match.matches());
        if (match.matches()) {
            System.out.println("Name is valid");
        } else {
            System.out.println("Name is invalid");
        }

    }

    public static void main(String[] args) {
        System.out.print(" Please enter the FirstName: ");
        String name = scan.nextLine();
        UserRegistration userDetails = new UserRegistration();
        userDetails.firstName(name);
    }
}

