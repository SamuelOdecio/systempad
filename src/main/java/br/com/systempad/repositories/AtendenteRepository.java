package br.com.systempad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.systempad.entities.Atendente;

@Repository
public interface AtendenteRepository extends JpaRepository  <Atendente, Long> {

}

