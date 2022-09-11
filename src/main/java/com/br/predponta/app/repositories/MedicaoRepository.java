package com.br.predponta.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.predponta.app.entities.Componente;
import com.br.predponta.app.entities.Medicao;

@Repository
public interface MedicaoRepository  extends JpaRepository <Medicao, Integer>{
	
	@Query("SELECT md FROM Medicao md WHERE md.componente = ?1")
	List<Medicao> findByComponente(Componente componente);

	

}
