package com.br.predponta.app.resources;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
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

import com.br.predponta.app.dto.EquipamentoDTO;
import com.br.predponta.app.entities.Categoria;
import com.br.predponta.app.entities.Equipamento;
import com.br.predponta.app.repositories.CategoriaRepository;
import com.br.predponta.app.servicies.exceptions.ResourceNotFoundException;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value= "/categoria")
@Api(value="API REST Categoria")
@CrossOrigin(origins = "*")

public class CategoriaResources {
	
	
	
	@Autowired
	private CategoriaRepository repository;
	
	@ApiOperation(value="Busca todos Categoria")
	@GetMapping
	public ResponseEntity<List<Categoria>> findAll(){
		List <Categoria> list = repository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	//@GetMapping
    //public ResponseEntity<Page<Categoria>> findAll(Pageable pageable){

     //   Page <Categoria> list = repository.findAllPaged(pageable);
     //   return ResponseEntity.ok().body(list);
    //    }
	
	
	@ApiOperation(value="Busca Categoria por ID")
	@GetMapping(value = "/{catCodigo}")
	public ResponseEntity<Categoria> findById(@PathVariable Integer catCodigo){
		Categoria dto = repository.getOne(catCodigo);
			return ResponseEntity.ok().body(dto);	
	}
	
	@ApiOperation(value="Salva Categoria")
	@PostMapping
	public ResponseEntity<Categoria> insert(@RequestBody Categoria dto){
		dto = repository.save(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{catCodigo}")
				
				.buildAndExpand(dto.getCatCodigo()).toUri();
		
				return ResponseEntity.created(uri).body(dto);
	}
	
	
	
	
	/*@ApiOperation(value="Atualiza Categoria")
	@PutMapping(value = "/{catCodigo}")
	public ResponseEntity<Categoria> update(@PathVariable Integer catCodigo, @RequestBody Categoria dto){
		try {
			
			Categoria entity = repository.getOne(catCodigo);
			//entity.setCatCodigo(dto.getCatCodigo());
			entity.setCatDescricao(dto.getCatDescricao());
			
			entity = repository.save(entity);
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{catCodigo}")
					
					.buildAndExpand(dto.getCatCodigo()).toUri();
			
					return ResponseEntity.created(uri).body(dto);
			
			
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not Found" + catCodigo);
		}
		
	}*/
	
	@ApiOperation(value="Atualiza Categoria")
	@PutMapping(value = "/{catCodigo}")
    public ResponseEntity<Categoria> update(@PathVariable(value = "catCodigo") Integer catCodigo, @Valid @RequestBody Categoria newEntity)
    {
        Optional<Categoria> oldEntity = repository.findById(catCodigo);
        if(oldEntity.isPresent()){
            Categoria categoria = oldEntity.get();
            categoria.setCatDescricao(newEntity.getCatDescricao());
            repository.save(categoria);
            return new ResponseEntity<Categoria>(categoria, HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
	
	
	
	
	
	
	
	@ApiOperation(value="Deleta Categoria")
	@DeleteMapping(value = "/{catCodigo}")
	public ResponseEntity<Void> delete(@PathVariable Integer catCodigo){
		repository.deleteById(catCodigo);
		return ResponseEntity.noContent().build();
	}
	
}






