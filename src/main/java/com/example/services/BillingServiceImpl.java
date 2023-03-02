 package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Billing;
import com.example.repositories.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	private BillingRepository billingRepo;

	@Override
	public void generateInvoice(Billing billing) {
		billingRepo.save(billing);
	}

	@Override
	public List<Billing> getAllBills() {
		List<Billing> bills = billingRepo.findAll();
		return bills;
	}

	@Override
	public Billing findById(long id) {
		Optional<Billing> findById = billingRepo.findById(id);
		Billing billing = findById.get();
		return billing;
	}

}
