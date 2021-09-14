package com.predponta.APP.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.predponta.APP.dto.SaleSucessDto;
import com.predponta.APP.dto.SaleSumDto;
import com.predponta.APP.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query("SELECT new com.predponta.APP.dto.SaleSumDto(obj.seller, SUM (obj.amount)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List <SaleSumDto> amountGroupeBySeller();
	
	@Query("SELECT new com.predponta.APP.dto.SaleSucessDto(obj.seller, SUM (obj.visited),SUM (obj.deals)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List <SaleSucessDto> sucessGroupeBySeller();
}
