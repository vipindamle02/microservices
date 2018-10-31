package com.vipin.microservices.invoice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vipin.microservices.invoice.models.Invoice;

public interface InvoiceRepository  extends CrudRepository<Invoice, Long> {

	List<Invoice> findByCustomerId(Long customerId);
	   
}



