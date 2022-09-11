package com.br.predponta.app.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.br.predponta.app.entities.CondicoesAmbiente;

@Repository
public interface CondicoesAmbienteRepository  extends JpaRepository <CondicoesAmbiente, Integer>{

	@Query("SELECT cam FROM CondicoesAmbiente cam WHERE cam.inspecaoTermograficaPeca.itpCodigo = ?1")
	List<CondicoesAmbiente> findByInspecaoTermograficaPeca(Integer itpCodigo);

	


}
