package com.br.predponta.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.predponta.app.entities.InspecaoAcusticaLocal;
import com.br.predponta.app.entities.Medicao;

@Repository
public interface InspecaoAcusticaLocalRepository  extends JpaRepository <InspecaoAcusticaLocal, Integer>{

	@Query("SELECT ial FROM InspecaoAcusticaLocal ial WHERE ial.medicao = ?1")
	List<InspecaoAcusticaLocal> findByMedicao(Medicao medicao);
	
	
}
