package com.br.predponta.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.predponta.app.entities.Maquina;
import com.br.predponta.app.entities.Setor;

@Repository
public interface MaquinaRepository  extends JpaRepository <Maquina, Integer>{
	
	@Query("SELECT m FROM Maquina m WHERE m.setor = ?1")
	List<Maquina> findBySetor(Setor setor);
	
	

}
