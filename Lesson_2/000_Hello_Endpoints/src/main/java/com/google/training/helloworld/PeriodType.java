package com.google.training.helloworld;

public enum PeriodType {
	ONE("one"),
	MORNING("morning"),
	EVENING("evening"),
	AFTERNOON("afternoon"),
	DAY("day"),
	NIGHT("night");
	
	private PeriodType(String type){
		this.type = type;
	}
	
	private String type;

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
}
