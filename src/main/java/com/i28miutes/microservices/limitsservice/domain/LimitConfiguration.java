package com.i28miutes.microservices.limitsservice.domain;

public class LimitConfiguration {
	
	int maximum;
	int minimum;
	
	
	
	public LimitConfiguration() {
		
	}
	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	

}
