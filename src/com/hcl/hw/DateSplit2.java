package com.hcl.hw;

import java.util.StringTokenizer;

public class DateSplit2 {

	public static void main(String[] args) {

		StringTokenizer date = new StringTokenizer("10/12/2017", "/");

		// Splits the above date as tokens--Date, month, and year
		while (date.hasMoreTokens()) {
			System.out.println("Date:" + date.nextToken());// Date
			System.out.println("Month:" + date.nextToken());// Month
			System.out.println("Year:" + date.nextToken());// Year

		}

	}

}
