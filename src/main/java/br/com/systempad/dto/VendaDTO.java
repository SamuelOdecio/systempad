package br.com.systempad.dto;

import java.io.Serializable;
import java.util.Date;

import br.com.systempad.entities.Venda;
import br.com.systempad.enums.Pagamento;

public class VendaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long idVenda;
	private Date data;
	private Pagamento pagamento;

	public VendaDTO() {
		// TODO Auto-generated constructor stub
	}

	public VendaDTO(Long idVenda, Date data, Pagamento pagamento) {
		this.idVenda = idVenda;
		this.data = data;
		this.pagamento = pagamento;
	}

	public VendaDTO(Venda entity) {
		this.idVenda = entity.getIdVenda();
		this.data = entity.getData();
		this.pagamento = entity.getPagamento();


	}

	public Long getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(Long idVenda) {
		this.idVenda = idVenda;
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

	
	
}