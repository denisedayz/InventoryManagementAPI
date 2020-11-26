package com.promineotech.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.inventoryManagement.entity.Product;

public interface ProductRepository extends CrudRepository <Product, Long>{

}
