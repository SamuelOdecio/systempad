package br.com.systempad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.systempad.entities.Gerente;

@Repository
public interface GerenteRepository extends JpaRepository  <Gerente, Long> {

}

