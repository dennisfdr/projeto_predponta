package com.predponta.APP.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.predponta.APP.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{
	
}
