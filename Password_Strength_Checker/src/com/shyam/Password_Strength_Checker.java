package com.shyam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Password_Strength_Checker 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String input = sc.nextLine();
        sc.close();

        char[] ch = input.toCharArray();
        boolean upper = false, lower = false, specialChar = false, digit = false;

        HashSet<Character> specialChars = new HashSet<Character>(Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '+', '|'));

        for (char c : ch) {
            if (Character.isLowerCase(c)) {
                lower = true;
            } else if (Character.isUpperCase(c)) {
                upper = true;
            } else if (Character.isDigit(c)) {
                digit = true;
            } else if (specialChars.contains(c)) {
                specialChar = true;
            }
        }

        if (lower && upper && digit && specialChar) {
            System.out.println("Very strong password.");
        } else if (lower || upper || digit || specialChar) {
            System.out.println("Moderate Type password.");
        } else {
            System.out.println("Weak password.");
        }
	}

}
