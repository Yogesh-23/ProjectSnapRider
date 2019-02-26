package com.alighthub.snapRider.service;

import com.alighthub.snapRider.model.Dealer;

public interface DealerService {
	

	public Dealer addDealer(Dealer dealer);
	
	public Dealer editDealer(int id);
	
	public Dealer updateDealer(Dealer dealer);
	
	public void deleteDealer(int id);
	
}
