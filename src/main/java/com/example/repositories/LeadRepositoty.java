package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Lead;

public interface LeadRepositoty extends JpaRepository<Lead, Long> {

}
