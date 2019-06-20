package com.wiangube.vitalsTest;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import com.wiangube.vitals.Vital;

public class VitalTest {
	@Test
	public void testBreathing() throws Throwable {
		Vital vital = new Vital();
		
		//William Antonio should always be breathing
		assertTrue("William Antonio is not breathing, hurry!", vital.getBreathing());
	}
}
