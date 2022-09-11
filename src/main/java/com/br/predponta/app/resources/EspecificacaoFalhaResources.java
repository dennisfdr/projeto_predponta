package com.br.predponta.app.resources;




import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import com.br.predponta.app.entities.Categoria;
import com.br.predponta.app.entities.EspecificacaoFalha;
import com.br.predponta.app.repositories.EspecificacaoFalhaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value= "/especificacaofalha")
@Api(value="API REST EspecificacaoFalha")
@CrossOrigin(origins = "*")

public class EspecificacaoFalhaResources {
	
	
	
	@Autowired
	private EspecificacaoFalhaRepository repository;
	
	@ApiOperation(value="Busca todos Status Componente Vibracao")
	@GetMapping
	public ResponseEntity<List<EspecificacaoFalha>> findAll(){
		List <EspecificacaoFalha> list = repository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	//@GetMapping
    //public ResponseEntity<Page<EspecificacaoFalha>> findAll(Pageable pageable){

     //   Page <EspecificacaoFalha> list = repository.findAllPaged(pageable);
     //   return ResponseEntity.ok().body(list);
    //    }
	
	
	@ApiOperation(value="Busca EspecificacaoFalha por ID")
	@GetMapping(value = "/{efaCodigo}")
	public ResponseEntity<EspecificacaoFalha> findById(@PathVariable Integer efaCodigo){
		EspecificacaoFalha dto = repository.getOne(efaCodigo);
			return ResponseEntity.ok().body(dto);	
	}
	
	@ApiOperation(value="Salva EspecificacaoFalha")
	@PostMapping
	public ResponseEntity<EspecificacaoFalha> insert(@RequestBody EspecificacaoFalha dto){
		dto = repository.save(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{efaCodigo}")
				
				.buildAndExpand(dto.getEfaCodigo()).toUri();
		
				return ResponseEntity.created(uri).body(dto);
	}
	
	
	
	
	/*@ApiOperation(value="Atualiza EspecificacaoFalha")
	@PutMapping(value = "/{efaCodigo}")
	public ResponseEntity<EspecificacaoFalha> update(@PathVariable Integer efaCodigo, @RequestBody EspecificacaoFalha dto){
		dto = repository.(efaCodigo, dto);
		return ResponseEntity.ok().body(dto);
	}*/
	
	@ApiOperation(value="Atualiza Categoria")
	@PutMapping(value = "/{efaCodigo}")
    public ResponseEntity<EspecificacaoFalha> update(@PathVariable(value = "efaCodigo") Integer efaCodigo, @Valid @RequestBody EspecificacaoFalha newEspecificacaoFalha)
    {
        Optional<EspecificacaoFalha> oldEspecificacaoFalha = repository.findById(efaCodigo);
        if(oldEspecificacaoFalha.isPresent()){
        	EspecificacaoFalha especificacaoFalha = oldEspecificacaoFalha.get();
        	especificacaoFalha.setCondicoesAmbiente(newEspecificacaoFalha.getCondicoesAmbiente());
        	especificacaoFalha.setEfaExcessoTemperatura(newEspecificacaoFalha.getEfaExcessoTemperatura());
        	especificacaoFalha.setEfaPontoTermograma(newEspecificacaoFalha.getEfaPontoTermograma());
        	especificacaoFalha.setEfaPrazoLimite(newEspecificacaoFalha.getEfaPrazoLimite());
        	especificacaoFalha.setEfaTemperaturaAceitavel(newEspecificacaoFalha.getEfaTemperaturaAceitavel());
        	especificacaoFalha.setEfaTemperaturaFalha(newEspecificacaoFalha.getEfaTemperaturaFalha());
            repository.save(especificacaoFalha);
            return new ResponseEntity<EspecificacaoFalha>(especificacaoFalha, HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
	
	
	
	
	
	@ApiOperation(value="Deleta EspecificacaoFalha")
	@DeleteMapping(value = "/{efaCodigo}")
	public ResponseEntity<Void> delete(@PathVariable Integer efaCodigo){
		repository.deleteById(efaCodigo);
		return ResponseEntity.noContent().build();
	}
	
}




