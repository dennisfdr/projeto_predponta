package com.br.predponta.app.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.predponta.app.entities.MedicaoAnaliseVibracao;
import com.br.predponta.app.entities.StatusComponenteVibracao;

@Repository
public interface StatusComponenteVibracaoRepository  extends JpaRepository <StatusComponenteVibracao, Integer>{

	@Query("SELECT scv FROM StatusComponenteVibracao scv WHERE scv.medicaoAnaliseVibracao = ?1")
	List<StatusComponenteVibracao> findBymedicaoAnaliseVibracao(MedicaoAnaliseVibracao medicaoAnaliseVibracao);
	


}