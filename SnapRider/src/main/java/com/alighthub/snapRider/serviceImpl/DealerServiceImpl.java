package com.alighthub.snapRider.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alighthub.snapRider.dao.DealerDao;
import com.alighthub.snapRider.model.Dealer;
import com.alighthub.snapRider.service.DealerService;

@Service
public class DealerServiceImpl implements DealerService{
	
	
	@Autowired
	private DealerDao dealerdao;

	@Override
	public Dealer addDealer(Dealer dealer){
	
		return dealerdao.save(dealer);
	}

	@Override
	public Dealer editDealer(int id){
	
		return dealerdao.findById(id).get();
	}

	@Override
	public Dealer updateDealer(Dealer dealer) {
		
		
		return dealerdao.save(dealer);
	}

	@Override
	public void deleteDealer(int id) {
	
		dealerdao.deleteById(id);
		
	}

}
