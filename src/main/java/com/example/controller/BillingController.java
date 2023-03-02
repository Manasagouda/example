package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entities.Billing;
import com.example.entities.Contact;
import com.example.services.BillingService;
import com.example.services.ContactServices;
@Controller
public class BillingController {
	
	@Autowired
	private ContactServices contactService;
	
	@Autowired
	private BillingService billingService;
	
	
	@RequestMapping("/billingForm")
	public String viewBillingForm(@RequestParam("contactId")long id, Model model) {
		Contact contact = contactService.findContactById(id);
		model.addAttribute("contact", contact);
		return "createBill";
	}
	
	@RequestMapping("/generateBill")
	public String generateBill(@ModelAttribute("b") Billing billing, Model model) {
		billingService.generateInvoice(billing);
		model.addAttribute("billing", billing);
		model.addAttribute("msg", "bill is generated");
		return "bill_Info";
	}
	@RequestMapping("/listOfBills")
	public String readAllBills(Model model) {
		List<Billing> bill = billingService.getAllBills();
		model.addAttribute("bills", bill);
		return "bill_List";
		
	}
	
	@RequestMapping("/billinfo")
	public String billinfo(@RequestParam("id")long id, Model model) {
		Billing billing = billingService.findById(id);
		model.addAttribute("billing", billing);
		return "bill_Info";
		
	} 
}
   