package com.example.services;

import java.util.List;

import com.example.entities.Contact;

public interface ContactServices {
	public void saveContactInfo(Contact contact);

	public List<Contact> getAllContacts();

	public Contact findContactById(long id);

}
