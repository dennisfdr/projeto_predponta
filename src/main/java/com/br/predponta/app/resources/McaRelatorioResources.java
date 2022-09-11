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

import com.br.predponta.app.entities.McaRelatorio;
import com.br.predponta.app.repositories.McaRelatorioRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value= "/mcarelatorio")
@Api(value="API REST McaRelatorio")
@CrossOrigin(origins = "*")

public class McaRelatorioResources {
	
	
	
	@Autowired
	private McaRelatorioRepository repository;
	
	@ApiOperation(value="Busca todos McaRelatorio")
	@GetMapping
	public ResponseEntity<List<McaRelatorio>> findAll(){
		List <McaRelatorio> list = repository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	//@GetMapping
    //public ResponseEntity<Page<McaRelatorio>> findAll(Pageable pageable){

     //   Page <McaRelatorio> list = repository.findAllPaged(pageable);
     //   return ResponseEntity.ok().body(list);
    //    }
	
	
	@ApiOperation(value="Busca McaRelatorio por ID")
	@GetMapping(value = "/{mcrCodigo}")
	public ResponseEntity<McaRelatorio> findById(@PathVariable Integer mcrCodigo){
		McaRelatorio dto = repository.getOne(mcrCodigo);
			return ResponseEntity.ok().body(dto);	
	}
	
	@ApiOperation(value="Salva McaRelatorio")
	@PostMapping
	public ResponseEntity<McaRelatorio> insert(@RequestBody McaRelatorio dto){
		dto = repository.save(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{mcrCodigo}")
				
				.buildAndExpand(dto.getMcrCodigo()).toUri();
		
				return ResponseEntity.created(uri).body(dto);
	}
	
	
	
	
	/*@ApiOperation(value="Atualiza McaRelatorio")
	@PutMapping(value = "/{mcrCodigo}")
	public ResponseEntity<McaRelatorio> update(@PathVariable Integer mcrCodigo, @RequestBody McaRelatorio dto){
		dto = repository.(mcrCodigo, dto);
		return ResponseEntity.ok().body(dto);
	}*/
	
	
	
	
	
	@ApiOperation(value="Deleta McaRelatorio")
	@DeleteMapping(value = "/{mcrCodigo}")
	public ResponseEntity<Void> delete(@PathVariable Integer mcrCodigo){
		repository.deleteById(mcrCodigo);
		return ResponseEntity.noContent().build();
	}
	
}




