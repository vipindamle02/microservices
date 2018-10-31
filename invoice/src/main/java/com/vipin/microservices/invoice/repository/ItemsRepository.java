/**
 * 
 */
package com.vipin.microservices.invoice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vipin.microservices.invoice.models.Invoice;
import com.vipin.microservices.invoice.models.Items;

/**
 * @author vipin
 *
 */
public interface ItemsRepository extends CrudRepository<Items, Long> {

	List<Items> findByInvoiceId(Invoice invoiceId);
}
