package com.bridgelabz;
import java.util.regex.Matcher;
import  java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegistration {

    static Scanner scan = new Scanner(System.in);

    public void firstName() {
        System.out.print(" Please enter the FirstName: ");
        String name = scan.nextLine();
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher match = pattern.matcher(name);
      // System.out.println(match.matches());
        if (match.matches()) {
            System.out.println("FirstName is valid");
        } else {
            System.out.println("FirstName is invalid");
        }

    }

    public void lastName() {
        System.out.print(" Please enter the LastName: ");
        String name = scan.nextLine();
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher match = pattern.matcher(name);
        // System.out.println(match.matches());
        if (match.matches()) {
            System.out.println("LastName is valid");
        } else {
            System.out.println("LastName is invalid");
        }

    }

    public static void main(String[] args) {
        UserRegistration userDetails = new UserRegistration();
        userDetails.firstName();
        userDetails.lastName();
    }
}
