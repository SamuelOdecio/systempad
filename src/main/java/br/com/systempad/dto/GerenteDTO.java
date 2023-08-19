package br.com.systempad.dto;


import java.io.Serializable;

import br.com.systempad.entities.Gerente;

public class GerenteDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Long idGerente;
	private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String userName;
    private String senha;
        
	public GerenteDTO() {
		// TODO Auto-generated constructor stub
	}

	public GerenteDTO(Long id, Long idGerente, String nome, String cpf, 
                String telefone, String email, String userName, String senha) {
				this.id = id;
				this.idGerente = idGerente;
                this.nome = nome;
                this.cpf = cpf;
                this.telefone = telefone;
                this.email = email;
                this.userName = userName;
                this.senha = senha;
	}

	public GerenteDTO(Gerente entity) {
		this.id = entity.getId();
		this.nome = entity.getNome();
		this.cpf = entity.getCpf();
        this.telefone = entity.getCpf();
        this.email = entity.getEmail();
        this.userName = entity.getUserName();
		this.senha = entity.getSenha();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(Long idGerente) {
		this.idGerente = idGerente;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
}