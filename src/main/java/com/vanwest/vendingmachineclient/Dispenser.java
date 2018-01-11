package com.vanwest.vendingmachineclient;

import java.util.List;
import java.util.ArrayList;

public class Dispenser {
	
	private List<Sleeve> sleeves = new ArrayList<>();
	
	public Dispenser() {}
	
	public Dispenser(List<Sleeve> sleeves) {
		this.sleeves = sleeves;
	}

	public List<Sleeve> getSleeves() {
		return sleeves;
	}

	public void setSleeves(List<Sleeve> sleeves) {
		this.sleeves = sleeves;
	}
}
