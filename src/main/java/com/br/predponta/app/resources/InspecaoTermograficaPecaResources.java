package com.br.predponta.app.resources;



import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;

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

import com.br.predponta.app.entities.InspecaoTermografica;
import com.br.predponta.app.entities.InspecaoTermograficaPeca;
import com.br.predponta.app.repositories.InspecaoTermograficaPecaRepository;
import com.br.predponta.app.repositories.InspecaoTermograficaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value= "/inspecaotermograficapeca")
@Api(value="API REST Inspeção Termográica Peca")
@CrossOrigin(origins = "*")

public class InspecaoTermograficaPecaResources {
	
	
	
	@Autowired
	private InspecaoTermograficaPecaRepository repository;
	
	
	
	@ApiOperation(value="Busca todos Inspecao Termográrica Peça")
	@GetMapping
	public ResponseEntity<List<InspecaoTermograficaPeca>> findAll(){
		List <InspecaoTermograficaPeca> list = repository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	//@GetMapping
    //public ResponseEntity<Page<InspecaoTermograficaPeca>> findAll(Pageable pageable){

     //   Page <InspecaoTermograficaPeca> list = repository.findAllPaged(pageable);
     //   return ResponseEntity.ok().body(list);
    //    }
	
	
	@ApiOperation(value="Busca InspecaoTermograficaPeca por ID")
	@GetMapping(value = "/{itpCodigo}")
	public ResponseEntity<InspecaoTermograficaPeca> findById(@PathVariable Integer itpCodigo){
		InspecaoTermograficaPeca dto = repository.getOne(itpCodigo);
			return ResponseEntity.ok().body(dto);	
	}
	
	
	
	@ApiOperation(value="Busca todos as Inspecao Termografica Peca por Inspecao Termografica")
	@GetMapping(value = "/inspecaotermografica/{iteCodigo}")
	public ResponseEntity<List<InspecaoTermograficaPeca>> findbyInspecaoTermografica(@PathVariable Integer iteCodigo){
		
		List <InspecaoTermograficaPeca> list = repository.findByInspecaoTermografica(iteCodigo);
		return ResponseEntity.ok().body(list);
	}
	
	
	
	
	@ApiOperation(value="Salva InspecaoTermograficaPeca")
	@PostMapping
	public ResponseEntity<InspecaoTermograficaPeca> insert(@RequestBody InspecaoTermograficaPeca dto){
		dto = repository.save(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{itpCodigo}")
				
				.buildAndExpand(dto.getItpCodigo()).toUri();
		
				return ResponseEntity.created(uri).body(dto);
	}
	
	
	
	
	/*@ApiOperation(value="Atualiza InspecaoTermograficaPeca")
	@PutMapping(value = "/{itpCodigo}")
	public ResponseEntity<InspecaoTermograficaPeca> update(@PathVariable Integer itpCodigo, @RequestBody InspecaoTermograficaPeca dto){
		dto = repository.(itpCodigo, dto);
		return ResponseEntity.ok().body(dto);
	}*/
	
	
	
	
	
	@ApiOperation(value="Deleta InspecaoTermograficaPeca")
	@DeleteMapping(value = "/{itpCodigo}")
	public ResponseEntity<Void> delete(@PathVariable Integer itpCodigo){
		repository.deleteById(itpCodigo);
		return ResponseEntity.noContent().build();
	}
	
}




