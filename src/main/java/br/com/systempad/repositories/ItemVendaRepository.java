package br.com.systempad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.systempad.entities.ItemVenda;

@Repository
public interface ItemVendaRepository extends JpaRepository  <ItemVenda, Long> {

}

