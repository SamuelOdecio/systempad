package br.com.systempad.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_gerente")
public class Gerente extends Pessoa {
	private static final long serialVersionUID = 1L;
	

	
	public Gerente () {
		
	}
	

    public Gerente (Long id, String nome, String cpf, String telefone, String email, String userName, String senha) {
    	super();
       
    }
	

}
