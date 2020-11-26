package com.promineotech.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.inventoryManagement.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
