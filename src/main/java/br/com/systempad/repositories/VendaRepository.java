package br.com.systempad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.systempad.entities.Venda;

@Repository
public interface VendaRepository extends JpaRepository  <Venda, Long> {

}

