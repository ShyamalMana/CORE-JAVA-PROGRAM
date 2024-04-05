package com.shyam;

import java.util.Random;
import java.util.Scanner;

public class Random_Password_Generator
{
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter the desired length of the password: ");
		int length = scanner.nextInt();

		System.out.println("Specify password requirements:");
		System.out.print("Include numbers? (yes/no): ");
		boolean includeNumbers = scanner.next().equalsIgnoreCase("yes");
		System.out.print("Include lowercase letters? (yes/no): ");
		boolean includeLowercase = scanner.next().equalsIgnoreCase("yes");
		System.out.print("Include uppercase letters? (yes/no): ");
		boolean includeUppercase = scanner.next().equalsIgnoreCase("yes");
		System.out.print("Include special characters? (yes/no): ");
		boolean includeSpecial = scanner.next().equalsIgnoreCase("yes");

		String password = generatePassword(length, includeNumbers, includeLowercase, includeUppercase, includeSpecial);

		System.out.println("Generated password: " + password);
	}

	private static String generatePassword(int length, boolean includeNumbers, boolean includeLowercase,
			boolean includeUppercase, boolean includeSpecial) {
		StringBuilder password = new StringBuilder();
		Random r = new Random();

		String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*()-_=+";

		String allCharacters = "";
		if (includeLowercase)
			allCharacters += lowercaseLetters;
		if (includeUppercase)
			allCharacters += uppercaseLetters;
		if (includeNumbers)
			allCharacters += numbers;
		if (includeSpecial)
			allCharacters += specialCharacters;

		for (int i = 0; i < length; i++) {
			int randomIndex = r.nextInt(allCharacters.length());
			password.append(allCharacters.charAt(randomIndex));
		}

		return password.toString();
	}


}
