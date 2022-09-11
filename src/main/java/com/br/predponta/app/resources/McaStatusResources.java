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

import com.br.predponta.app.entities.McaStatus;
import com.br.predponta.app.repositories.McaStatusRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value= "/mcastatus")
@Api(value="API REST McaStatus")
@CrossOrigin(origins = "*")

public class McaStatusResources {
	
	
	
	@Autowired
	private McaStatusRepository repository;
	
	@ApiOperation(value="Busca todos McaStatus")
	@GetMapping
	public ResponseEntity<List<McaStatus>> findAll(){
		List <McaStatus> list = repository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	//@GetMapping
    //public ResponseEntity<Page<McaStatus>> findAll(Pageable pageable){

     //   Page <McaStatus> list = repository.findAllPaged(pageable);
     //   return ResponseEntity.ok().body(list);
    //    }
	
	
	@ApiOperation(value="Busca McaStatus por ID")
	@GetMapping(value = "/{mcasCodigo}")
	public ResponseEntity<McaStatus> findById(@PathVariable Integer mcasCodigo){
		McaStatus dto = repository.getOne(mcasCodigo);
			return ResponseEntity.ok().body(dto);	
	}
	
	@ApiOperation(value="Salva McaStatus")
	@PostMapping
	public ResponseEntity<McaStatus> insert(@RequestBody McaStatus dto){
		dto = repository.save(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{mcasCodigo}")
				
				.buildAndExpand(dto.getMcasCodigo()).toUri();
		
				return ResponseEntity.created(uri).body(dto);
	}
	
	
	
	
	/*@ApiOperation(value="Atualiza McaStatus")
	@PutMapping(value = "/{mcasCodigo}")
	public ResponseEntity<McaStatus> update(@PathVariable Integer mcasCodigo, @RequestBody McaStatus dto){
		dto = repository.(mcasCodigo, dto);
		return ResponseEntity.ok().body(dto);
	}*/
	
	
	
	
	
	@ApiOperation(value="Deleta McaStatus")
	@DeleteMapping(value = "/{mcasCodigo}")
	public ResponseEntity<Void> delete(@PathVariable Integer mcasCodigo){
		repository.deleteById(mcasCodigo);
		return ResponseEntity.noContent().build();
	}
	
}





