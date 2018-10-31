/**
 * 
 */
package com.vipin.microservices.invoice.repository;

import org.springframework.data.repository.CrudRepository;

import com.vipin.microservices.invoice.models.ModeOfPay;

/**
 * @author vipin
 *
 */
public interface ModeOfPayRepository extends CrudRepository<ModeOfPay, Long> {

}
