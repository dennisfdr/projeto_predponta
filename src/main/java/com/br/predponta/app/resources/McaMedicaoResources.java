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
import com.br.predponta.app.entities.McaMedicao;
import com.br.predponta.app.repositories.McaMedicaoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value= "/mcamedicao")
@Api(value="API REST McaMedicao")
@CrossOrigin(origins = "*")

public class McaMedicaoResources {
	
	
	
	@Autowired
	private McaMedicaoRepository repository;
	
	@ApiOperation(value="Busca todos McaMedicao")
	@GetMapping
	public ResponseEntity<List<McaMedicao>> findAll(){
		List <McaMedicao> list = repository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	//@GetMapping
    //public ResponseEntity<Page<McaMedicao>> findAll(Pageable pageable){

     //   Page <McaMedicao> list = repository.findAllPaged(pageable);
     //   return ResponseEntity.ok().body(list);
    //    }
	
	
	@ApiOperation(value="Busca McaMedicao por ID")
	@GetMapping(value = "/{memCodigo}")
	public ResponseEntity<McaMedicao> findById(@PathVariable Integer memCodigo){
		McaMedicao dto = repository.getOne(memCodigo);
			return ResponseEntity.ok().body(dto);	
	}
	
	@ApiOperation(value="Busca todos as Mca Medicao por Medicao")
	@GetMapping(value = "/medicao/{medCodigo}")
	public ResponseEntity<List<McaMedicao>> findbyMedicao(@PathVariable Integer medCodigo){
		List <McaMedicao> list = repository.findByMedicao(medCodigo);
		return ResponseEntity.ok().body(list);
	}
	
	@ApiOperation(value="Salva McaMedicao")
	@PostMapping
	public ResponseEntity<McaMedicao> insert(@RequestBody McaMedicao dto){
		dto = repository.save(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{memCodigo}")
				
				.buildAndExpand(dto.getMemCodigo()).toUri();
		
				return ResponseEntity.created(uri).body(dto);
	}
	
	
	
	
	/*@ApiOperation(value="Atualiza McaMedicao")
	@PutMapping(value = "/{memCodigo}")
	public ResponseEntity<McaMedicao> update(@PathVariable Integer memCodigo, @RequestBody McaMedicao dto){
		dto = repository.(memCodigo, dto);
		return ResponseEntity.ok().body(dto);
	}*/
	
	
	
	
	
	@ApiOperation(value="Deleta McaMedicao")
	@DeleteMapping(value = "/{memCodigo}")
	public ResponseEntity<Void> delete(@PathVariable Integer memCodigo){
		repository.deleteById(memCodigo);
		return ResponseEntity.noContent().build();
	}
	
}




