package com.predponta.APP.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.predponta.APP.dto.SellerDto;
import com.predponta.APP.entities.Seller;
import com.predponta.APP.repositories.SellerRepository;

@Service
public class SellerService {
	
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDto> findAll() {
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDto(x)).collect(Collectors.toList());
	}

}
