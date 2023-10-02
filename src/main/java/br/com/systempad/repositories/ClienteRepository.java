
package br.com.systempad.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.systempad.dto.BuscaClienteNomeDTO;
import br.com.systempad.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	
	//QueryMethods
		Cliente findByNomeCliente(String nomeCliente);

		//@Query - Consultas customizadas ==================================

		
		// SELECT * FROM TB_CLIENTE where NOME =
		@Query("SELECT new br.com.systempad.dto.BuscaClienteNomeDTO(obj.nomeCliente) "
				+ " FROM Cliente obj WHERE obj.nome = :nome")
		List<BuscaClienteNomeDTO> findByNomeSQL(String nome);


		
		
}
