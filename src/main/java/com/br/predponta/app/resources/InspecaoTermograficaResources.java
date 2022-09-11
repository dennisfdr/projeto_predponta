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

import com.br.predponta.app.entities.InspecaoAcusticaLocal;
import com.br.predponta.app.entities.InspecaoTermografica;
import com.br.predponta.app.entities.Medicao;
import com.br.predponta.app.repositories.InspecaoTermograficaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value= "/inspecaotermografica")
@Api(value="API REST Medicao Análise Vibracao")
@CrossOrigin(origins = "*")

public class InspecaoTermograficaResources {
	
	
	
	@Autowired
	private InspecaoTermograficaRepository repository;
	
	@ApiOperation(value="Busca todos Status Componente Vibracao")
	@GetMapping
	public ResponseEntity<List<InspecaoTermografica>> findAll(){
		List <InspecaoTermografica> list = repository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@ApiOperation(value="Busca todos as Inspecao Termografica Local por Medicao")
	@GetMapping(value = "/medicao/{medicao}")
	public ResponseEntity<List<InspecaoTermografica>> findbyMedicao(Medicao medicao){
		List <InspecaoTermografica> list = repository.findByMedicao(medicao);
		return ResponseEntity.ok().body(list);
	}
	
	
	
	//@GetMapping
    //public ResponseEntity<Page<InspecaoTermografica>> findAll(Pageable pageable){

     //   Page <InspecaoTermografica> list = repository.findAllPaged(pageable);
     //   return ResponseEntity.ok().body(list);
    //    }
	
	
	@ApiOperation(value="Busca InspecaoTermografica por ID")
	@GetMapping(value = "/{iteCodigo}")
	public ResponseEntity<InspecaoTermografica> findById(@PathVariable Integer iteCodigo){
		InspecaoTermografica dto = repository.getOne(iteCodigo);
			return ResponseEntity.ok().body(dto);	
	}
	
	@ApiOperation(value="Salva InspecaoTermografica")
	@PostMapping
	public ResponseEntity<InspecaoTermografica> insert(@RequestBody InspecaoTermografica dto){
		dto = repository.saveAndFlush(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{iteCodigo}")
				
				.buildAndExpand(dto.getIteCodigo()).toUri();
		
				return ResponseEntity.created(uri).body(dto);
	}
	
	
	
	
	/*@ApiOperation(value="Atualiza InspecaoTermografica")
	@PutMapping(value = "/{iteCodigo}")
	public ResponseEntity<InspecaoTermografica> update(@PathVariable Integer iteCodigo, @RequestBody InspecaoTermografica dto){
		dto = repository.(iteCodigo, dto);
		return ResponseEntity.ok().body(dto);
	}*/
	
	
	
	
	
	@ApiOperation(value="Deleta InspecaoTermografica")
	@DeleteMapping(value = "/{iteCodigo}")
	public ResponseEntity<Void> delete(@PathVariable Integer iteCodigo){
		repository.deleteById(iteCodigo);
		return ResponseEntity.noContent().build();
	}
	
}



