package com.craigcode.basic_experiment_with_unit_testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AutomobileAgeTest.class, AutomobileTopSpeedConversionTest.class, AutomobileHoodClosureTest.class })
public class AllTests {

}
