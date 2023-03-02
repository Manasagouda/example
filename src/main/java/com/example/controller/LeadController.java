package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entities.Contact;
import com.example.entities.Lead;
import com.example.services.ContactServices;
import com.example.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactServices contactService;

	@RequestMapping("/create")
	public String viewCreateLeadPage() {
		return "create_lead";
	}
	
	@RequestMapping("/save")
	public String saveOneLead(@ModelAttribute("s")Lead lead, Model model) {
		leadService.saveLeadInfo(lead);
		model.addAttribute("lead", lead);
		model.addAttribute("msg", "lead is saved");
		return "lead_Info";
	}
	
	@RequestMapping("/listAll")
	public String readAllLeads(Model model) {
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
		return "listLeads";
	}
	@RequestMapping("/leadinfo")
	public String leadInfo(@RequestParam("id")long id,Model model) {
	Lead lead = leadService.findLeadById(id);
	model.addAttribute("lead", lead);
	return "lead_Info";
	}
	
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id")long id,Model model) {
		Lead lead = leadService.findLeadById(id);
		Contact contact=new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		contactService.saveContactInfo(contact);
		
		leadService.deleteById(id);
		
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "contactList";
				
	}
	
}
