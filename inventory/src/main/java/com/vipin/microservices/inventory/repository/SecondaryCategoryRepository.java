/**
 * 
 */
package com.vipin.microservices.inventory.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vipin.microservices.inventory.models.PrimaryCategory;
import com.vipin.microservices.inventory.models.SecondaryCategory;

/**
 * @author vipin
 *
 */
public interface SecondaryCategoryRepository extends CrudRepository<SecondaryCategory, Long> {

	public List<SecondaryCategory> findByPrimaryCategory(PrimaryCategory primaryCategory);
	
}
