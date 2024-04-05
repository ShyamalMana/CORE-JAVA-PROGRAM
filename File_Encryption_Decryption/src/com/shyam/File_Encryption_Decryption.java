package com.shyam;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class File_Encryption_Decryption 
{
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws NoSuchElementException, IOException {

		System.out.println("Enter Data to encrypt");
		String Input = sc.nextLine();
		System.out.println("Enter the key to encript between 1 to 9");
		int Key = sc.nextInt();

		char[] data = Input.toCharArray();
		char[] d = data;
		for (char c : data) {
			c += Key;
			System.out.print(c);
		}
		System.out.println();
		char[] decry = {};
		System.out.println("Enter 1 if you wanna decrypt");
		int n = sc.nextInt();
		sc.close();
		switch (n) {
		case 1:
			decry = Generic_For_Encription.Gen(d, Key);
			char[] de = decry;
			for (char c : de) {
				System.out.print(c);
			}

			break;
		}
 RandomAccessFile f = new RandomAccessFile("Encript_Decript.txt","rw");
 for (char c : data) {
	 f.writeChar(c);
	
}
 f.writeChars("-->");
 for (char g : decry) {
	 f.writeChar(g);
	
}
	}


}
