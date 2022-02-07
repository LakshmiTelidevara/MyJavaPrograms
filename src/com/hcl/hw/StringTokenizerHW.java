package com.hcl.hw;

import java.util.StringTokenizer;

public class StringTokenizerHW {

	public static void main(String[] args) {

		/*
		 * This is a program to create tokens using StringTokenizer It will give
		 * the total number of possible tokens and break a given string into
		 * tokens
		 */

		StringTokenizer usa = new StringTokenizer(
				"First Name:LAKSHMI/Last Name: TELIDEVARA/Place: FRISCO", "/");

		System.out.println("Number of possible tokens: " + usa.countTokens());
		while (usa.hasMoreTokens()) {
			System.out.println(usa.nextToken());

		}

	}
}