package br.com.systempad.dto;

import java.io.Serializable;

import br.com.systempad.entities.ItemVenda;

public class ItemVendaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long idItemVenda;
	private Long idProduto;
	private int quantidade;

	public ItemVendaDTO() {
		// TODO Auto-generated constructor stub
	}

	public ItemVendaDTO(Long idItemVenda, Long idProduto, int quantidade) {
		this.idItemVenda = idItemVenda;
		this.idProduto = idProduto;
		this.quantidade = quantidade;

	}

	public ItemVendaDTO(ItemVenda entity) {
		this.idItemVenda = entity.getIdItemVenda();
		this.idProduto = entity.getIdProduto();
		this.quantidade = entity.getQuantidade();

	}

	public Long getIdItemVenda() {
		return idItemVenda;
	}

	public void setIdItemVenda(Long idItemVenda) {
		this.idItemVenda = idItemVenda;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	
}