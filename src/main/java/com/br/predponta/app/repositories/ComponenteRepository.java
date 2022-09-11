package com.br.predponta.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.predponta.app.entities.Componente;
import com.br.predponta.app.entities.MaquinaEquipamento;

@Repository
public interface ComponenteRepository  extends JpaRepository <Componente, Integer>{

	@Query("SELECT c FROM Componente c WHERE c.maquinaequipamentoMAECODIGO = ?1")
	List<Componente> findByMaquinaEquipamento(MaquinaEquipamento maquinaEquipamento);


}
