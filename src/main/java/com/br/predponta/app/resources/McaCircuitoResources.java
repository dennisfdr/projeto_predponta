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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.br.predponta.app.entities.McaCircuito;
import com.br.predponta.app.repositories.McaCircuitoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value= "/mcacircuito")
@Api(value="API REST McaCircuito")
@CrossOrigin(origins = "*")

public class McaCircuitoResources {
	
	
	
	@Autowired
	private McaCircuitoRepository repository;
	
	@ApiOperation(value="Busca todos McaCircuito")
	@GetMapping
	public ResponseEntity<List<McaCircuito>> findAll(){
		List <McaCircuito> list = repository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	//@GetMapping
    //public ResponseEntity<Page<McaCircuito>> findAll(Pageable pageable){

     //   Page <McaCircuito> list = repository.findAllPaged(pageable);
     //   return ResponseEntity.ok().body(list);
    //    }
	
	
	@ApiOperation(value="Busca McaCircuito por ID")
	@GetMapping(value = "/{mccCodigo}")
	public ResponseEntity<McaCircuito> findById(@PathVariable Integer mccCodigo){
		McaCircuito dto = repository.getOne(mccCodigo);
			return ResponseEntity.ok().body(dto);	
	}
	
	@ApiOperation(value="Salva McaCircuito")
	@PostMapping
	public ResponseEntity<McaCircuito> insert(@RequestBody McaCircuito dto){
		dto = repository.save(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{mccCodigo}")
				
				.buildAndExpand(dto.getMccCodigo()).toUri();
		
				return ResponseEntity.created(uri).body(dto);
	}
	
	
	
	
	/*@ApiOperation(value="Atualiza McaCircuito")
	@PutMapping(value = "/{mccCodigo}")
	public ResponseEntity<McaCircuito> update(@PathVariable Integer mccCodigo, @RequestBody McaCircuito dto){
		dto = repository.(mccCodigo, dto);
		return ResponseEntity.ok().body(dto);
	}*/
	
	
	
	
	
	@ApiOperation(value="Deleta McaCircuito")
	@DeleteMapping(value = "/{mccCodigo}")
	public ResponseEntity<Void> delete(@PathVariable Integer mccCodigo){
		repository.deleteById(mccCodigo);
		return ResponseEntity.noContent().build();
	}
	
}





