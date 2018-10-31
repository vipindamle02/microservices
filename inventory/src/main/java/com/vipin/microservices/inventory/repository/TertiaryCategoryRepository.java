/**
 * 
 */
package com.vipin.microservices.inventory.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vipin.microservices.inventory.models.SecondaryCategory;
import com.vipin.microservices.inventory.models.TertiaryCategory;

/**
 * @author vipin
 *
 */
public interface TertiaryCategoryRepository extends CrudRepository<TertiaryCategory, Long> {

	public List<TertiaryCategory> findBySecondaryCategory(SecondaryCategory secondaryCategory);
	
}