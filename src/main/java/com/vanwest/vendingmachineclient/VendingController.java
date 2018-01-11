package com.vanwest.vendingmachineclient;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class VendingController {
	
	@RequestMapping("/dispenser")
	public String GetDispenser(Model m) {
		RestTemplate rest = new RestTemplate();
		Dispenser dispenser = rest.getForObject("http://localhost:8086/inventory", Dispenser.class);
		System.out.println("Getting dispenser");
		m.addAttribute("numCoke", dispenser.getSleeves().get(0).getItems().size());
		m.addAttribute("numDietCoke", dispenser.getSleeves().get(1).getItems().size());
		m.addAttribute("numSprite", dispenser.getSleeves().get(2).getItems().size());
		m.addAttribute("numDrPepper", dispenser.getSleeves().get(3).getItems().size());
		m.addAttribute("numDasani", dispenser.getSleeves().get(4).getItems().size());
		return "inventory";
	}

}
