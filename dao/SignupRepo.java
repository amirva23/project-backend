package com.productData.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productData.model.SignupModel;

public interface SignupRepo extends JpaRepository<SignupModel,Integer>{

}
