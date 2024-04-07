package com.headfirstdp.decorator;

/* Abstract Component */
public abstract class Beverage {
	private String description;

	// Cost method
	public abstract double cost();

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
