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

import com.br.predponta.app.entities.McaStatusRelatorio;
import com.br.predponta.app.repositories.McaStatusRelatorioRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value= "/mcastatusrelatorio")
@Api(value="API REST McaStatusRElatorio")
@CrossOrigin(origins = "*")

public class McaStatusRelatorioResources {
	
	
	
	@Autowired
	private McaStatusRelatorioRepository repository;
	
	@ApiOperation(value="Busca todos McaStatusRelatorio")
	@GetMapping
	public ResponseEntity<List<McaStatusRelatorio>> findAll(){
		List <McaStatusRelatorio> list = repository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	//@GetMapping
    //public ResponseEntity<Page<McaStatusRelatorio>> findAll(Pageable pageable){

     //   Page <McaStatusRelatorio> list = repository.findAllPaged(pageable);
     //   return ResponseEntity.ok().body(list);
    //    }
	
	
	@ApiOperation(value="Busca McaStatusRelatorio por ID")
	@GetMapping(value = "/{mcasrCodigo}")
	public ResponseEntity<McaStatusRelatorio> findById(@PathVariable Integer mcasrCodigo){
		McaStatusRelatorio dto = repository.getOne(mcasrCodigo);
			return ResponseEntity.ok().body(dto);	
	}
	
	@ApiOperation(value="Salva McaStatusRelatorio")
	@PostMapping
	public ResponseEntity<McaStatusRelatorio> insert(@RequestBody McaStatusRelatorio dto){
		dto = repository.save(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{mcasrCodigo}")
				
				.buildAndExpand(dto.getMcasrCodigo()).toUri();
		
				return ResponseEntity.created(uri).body(dto);
	}
	
	
	
	
	/*@ApiOperation(value="Atualiza McaStatusRelatorio")
	@PutMapping(value = "/{mcasrCodigo}")
	public ResponseEntity<McaStatusRelatorio> update(@PathVariable Integer mcasrCodigo, @RequestBody McaStatusRelatorio dto){
		dto = repository.(mcasrCodigo, dto);
		return ResponseEntity.ok().body(dto);
	}*/
	
	
	
	
	
	@ApiOperation(value="Deleta McaStatusRelatorio")
	@DeleteMapping(value = "/{mcasrCodigo}")
	public ResponseEntity<Void> delete(@PathVariable Integer mcasrCodigo){
		repository.deleteById(mcasrCodigo);
		return ResponseEntity.noContent().build();
	}
	
}






