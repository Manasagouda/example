 package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Contact;
import com.example.repositories.ContactRepository;
@Service
public class ContactServiceImpl implements ContactServices {

	@Autowired
	private ContactRepository contactRepo;
	@Override
	public void saveContactInfo(Contact contact) {
		contactRepo.save(contact);
	}
	@Override
	public List<Contact> getAllContacts() {
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}
	@Override
	public Contact findContactById(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}

}
