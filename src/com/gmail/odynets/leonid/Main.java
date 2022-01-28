package com.gmail.odynets.leonid;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r;
		// Getting radius
		System.out.println("Enter radius: ");
		r = sc.nextDouble();
		// Calculating by formula
		double l;
		l = 2 * Math.PI * r;
		// Result output
		System.out.println("Circle circumference: " + l);

	}

}
