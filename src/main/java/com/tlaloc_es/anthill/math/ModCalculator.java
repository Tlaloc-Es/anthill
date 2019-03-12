package com.tlaloc_es.anthill.math;

public class ModCalculator {
	public static double addition(double a, double b, double total) {
		return (a+b) % total;
	}
	
	public static double subtraction(double a, double b, double total) {
		return (a % total - b % total + total) % total;
	}

	public static double normalize(double a, double total) {
		return a % total;
	}
	
}
