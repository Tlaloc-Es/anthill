package com.tlaloc_es.anthill.math;

public class Angles {
	
	public static final int TOTAL_ANGLES = 361;
	
	public static boolean isBetweenAngles(double startAngle, double angleSize, double angleTarget){
		boolean isBetweenAngles = false;
		double diference;
		double endAngle;
		
		startAngle = ModCalculator.normalize(startAngle, TOTAL_ANGLES);
		angleSize = ModCalculator.normalize(angleSize, TOTAL_ANGLES);
		angleTarget = ModCalculator.normalize(angleTarget, TOTAL_ANGLES);
		
		diference = subtractionAngle(TOTAL_ANGLES, startAngle);
		startAngle = 0.0;
		endAngle = additionAngle(startAngle, angleSize);
		angleTarget = additionAngle(angleTarget, diference);
		
		if((startAngle <= angleTarget) && (angleTarget <= endAngle)) {
			if(angleSize > 0) {
				isBetweenAngles = true; 
			}else {
				isBetweenAngles = false;
			}
		}else{
			isBetweenAngles = false;
		}
		
		return isBetweenAngles;
	}
	
	public static double additionAngle(double a, double b) {
		return ModCalculator.addition(a, b, TOTAL_ANGLES);
	}
	
	public static double subtractionAngle(double a, double b) {
		return ModCalculator.subtraction(a, b, TOTAL_ANGLES);
	}
}
