package com.br.predponta.app.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.predponta.app.entities.McaRelatorio;

@Repository
public interface McaRelatorioRepository  extends JpaRepository <McaRelatorio, Integer>{

}
