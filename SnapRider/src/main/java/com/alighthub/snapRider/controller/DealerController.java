package com.alighthub.snapRider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alighthub.snapRider.model.Dealer;
import com.alighthub.snapRider.service.DealerService;

@RestController
@RequestMapping("/Dealer")
public class DealerController {

	@Autowired
	private DealerService dealerservice;
	
	@PostMapping("/add")
	public Dealer AddDealer(@RequestBody Dealer dealer)
	{
		return dealerservice.addDealer(dealer);
	}
	@GetMapping("/{id}")
	public Dealer EditDealer(@PathVariable ("id")int id) {
		
		return dealerservice.editDealer(id);
	}
	@PutMapping("/")
	public Dealer updateDealer(@RequestBody Dealer dealer) {
		
		return dealerservice.updateDealer(dealer);
	}
	@DeleteMapping("/{id}")
	public void DdeleteDealer(@PathVariable int id) {
		
		dealerservice.deleteDealer(id);
		
		
	}
}
