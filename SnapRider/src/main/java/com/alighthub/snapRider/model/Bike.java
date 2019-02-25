package com.alighthub.snapRider.model;

public class Bike {

	private int bike_number;
	
	public int getBike_number() {
		return bike_number;
	}

	public void setBike_number(int bike_number) {
		this.bike_number = bike_number;
	}

	public String getBike_name() {
		return bike_name;
	}

	public void setBike_name(String bike_name) {
		this.bike_name = bike_name;
	}

	public String getBike_engine() {
		return bike_engine;
	}

	public void setBike_engine(String bike_engine) {
		this.bike_engine = bike_engine;
	}

	public String getBike_ccno() {
		return bike_ccno;
	}

	public void setBike_ccno(String bike_ccno) {
		this.bike_ccno = bike_ccno;
	}

	private String bike_name;
	
	private String bike_engine;
	
	private String bike_ccno;
	
}
