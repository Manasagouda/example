package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
