package com.productData.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productData.model.CustomerModel;


public interface CustomerRepo extends JpaRepository<CustomerModel,Integer> {

}
