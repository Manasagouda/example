package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entities.Contact;
import com.example.services.ContactServices;

@Controller
public class ContactController {
	
	@Autowired
	private ContactServices contactService;
	
	@RequestMapping("/contactList")
	public String readAllContacts(Model model) {
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "contactList";
		
	}

}
