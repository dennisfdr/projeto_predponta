package com.br.predponta.app.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.predponta.app.entities.McaMedicao;

@Repository
public interface McaMedicaoRepository  extends JpaRepository <McaMedicao, Integer>{
	
	@Query("SELECT mem FROM McaMedicao mem WHERE mem.medicao.medCodigo = ?1")
	List<McaMedicao> findByMedicao(Integer medCodigo);

}
