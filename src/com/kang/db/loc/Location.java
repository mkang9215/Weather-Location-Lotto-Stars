package com.kang.db.loc;

public class Location {
	private String name;
	private String address;
	private String distance;
	private String phone;
	
	public Location() {
	}

	public Location(String name, String address, String distance, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.distance = distance;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}



	
}
