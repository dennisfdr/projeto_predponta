package com.br.predponta.app.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.predponta.app.entities.Medicao;
import com.br.predponta.app.entities.MedicaoAnaliseVibracao;

@Repository
public interface MedicaoAnaliseVibracaoRepository  extends JpaRepository <MedicaoAnaliseVibracao, Integer>{

	@Query("SELECT mav FROM MedicaoAnaliseVibracao mav WHERE mav.medicao = ?1")
	List<MedicaoAnaliseVibracao> findByMedicao(Medicao medicao);


}
