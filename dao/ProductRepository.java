package com.productData.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.productData.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    @Modifying
    @Query(value="select z from Product  z where  z.name= ?1")
 	public List<Product> getProductData(String name);
    @Query(value="select y from Product  y where  y.name=:name")
 	public List<Product> get(String name );
    @Query(value="delete from Product  p where  p.name= ?1")
    public int deleteProductByName(String name);
	}

