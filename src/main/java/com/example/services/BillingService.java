package com.example.services;

import java.util.List;

import org.springframework.stereotype.Service;


import com.example.entities.Billing;
@Service
public interface BillingService {
	public void generateInvoice(Billing billing);

	public List<Billing> getAllBills();

	public Billing findById(long id);

}
