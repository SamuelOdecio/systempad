package br.com.systempad.dto;

import java.io.Serializable;

import br.com.systempad.dto.ClienteDTO;

public class BuscaClienteNomeDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nomeCliente;


	public BuscaClienteNomeDTO() { }
	
	public BuscaClienteNomeDTO(ClienteDTO nomeCliente) {
		this.nomeCliente = nomeCliente.getNome();

	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


}
