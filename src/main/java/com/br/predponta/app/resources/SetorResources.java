package com.br.predponta.app.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.br.predponta.app.dto.SetorDTO;
import com.br.predponta.app.entities.EmpresaEmail;
import com.br.predponta.app.entities.Setor;
import com.br.predponta.app.repositories.EmpresaEmailRepository;
import com.br.predponta.app.repositories.SetorRepository;
import com.br.predponta.app.servicies.SetorService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value= "/setors")
@Api(value="API REST Setors")
@CrossOrigin(origins = "*")

public class SetorResources {
	
	@Autowired
	private SetorService service;
	
	@Autowired
	private SetorRepository repository;
	
	@ApiOperation(value="Busca todos os Setores")
	@GetMapping
	public ResponseEntity<List<SetorDTO>> findAll(){
		List <SetorDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	//@GetMapping
    //public ResponseEntity<Page<SetorDTO>> findAll(Pageable pageable){

     //   Page <SetorDTO> list = service.findAllPaged(pageable);
     //   return ResponseEntity.ok().body(list);
    //    }
	
	
	@ApiOperation(value="Busca Setor por ID")
	@GetMapping(value = "/{setCodigo}")
	public ResponseEntity<SetorDTO> findById(@PathVariable Integer setCodigo){
		SetorDTO dto = service.findById(setCodigo);
			return ResponseEntity.ok().body(dto);
			
	}
	
	/*@ApiOperation(value="Salva Setor")
	@PostMapping
	public ResponseEntity<SetorDTO> insert(@RequestBody SetorDTO dto){
		dto = service.insert (dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{setCodigo}")
				
				.buildAndExpand(dto.getSetCodigo()).toUri();
		
				return ResponseEntity.created(uri).body(dto);
	}*/
	
	/*Alterado por Rogério Ranthum*/
	@ApiOperation(value="Salva empresas setor")
	@PostMapping
	public void saveAll(@RequestBody List<Setor> dto){
		
		repository.saveAll(dto);		
				
	}
	
	@ApiOperation(value="Atualiza Setor")
	@PutMapping(value = "/{setCodigo}")
	public ResponseEntity<SetorDTO> update(@PathVariable Integer setCodigo,@RequestBody SetorDTO dto){
		dto = service.update (setCodigo, dto);
		return ResponseEntity.ok().body(dto);
	}			
	
	@ApiOperation(value="Deleta Setor")
	@DeleteMapping(value = "/{setCodigo}")
	public ResponseEntity<Void> delete(@PathVariable Integer setCodigo){
		service.delete (setCodigo);
		return ResponseEntity.noContent().build();
	}
	
}
