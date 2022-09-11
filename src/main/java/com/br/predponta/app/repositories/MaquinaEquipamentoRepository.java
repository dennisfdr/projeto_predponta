package com.br.predponta.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.predponta.app.entities.Maquina;
import com.br.predponta.app.entities.MaquinaEquipamento;

@Repository
public interface MaquinaEquipamentoRepository  extends JpaRepository <MaquinaEquipamento, Integer>{

	@Query("SELECT me FROM MaquinaEquipamento me WHERE me.maquina = ?1")
	List<MaquinaEquipamento> findByMaquina(Maquina maquina);
	
	
}
