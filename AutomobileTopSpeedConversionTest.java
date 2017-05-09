package com.craigcode.basic_experiment_with_unit_testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class AutomobileTopSpeedConversionTest {

	@Test
	public void test() {
		
		Automobile modelT = new Automobile (1908, "black", 45f);
		
		float modelTTopSpeedInKMPH = modelT.topSpeedInKMPH();
		assertEquals(72f, modelTTopSpeedInKMPH, .001f);
	}

}
