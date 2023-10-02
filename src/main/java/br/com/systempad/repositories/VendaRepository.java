package br.com.systempad.repositories;

import br.com.systempad.dto.VendaDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.systempad.entities.Venda;
import br.com.systempad.enums.Pagamento;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import br.com.systempad.entities.Cliente;


@Repository
public interface VendaRepository extends JpaRepository  <Venda, Long> {

    @Query()
    List<Pagamento> findByPagamento(Pagamento pagamento);
    
       
    
    
}