package com.br.predponta.app.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.predponta.app.entities.InspecaoTermografica;
import com.br.predponta.app.entities.Medicao;

@Repository
public interface InspecaoTermograficaRepository  extends JpaRepository <InspecaoTermografica, Integer>{

	@Query("SELECT ite FROM InspecaoTermografica ite WHERE ite.medicao = ?1")
	List<InspecaoTermografica> findByMedicao(Medicao medicao);


}
