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
import com.br.predponta.app.entities.InspecaoTermograficaPeca;
import com.br.predponta.app.repositories.CondicoesAmbienteRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value= "/condicoesambiente")
@Api(value="API REST CondicoesAmbiente")
@CrossOrigin(origins = "*")

public class CondicoesAmbienteResources {
	
	
	
	@Autowired
	private CondicoesAmbienteRepository repository;
	
	@ApiOperation(value="Busca todos CondicoesAmbiente")
	@GetMapping
	public ResponseEntity<List<CondicoesAmbiente>> findAll(){
		List <CondicoesAmbiente> list = repository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	//@GetMapping
    //public ResponseEntity<Page<CondicoesAmbiente>> findAll(Pageable pageable){

     //   Page <CondicoesAmbiente> list = repository.findAllPaged(pageable);
     //   return ResponseEntity.ok().body(list);
    //    }
	
	
	@ApiOperation(value="Busca CondicoesAmbiente por ID")
	@GetMapping(value = "/{camCodigo}")
	public ResponseEntity<CondicoesAmbiente> findById(@PathVariable Integer camCodigo){
		CondicoesAmbiente dto = repository.getOne(camCodigo);
			return ResponseEntity.ok().body(dto);	
	}
	
	@ApiOperation(value="Busca todos as Condicoes Ambiente por Inspecao Termografica Peca")
	@GetMapping(value = "/inspecaotermograficapeca/{itpCodigo}")
	public ResponseEntity<List<CondicoesAmbiente>> findbyInspecaoTermografica(@PathVariable Integer itpCodigo){
		List <CondicoesAmbiente> list = repository.findByInspecaoTermograficaPeca(itpCodigo);
		return ResponseEntity.ok().body(list);
	}
	
	
	
	@ApiOperation(value="Salva CondicoesAmbiente")
	@PostMapping
	public ResponseEntity<CondicoesAmbiente> insert(@RequestBody CondicoesAmbiente dto){
		dto = repository.save(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{camCodigo}")
				
				.buildAndExpand(dto.getCamCodigo()).toUri();
		
				return ResponseEntity.created(uri).body(dto);
	}
	
	
	
	
	/*@ApiOperation(value="Atualiza CondicoesAmbiente")
	@PutMapping(value = "/{camCodigo}")
	public ResponseEntity<CondicoesAmbiente> update(@PathVariable Integer camCodigo, @RequestBody CondicoesAmbiente dto){
		dto = repository.(camCodigo, dto);
		return ResponseEntity.ok().body(dto);
	}*/
	
	
	
	
	
	@ApiOperation(value="Deleta CondicoesAmbiente")
	@DeleteMapping(value = "/{camCodigo}")
	public ResponseEntity<Void> delete(@PathVariable Integer camCodigo){
		repository.deleteById(camCodigo);
		return ResponseEntity.noContent().build();
	}
	
}




