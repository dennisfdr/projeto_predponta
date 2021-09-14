package com.predponta.APP.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.predponta.APP.dto.SaleDto;
import com.predponta.APP.dto.SaleSucessDto;
import com.predponta.APP.dto.SaleSumDto;
import com.predponta.APP.service.SaleService;

@RestController
@RequestMapping (value= "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDto>> findAll(Pageable pageable){
		Page<SaleDto> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value="amount-by-seller")
	public ResponseEntity<List<SaleSumDto>> amountGroupeBySeller(){
		List<SaleSumDto> list = service.amountGroupeBySeller();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value="sucess-by-seller")
	public ResponseEntity<List<SaleSucessDto>> sucessGroupeBySeller(){
		List<SaleSucessDto> list = service.sucessGroupeBySeller();
		return ResponseEntity.ok(list);
	}
	
}