package com.tlaloc_es.anthill.math;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class AnglesTest extends TestCase {
	
	@Test
    public void isBetweenAngles() {
		System.out.println("Start > Tarjet && size < 180");
        assertFalse(Angles.isBetweenAngles(350, 16, 270));
        assertTrue(Angles.isBetweenAngles(350, 16, 351));

		System.out.println("Start < Tarjet && size < 180");
        assertFalse(Angles.isBetweenAngles(0, 90, 360));
        assertTrue(Angles.isBetweenAngles(0, 90, 45));
    
		System.out.println("Start = Tarjet && size = 0");
		for(int i = 0; i<Angles.TOTAL_ANGLES; i++) {
			assertFalse(Angles.isBetweenAngles(350, 0, i));
		}
        
		System.out.println("Start = Tarjet && size = 360");
		for(int i = 0; i<Angles.TOTAL_ANGLES; i++) {
			assertTrue(Angles.isBetweenAngles(350, 360, i));
		}
	
	}
	
}
