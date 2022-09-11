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

import com.br.predponta.app.entities.Medicao;
import com.br.predponta.app.entities.MedicaoAnaliseVibracao;
import com.br.predponta.app.entities.StatusComponenteVibracao;
import com.br.predponta.app.repositories.StatusComponenteVibracaoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value= "/statuscomponentevibracao")
@Api(value="API REST Medicao Análise Vibracao")
@CrossOrigin(origins = "*")

public class StatusComponenteVibracaoResources {
	
	
	
	@Autowired
	private StatusComponenteVibracaoRepository repository;
	
	@ApiOperation(value="Busca todos Status Componente Vibracao")
	@GetMapping
	public ResponseEntity<List<StatusComponenteVibracao>> findAll(){
		List <StatusComponenteVibracao> list = repository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	//@GetMapping
    //public ResponseEntity<Page<StatusComponenteVibracao>> findAll(Pageable pageable){

     //   Page <StatusComponenteVibracao> list = repository.findAllPaged(pageable);
     //   return ResponseEntity.ok().body(list);
    //    }
	
	
	@ApiOperation(value="Busca Status Componente Vibracao por ID")
	@GetMapping(value = "/{scvCodigo}")
	public ResponseEntity<StatusComponenteVibracao> findById(@PathVariable Integer scvCodigo){
		StatusComponenteVibracao dto = repository.getOne(scvCodigo);
			return ResponseEntity.ok().body(dto);	
	}
	
	
	@ApiOperation(value="Busca todos as MedicaAnaliseVibracao por Medicao")
	@GetMapping(value = "/medicaoAnaliseVibracao/{medicaoAnaliseVibracao}")
	public ResponseEntity<List<StatusComponenteVibracao>> findbymedicaoAnaliseVibracao(MedicaoAnaliseVibracao medicaoAnaliseVibracao){
		List <StatusComponenteVibracao> list = repository.findBymedicaoAnaliseVibracao(medicaoAnaliseVibracao);
		return ResponseEntity.ok().body(list);
	}
	
	@ApiOperation(value="Salva Status Componente Vibracao Vibracao")
	@PostMapping
	public ResponseEntity<StatusComponenteVibracao> insert(@RequestBody StatusComponenteVibracao dto){
		dto = repository.save(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{scvCodigo}")
				
				.buildAndExpand(dto.getScvCodigo()).toUri();
		
				return ResponseEntity.created(uri).body(dto);
	}
	
	
	
	
	/*@ApiOperation(value="Atualiza Status Componente Vibracao Vibracao")
	@PutMapping(value = "/{scvCodigo}")
	public ResponseEntity<StatusComponenteVibracao> update(@PathVariable Integer scvCodigo, @RequestBody StatusComponenteVibracao dto){
		dto = repository.(scvCodigo, dto);
		return ResponseEntity.ok().body(dto);
	}*/
	
	
	
	
	
	@ApiOperation(value="Deleta Status Componente Vibracao")
	@DeleteMapping(value = "/{scvCodigo}")
	public ResponseEntity<Void> delete(@PathVariable Integer scvCodigo){
		repository.deleteById(scvCodigo);
		return ResponseEntity.noContent().build();
	}
	
}


