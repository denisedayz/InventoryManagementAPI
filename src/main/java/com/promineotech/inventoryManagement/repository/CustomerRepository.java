package com.promineotech.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.inventoryManagement.entity.Customer;

public interface CustomerRepository extends CrudRepository <Customer, Long> {

}
