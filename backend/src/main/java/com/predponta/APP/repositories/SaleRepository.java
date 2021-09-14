package com.predponta.APP.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.predponta.APP.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
}
