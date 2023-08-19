package br.com.systempad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.systempad.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository  <Produto, Long> {

}

