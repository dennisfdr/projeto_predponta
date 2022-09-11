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

import com.br.predponta.app.entities.CondicoesAmbiente;
import com.br.predponta.app.entities.MedicaoAnaliseOleo;
import com.br.predponta.app.repositories.MedicaoAnaliseOleoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value= "/medicaoanaliseoleo")
@Api(value="API REST MedicaoAnaliseOleo")
@CrossOrigin(origins = "*")

public class MedicaoAnaliseOleoResources {
	
	
	
	@Autowired
	private MedicaoAnaliseOleoRepository repository;
	
	@ApiOperation(value="Busca todos MedicaoAnaliseOleo")
	@GetMapping
	public ResponseEntity<List<MedicaoAnaliseOleo>> findAll(){
		List <MedicaoAnaliseOleo> list = repository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	//@GetMapping
    //public ResponseEntity<Page<MedicaoAnaliseOleo>> findAll(Pageable pageable){

     //   Page <MedicaoAnaliseOleo> list = repository.findAllPaged(pageable);
     //   return ResponseEntity.ok().body(list);
    //    }
	
	
	@ApiOperation(value="Busca MedicaoAnaliseOleo por ID")
	@GetMapping(value = "/{maoCodigo}")
	public ResponseEntity<MedicaoAnaliseOleo> findById(@PathVariable Integer maoCodigo){
		MedicaoAnaliseOleo dto = repository.getOne(maoCodigo);
			return ResponseEntity.ok().body(dto);	
	}
	
	
	@ApiOperation(value="Busca todos as Medições Análise Oleo por Analise Oleo")
	@GetMapping(value = "/analiseoleo/{anoCodigo}")
	public ResponseEntity<List<MedicaoAnaliseOleo>> findbyAnaliseOleo(@PathVariable Integer anoCodigo){
		List <MedicaoAnaliseOleo> list = repository.findByAnaliseOleo(anoCodigo);
		return ResponseEntity.ok().body(list);
	}
	
	@ApiOperation(value="Salva MedicaoAnaliseOleo")
	@PostMapping
	public ResponseEntity<MedicaoAnaliseOleo> insert(@RequestBody MedicaoAnaliseOleo dto){
		dto = repository.save(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{maoCodigo}")
				
				.buildAndExpand(dto.getMaoCodigo()).toUri();
		
				return ResponseEntity.created(uri).body(dto);
	}
	
	
	
	
	/*@ApiOperation(value="Atualiza MedicaoAnaliseOleo")
	@PutMapping(value = "/{maoCodigo}")
	public ResponseEntity<MedicaoAnaliseOleo> update(@PathVariable Integer maoCodigo, @RequestBody MedicaoAnaliseOleo dto){
		dto = repository.(maoCodigo, dto);
		return ResponseEntity.ok().body(dto);
	}*/
	
	
	
	
	
	@ApiOperation(value="Deleta MedicaoAnaliseOleo")
	@DeleteMapping(value = "/{maoCodigo}")
	public ResponseEntity<Void> delete(@PathVariable Integer maoCodigo){
		repository.deleteById(maoCodigo);
		return ResponseEntity.noContent().build();
	}
	
}




