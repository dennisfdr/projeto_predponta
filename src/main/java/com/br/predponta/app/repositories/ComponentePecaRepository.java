package com.br.predponta.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.predponta.app.entities.Componente;
import com.br.predponta.app.entities.ComponentePeca;

@Repository
public interface ComponentePecaRepository  extends JpaRepository <ComponentePeca, Integer>{

	@Query("SELECT cp FROM ComponentePeca cp WHERE cp.componente = ?1")
	List<ComponentePeca> findByComponente(Componente componente);


}
