package com.Dunford;

import java.awt.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    	fizzBuzz();
		System.out.println();
    	System.out.println("Fibonacci(10): "+ fibonacci(10));
    	int[] sortThis = {10, 3, 6, 7, 2, 1, 0};
		insertionSort(sortThis);
    	System.out.println(Arrays.toString(sortThis));
//    	System.out.println("IsPrime(55): " + isPrime(55));
//    	System.out.println("IsPrime(107): " + isPrime(107));
    }

    public static void insertionSort(int[] arr) {
    	int key;
    	for (int i = 0; i < arr.length; i++) {
    		key = arr[i];
    		int j = i - 1;
    		while (j >=0 && key < arr[j]) {
    			arr[j + 1] = arr[j];
    			j--;
			}
			arr[j + 1] = key;
		}
	}

    // Fizz buzz from 1 to 100
	// Write a program that prints the numbers from 1 to 100 and
	// for multiples of '3' print "Fizz" instead of the number and
	// for the multiples of '5' print "Buzz"
	public static void fizzBuzz() {
    	for (int i = 1; i < 101; i++) {
    		if (i % 3 == 0) {
    			System.out.print("Fizz");
			} else if (i % 5 == 0) {
    			System.out.print("Buzz");
			} else {
				System.out.print(i + "");
			}
			if (i != 100) {
    			System.out.print(", ");
			}
		}
	}

    // print fibonacci sequence: 1, 1, 2, 3, 5, 8, 13, etc.
    private static int fibonacci(int num) {
		if (num < 2) {
			return num;
		}

		// Recursion not as efficient as iterative, unoptimized for large numbers
		return fibonacci(num - 1) + fibonacci(num - 2);
	}

	// print if a number is prime or not
	public static boolean isPrime(int num) {
    	// iterate through numbers up to square root + 1 of num
		for (int i = 0; i < Math.sqrt(num) + 1; i++) {
			if ((num % i) == 0) {
				return false;
			}
		}
		return true;
	}

	// print if string is a palindrome or not
	public static void isPalindrome(String string) {
    	// without library methods
	}

	// Reverse a string w String Buffer
	public static void reverseStringWStringBuffer(String string) {
    	StringBuffer sBuffer = new StringBuffer(string);
    	System.out.println(sBuffer.reverse());
	}

	// Reverse string iteratively
	public static void reverseStringIterative(String string) {
    	char[] strArray = string.toCharArray();
    	for (int i = strArray.length - 1; i >= 0; i--) {
    		System.out.println(strArray[i]);
		}
	}

	// Reverse string recursively
	public static String reverseStringRecursive(String string) {
    	if (string == null || string.length() <= 1) {
    		return string;
		} else {
    		return reverseStringRecursive(string.substring(1)) + string.charAt(0);
		}
	}

	// Create a pyramid of numbers
	public static void numberPyramid(int numRows) {
    	int rowCount = 1;
    	for (int i = numRows; i > 0; i--) {
    		for (int j = 1; j <= i; j++) {
    			System.out.print(" ");
			}
			for (int n = 1; n <= rowCount; n++) {
    			System.out.print(rowCount + " ");
			}
			System.out.println();

    		rowCount++;
		}
	}

	//Create Pyramid special pattern
	public static void specialPyramid(int numRows) {
    	int rowCount = 1;

    	for (int i = numRows; i > 0; i--) {
    		for (int j = 1; j <= i * 2; j++) {
    			System.out.print(" ");
			}
			for (int n = 1; n <= rowCount; n++) {
    			System.out.print(n + " ");
			}
			for (int m = rowCount - 1; m >= 1; m--) {
				System.out.print(m + " ");
			}
			System.out.println();

    		rowCount++;
		}
	}

	// Remove all white space from a string


	// Find duplicate characters in a string


	// Check equality of two arrays


	// Check if two strings are anagram (same characters but different order)


	// Check if number is Armstrong Number (sum of digits with each raised to the power of number of digits)


	// Find duplicate elements in an array


	// Find sum of all digits of a number


	// Find second largest number in int array


	// Perform matrix operations: matrix addition, subtraction, multiplication, transpose


	// Count occurrences of each character in a string


	// Find largest number less than a given number and without a given digit


	// Find all pairs of elements in array whose sum is equal to given number


	// Find continuous sub array whose sum is equal to given number


	// Remove duplicate elements from ArrayList


	// Check whether given number is binary


	// Check if one string is a rotation of another: eg “StrutsHibernateJavaJ2ee”, “J2eeStrutsHibernateJava“, “HibernateJavaJ2eeStruts“


	// Find intersection of two arrays (common elements between two arrays)


	// Check whether user input is number or not


	// Find trig values (sin, cos, tan, sec, cosec, cot) of an angle


	// Reverse each word of a string


	// Separate zeroes from non-zeroes in array


	//Decimal to Binary, Decimal to Octal, Decimal to Hexadecimal


	// Find leaders in array (element to the element's right is smaller)


	// Revers and add until you get a palindrome (take num from user, revers it, then add to itself until you get palindrome)


	// Selection Sort


	// Launch external applications through java (notepad)


	// Method to prove strings are immutable


	// Implement ArrayList


	// Implement LinkedList


	// Generate Random Numbers


	// Reverse array without creating additional array
}
