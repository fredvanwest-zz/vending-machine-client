package com.vanwest.vendingmachineclient;

import java.util.ArrayList;
import java.util.List;

public class Sleeve {
	
	private List<Item> items = new ArrayList<>();
	
	public Sleeve() {}
	
	public Sleeve(List<Item> items) {
		this.items = items;
	}
	
	public List<Item> getItems() {
		return items;
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
	}
}
