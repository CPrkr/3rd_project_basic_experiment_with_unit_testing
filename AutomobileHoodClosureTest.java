package com.craigcode.basic_experiment_with_unit_testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AutomobileHoodClosureTest {
	Automobile gremlin;
	
	@Before
	public void makeGremlin() {
		
		gremlin = new Automobile (1977, "green", 91f);
	}
	
	@Test
	public void testModelT() {

		Automobile modelT = new Automobile (1908, "black", 45f);
		
		modelT.makeSureHoodIsClosed();
		assertTrue(modelT.isHoodClosed);
	}

	@Test
	public void testGremlin() {
		
		gremlin.makeSureHoodIsClosed();
		assertTrue(gremlin.isHoodClosed);
	}
}
