package com.vanwest.vendingmachineclient;

public class Item {
	private String type; // Could be an enum for bottle vs can.
	private String brand;
	
	public Item() {}
	
	public Item(String type, String brand) {
		this.type = type;
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
