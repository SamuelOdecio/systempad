package br.com.systempad.dto;

import java.io.Serializable;
import java.util.Date;

import br.com.systempad.entities.Atendente;
import br.com.systempad.entities.Cliente;
import br.com.systempad.entities.Venda;
import br.com.systempad.enums.Pagamento;

public class VendaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Date data;
	private Pagamento pagamento;
	private Atendente atendente;
	private Cliente cliente;
	

	public VendaDTO() {
		// TODO Auto-generated constructor stub
	}

	public VendaDTO(Long id, Date data, Pagamento pagamento, Atendente atendente, Cliente cliente) {
		this.id = id;
		this.data = data;
		this.pagamento = pagamento;
		this.atendente = atendente;
		this.cliente = cliente;
	}

	public VendaDTO(Venda entity) {
		this.id = entity.getId();
		this.data = entity.getData();
		this.pagamento = entity.getPagamento();
		this.atendente = entity.getAtendente();
		this.cliente = entity.getCliente();

	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Atendente getAtendente() {
		return atendente;
	}

	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

	
	
}