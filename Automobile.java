package com.craigcode.basic_experiment_with_unit_testing;

public class Automobile {
	public int modelYear;
	public int currentYear;
	public String color;
	public float topSpeedInMPH;
	
	Automobile (int unitModelYear, String unitColor, float unitTopSpeedInMPH) {
		
		this.modelYear = unitModelYear;
		this.color = unitColor;
		this.topSpeedInMPH = unitTopSpeedInMPH;
		
		currentYear = 2017;
	}
	
	public int ageOfAutomobile () {
		
		return currentYear - modelYear;
	}
	
	public float topSpeedInKMPH () {
		
		return topSpeedInMPH * 1.6f;
	}
}
