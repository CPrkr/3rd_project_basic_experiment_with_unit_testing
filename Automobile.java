package com.craigcode.basic_experiment_with_unit_testing;

public class Automobile {
	public int modelYear;
	public int currentYear;
	public String color;
	public float topSpeedInMPH;
	public boolean isHoodClosed;	
	
	Automobile (int unitModelYear, String unitColor, float unitTopSpeedInMPH) {
		
		this.modelYear = unitModelYear;
		this.color = unitColor;
		this.topSpeedInMPH = unitTopSpeedInMPH;
		
		currentYear = 2017;
		
		this.isHoodClosed = false;
	}
	
	public int ageOfAutomobile () {
		
		return currentYear - modelYear;
	}
	
	public float topSpeedInKMPH () {
		
		return topSpeedInMPH * 1.6f;
	}
	
	public void makeSureHoodIsClosed() {
		
		isHoodClosed = true;
	}
}
