package com.br.predponta.app.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.predponta.app.entities.MedicaoAnaliseOleo;

@Repository
public interface MedicaoAnaliseOleoRepository  extends JpaRepository <MedicaoAnaliseOleo, Integer>{

	@Query("SELECT mao FROM MedicaoAnaliseOleo mao WHERE mao.analiseOleo.anoCodigo = ?1")
	List<MedicaoAnaliseOleo> findByAnaliseOleo(Integer anoCodigo);



}
