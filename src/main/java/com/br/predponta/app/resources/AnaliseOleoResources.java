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

import com.br.predponta.app.entities.AnaliseOleo;
import com.br.predponta.app.entities.Medicao;
import com.br.predponta.app.repositories.AnaliseOleoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value= "/analiseoleo")
@Api(value="API REST  AnaliseOleo")
//
//@CrossOrigin(origins = {"http://localhost:3000"})


public class AnaliseOleoResources {
	
	
	
	@Autowired
	private AnaliseOleoRepository repository;
	
	@ApiOperation(value="Busca todos Status  AnaliseOleo")
	@GetMapping
	public ResponseEntity<List<AnaliseOleo>> findAll(){
		List <AnaliseOleo> list = repository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	//@GetMapping
    //public ResponseEntity<Page<AnaliseOleo>> findAll(Pageable pageable){

     //   Page <AnaliseOleo> list = repository.findAllPaged(pageable);
     //   return ResponseEntity.ok().body(list);
    //    }
	
	
	@ApiOperation(value="Busca AnaliseOleo por ID")
	@GetMapping(value = "/{anoCodigo}")
	public ResponseEntity<AnaliseOleo> findById(@PathVariable Integer anoCodigo){
		AnaliseOleo dto = repository.getOne(anoCodigo);
			return ResponseEntity.ok().body(dto);	
	}
	
	
	@ApiOperation(value="Busca todos as Análise de Óleo por Medicao")
	@GetMapping(value = "/medicao/{medicao}")
	public ResponseEntity<List<AnaliseOleo>> findbyMedicao(Medicao medicao){
		List <AnaliseOleo> list = repository.findByMedicao(medicao);
		return ResponseEntity.ok().body(list);
	}
	
	
	@ApiOperation(value="Salva AnaliseOleo")
	@PostMapping
	public ResponseEntity<AnaliseOleo> insert(@RequestBody AnaliseOleo dto){
		
		dto = repository.saveAndFlush(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{anoCodigo}")
				
				.buildAndExpand(dto.getAnoCodigo()).toUri();
		
				return ResponseEntity.created(uri).body(dto);
	}
	
	
	
	
	/*@ApiOperation(value="Atualiza AnaliseOleo")
	@PutMapping(value = "/{anoCodigo}")
	public ResponseEntity<AnaliseOleo> update(@PathVariable Integer anoCodigo, @RequestBody AnaliseOleo dto){
		dto = repository.(anoCodigo, dto);
		return ResponseEntity.ok().body(dto);
	}*/
	
	
	
	
	
	@ApiOperation(value="Deleta AnaliseOleo")
	@DeleteMapping(value = "/{anoCodigo}")
	public ResponseEntity<Void> delete(@PathVariable Integer anoCodigo){
		repository.deleteById(anoCodigo);
		return ResponseEntity.noContent().build();
	}
	
}




