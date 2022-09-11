package com.br.predponta.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.predponta.app.entities.ComponentePeca;
import com.br.predponta.app.entities.SubComponente;

@Repository
public interface SubComponenteRepository  extends JpaRepository <SubComponente, Integer>{

	@Query("SELECT sp FROM SubComponente sp WHERE sp.componentePeca = ?1")
	List<SubComponente> findByComponentePeca(ComponentePeca componentePeca);

}
