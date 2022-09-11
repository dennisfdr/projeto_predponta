package com.br.predponta.app.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.predponta.app.entities.InspecaoTermografica;
import com.br.predponta.app.entities.InspecaoTermograficaPeca;

@Repository
public interface InspecaoTermograficaPecaRepository  extends JpaRepository <InspecaoTermograficaPeca, Integer>{

	@Query("SELECT itp FROM InspecaoTermograficaPeca itp WHERE itp.inspecaoTermografica.iteCodigo = ?1")
	List<InspecaoTermograficaPeca> findByInspecaoTermografica(Integer iteCodigo);
	

}
