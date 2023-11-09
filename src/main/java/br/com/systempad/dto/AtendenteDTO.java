package br.com.systempad.dto;

import java.io.Serializable;

import br.com.systempad.entities.Atendente;

public class AtendenteDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
    private String cpf;
    private String telefone;
    private String email;


        
	public AtendenteDTO() {
		// TODO Auto-generated constructor stub
	}

	public AtendenteDTO(Long id, String nome, String cpf, String telefone, String email) {
				this.id = id;
                this.nome = nome;
                this.cpf = cpf;
                this.telefone = telefone;
                this.email = email;

	}

	public AtendenteDTO(Atendente entity) {
		this.id = entity.getId();
		this.nome = entity.getNome();
		this.cpf = entity.getCpf();
        this.telefone = entity.getTelefone();
        this.email = entity.getEmail();


	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

        public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
        
          public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
        
          public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	
	
}