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
import com.br.predponta.app.entities.Medicao;
import com.br.predponta.app.entities.MedicaoAnaliseVibracao;
import com.br.predponta.app.repositories.MedicaoAnaliseVibracaoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value= "/medicaoanalisevibracao")
@Api(value="API REST Medicao Análise Vibracao")
@CrossOrigin(origins = "*")

public class MedicaoAnaliseVibracaoResources {
	
	
	
	@Autowired
	private MedicaoAnaliseVibracaoRepository repository;
	
	@ApiOperation(value="Busca todos Medicao Análise Vibracao")
	@GetMapping
	public ResponseEntity<List<MedicaoAnaliseVibracao>> findAll(){
		List <MedicaoAnaliseVibracao> list = repository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	//@GetMapping
    //public ResponseEntity<Page<MedicaoAnaliseVibracao>> findAll(Pageable pageable){

     //   Page <MedicaoAnaliseVibracao> list = repository.findAllPaged(pageable);
     //   return ResponseEntity.ok().body(list);
    //    }
	
	
	@ApiOperation(value="Busca Medicao Análise Vibracao por ID")
	@GetMapping(value = "/{mavCodigo}")
	public ResponseEntity<MedicaoAnaliseVibracao> findById(@PathVariable Integer mavCodigo){
		MedicaoAnaliseVibracao dto = repository.getOne(mavCodigo);
			return ResponseEntity.ok().body(dto);	
	}
	
	
	@ApiOperation(value="Busca todos as MedicaAnaliseVibracao por Medicao")
	@GetMapping(value = "/medicao/{medicao}")
	public ResponseEntity<List<MedicaoAnaliseVibracao>> findbyMedicao(Medicao medicao){
		List <MedicaoAnaliseVibracao> list = repository.findByMedicao(medicao);
		return ResponseEntity.ok().body(list);
	}
	
	@ApiOperation(value="Salva Medicao Análise Vibracao")
	@PostMapping
	public ResponseEntity<MedicaoAnaliseVibracao> insert(@RequestBody MedicaoAnaliseVibracao dto){
		dto = repository.save(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{mavCodigo}")
				
				.buildAndExpand(dto.getMavCodigo()).toUri();
		
				return ResponseEntity.created(uri).body(dto);
	}
	
	
	
	
	/*@ApiOperation(value="Atualiza Medicao Análise Vibracao")
	@PutMapping(value = "/{mavCodigo}")
	public ResponseEntity<MedicaoAnaliseVibracao> update(@PathVariable Integer mavCodigo, @RequestBody MedicaoAnaliseVibracao dto){
		dto = repository.(mavCodigo, dto);
		return ResponseEntity.ok().body(dto);
	}*/
	
	
	
	
	
	@ApiOperation(value="Deleta Medicao Análise Vibracao")
	@DeleteMapping(value = "/{mavCodigo}")
	public ResponseEntity<Void> delete(@PathVariable Integer mavCodigo){
		repository.deleteById(mavCodigo);
		return ResponseEntity.noContent().build();
	}
	
}

