package br.com.systempad.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_atendente")
public class Atendente extends Pessoa {
	private static final long serialVersionUID = 1L;
	


	public Atendente () {
		
	}
	

    public Atendente (Atendente atendente, Long id, String nome, String cpf, String telefone, String email) {
    	super();
        
    }
	

}
