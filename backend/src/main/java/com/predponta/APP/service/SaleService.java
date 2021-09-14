package com.predponta.APP.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.predponta.APP.dto.SaleDto;
import com.predponta.APP.entities.Sale;
import com.predponta.APP.repositories.SaleRepository;
import com.predponta.APP.repositories.SellerRepository;

@Service
public class SaleService {
	
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepositotry;
	
	@Transactional(readOnly= true)
	public Page<SaleDto> findAll(Pageable pageable) {
		sellerRepositotry.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDto(x));
	}

}
