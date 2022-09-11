package com.br.predponta.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.predponta.app.entities.InspecaoAcusticaLocal;
import com.br.predponta.app.entities.RelatorioIntervencao;

@Repository
public interface RelatorioIntervencaoRepository  extends JpaRepository <RelatorioIntervencao, Integer>{

	@Query("SELECT ri FROM RelatorioIntervencao ri WHERE ri.inspecaoAcusticaLocal = ?1")
	List<RelatorioIntervencao> findByInspecaoAcusticaLocal(InspecaoAcusticaLocal inspecaoAcusticaLocal);


}
