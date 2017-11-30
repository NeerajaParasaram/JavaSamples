package com.text.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LengthOfPalindrome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Input String ........");
		String str = scan.nextLine();

		System.out.println("Max length of the substring to become palindrome is :" + findLengthOfPalindrome(str));
	}

	public static int findLengthOfPalindrome(String input) {
		int len = 0;
		/*
		 * char tempArray[] = input.toCharArray(); 
		 * Arrays.sort(tempArray);
		 * String sorted = new String(tempArray);
		 * System.out.println("Sorted String :" + sorted);
		 */

		Map<Character, Integer> dupsMap = new HashMap<Character, Integer>();
		for (Character ch : input.toCharArray()) {
			if (dupsMap.containsKey(ch)) {
				dupsMap.put(ch, dupsMap.get(ch) + 1);
			} else {
				dupsMap.put(ch, 1);
			}
		}

		for (Map.Entry<Character, Integer> entryMap : dupsMap.entrySet()) {
			if (entryMap.getValue() > 1) {
				// System.out.println("Char :"+ entryMap.getKey() + " Value:"+ entryMap.getValue());
				if (entryMap.getValue() % 2 == 0) {
					len += (entryMap.getValue());
				} else {
					len += (entryMap.getValue()) - 1;
				}
			}
		}

		return len;
	}

}
