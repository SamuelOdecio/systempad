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
    private String userName;
    private String senha;
        
	public AtendenteDTO() {
		// TODO Auto-generated constructor stub
	}

	public AtendenteDTO(Long id, String nome, String cpf, 
                String telefone, String email, String userName, String senha) {
				this.id = id;
                this.nome = nome;
                this.cpf = cpf;
                this.telefone = telefone;
                this.email = email;
                this.userName = userName;
                this.senha = senha;
	}

	public AtendenteDTO(Atendente entity) {
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

	public void setTelefone(String Telefone) {
		this.telefone = Telefone;
	}
        
          public String getEmail() {
		return email;
	}

	public void setEmail(String Email) {
		this.email = Email;
	}
        
          public String getUserName() {
		return userName;
	}

	public void setUserName(String UserName) {
		this.userName = UserName;
	}
        
          public String getSenha() {
		return senha;
	}

	public void setSenha(String Senha) {
		this.senha = Senha;
	}

	
}