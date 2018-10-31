package com.vipin.microservices.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.vipin.microservices.inventory.models.Inventory;

public interface InventoryRepository  extends CrudRepository<Inventory, Long> {
	   
}



