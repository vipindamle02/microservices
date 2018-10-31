/**
 * 
 */
package com.vipin.microservices.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.hitesh.microservices.inventory.models.PrimaryCategory;

/**
 * @author vipin
 *
 */
public interface PrimaryCategoryRepository extends CrudRepository<PrimaryCategory, Long> {

}
