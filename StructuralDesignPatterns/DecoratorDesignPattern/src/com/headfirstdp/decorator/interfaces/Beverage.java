package com.headfirstdp.decorator.interfaces;

/* Abstract Component */
/* Decorator D.P:
   --------------
	Decorator D.P attaches additional responsibilities to an object dynamically.Decorators
	provide a flexible alternative to sub-classing for extending functionality.
 */

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
