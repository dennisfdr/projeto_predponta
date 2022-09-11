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

import com.br.predponta.app.entities.HistoricoComponenteVibracao;
import com.br.predponta.app.repositories.HistoricoComponenteVibracaoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value= "/historicocomponentevibracao")
@Api(value="API REST Medicao Análise Vibracao")
@CrossOrigin(origins = "*")

public class HistoricoComponenteVibracaoResources {
	
	
	
	@Autowired
	private HistoricoComponenteVibracaoRepository repository;
	
	@ApiOperation(value="Busca todos  HistoricoComponenteVibraca")
	@GetMapping
	public ResponseEntity<List<HistoricoComponenteVibracao>> findAll(){
		List <HistoricoComponenteVibracao> list = repository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	//@GetMapping
    //public ResponseEntity<Page<HistoricoComponenteVibracao>> findAll(Pageable pageable){

     //   Page <HistoricoComponenteVibracao> list = repository.findAllPaged(pageable);
     //   return ResponseEntity.ok().body(list);
    //    }
	
	
	@ApiOperation(value="Busca  HistoricoComponenteVibraca por ID")
	@GetMapping(value = "/{hcvCodigo}")
	public ResponseEntity<HistoricoComponenteVibracao> findById(@PathVariable Integer hcvCodigo){
		HistoricoComponenteVibracao dto = repository.getOne(hcvCodigo);
			return ResponseEntity.ok().body(dto);	
	}
	
	@ApiOperation(value="Salva  HistoricoComponenteVibraca")
	@PostMapping
	public ResponseEntity<HistoricoComponenteVibracao> insert(@RequestBody HistoricoComponenteVibracao dto){
		dto = repository.save(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{hcvCodigo}")
				
				.buildAndExpand(dto.getHcvCodigo()).toUri();
		
				return ResponseEntity.created(uri).body(dto);
	}
	
	
	
	
	/*@ApiOperation(value="Atualiza Status Componente Vibracao Vibracao")
	@PutMapping(value = "/{hcvCodigo}")
	public ResponseEntity<HistoricoComponenteVibracao> update(@PathVariable Integer hcvCodigo, @RequestBody HistoricoComponenteVibracao dto){
		dto = repository.(hcvCodigo, dto);
		return ResponseEntity.ok().body(dto);
	}*/
	
	
	
	
	
	@ApiOperation(value="Deleta  HistoricoComponenteVibraca")
	@DeleteMapping(value = "/{hcvCodigo}")
	public ResponseEntity<Void> delete(@PathVariable Integer hcvCodigo){
		repository.deleteById(hcvCodigo);
		return ResponseEntity.noContent().build();
	}
	
}



