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

import com.br.predponta.app.entities.StatusAnaliseOleo;
import com.br.predponta.app.repositories.StatusAnaliseOleoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value= "/statusanaliseoleo")
@Api(value="API REST StatusAnaliseOleo")
@CrossOrigin(origins = "*")

public class StatusAnaliseOleoResources {
	
	
	
	@Autowired
	private StatusAnaliseOleoRepository repository;
	
	@ApiOperation(value="Busca todos StatusAnaliseOleo")
	@GetMapping
	public ResponseEntity<List<StatusAnaliseOleo>> findAll(){
		List <StatusAnaliseOleo> list = repository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	//@GetMapping
    //public ResponseEntity<Page<StatusAnaliseOleo>> findAll(Pageable pageable){

     //   Page <StatusAnaliseOleo> list = repository.findAllPaged(pageable);
     //   return ResponseEntity.ok().body(list);
    //    }
	
	
	@ApiOperation(value="Busca StatusAnaliseOleo por ID")
	@GetMapping(value = "/{saoCodigo}")
	public ResponseEntity<StatusAnaliseOleo> findById(@PathVariable Integer saoCodigo){
		StatusAnaliseOleo dto = repository.getOne(saoCodigo);
			return ResponseEntity.ok().body(dto);	
	}
	
	@ApiOperation(value="Salva StatusAnaliseOleo")
	@PostMapping
	public ResponseEntity<StatusAnaliseOleo> insert(@RequestBody StatusAnaliseOleo dto){
		dto = repository.save(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{saoCodigo}")
				
				.buildAndExpand(dto.getSaoCodigo()).toUri();
		
				return ResponseEntity.created(uri).body(dto);
	}
	
	
	
	
	/*@ApiOperation(value="Atualiza StatusAnaliseOleo")
	@PutMapping(value = "/{saoCodigo}")
	public ResponseEntity<StatusAnaliseOleo> update(@PathVariable Integer saoCodigo, @RequestBody StatusAnaliseOleo dto){
		dto = repository.(saoCodigo, dto);
		return ResponseEntity.ok().body(dto);
	}*/
	
	
	
	
	
	@ApiOperation(value="Deleta StatusAnaliseOleo")
	@DeleteMapping(value = "/{saoCodigo}")
	public ResponseEntity<Void> delete(@PathVariable Integer saoCodigo){
		repository.deleteById(saoCodigo);
		return ResponseEntity.noContent().build();
	}
	
}




