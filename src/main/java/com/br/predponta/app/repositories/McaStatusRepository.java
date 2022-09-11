package com.br.predponta.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.predponta.app.entities.McaStatus;

@Repository
public interface McaStatusRepository  extends JpaRepository <McaStatus, Integer>{


}