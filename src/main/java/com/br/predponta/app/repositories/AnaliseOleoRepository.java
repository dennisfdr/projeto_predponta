package com.br.predponta.app.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.br.predponta.app.entities.AnaliseOleo;
import com.br.predponta.app.entities.Medicao;

@Repository
public interface AnaliseOleoRepository  extends JpaRepository <AnaliseOleo, Integer>{
	
	
	@Query("SELECT ano FROM AnaliseOleo ano WHERE ano.medicao = ?1")
	List<AnaliseOleo> findByMedicao(Medicao medicao);

}
