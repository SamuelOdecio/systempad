package br.com.systempad.dto;

import java.io.Serializable;

import br.com.systempad.entities.ItemVenda;
import br.com.systempad.entities.Produto;

public class ItemVendaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long idItemVenda;
	private int quantidade;
	private Produto produto;

	public ItemVendaDTO() {
		// TODO Auto-generated constructor stub
	}

	public ItemVendaDTO(Long idItemVenda, int quantidade, Produto produto) {
		this.idItemVenda = idItemVenda;
		this.quantidade = quantidade;
		this.produto = produto;

	}

	public ItemVendaDTO(ItemVenda entity) {
		this.idItemVenda = entity.getIdItemVenda();
		this.quantidade = entity.getQuantidade();
		this.produto = entity.getProduto();

	}

	public Long getIdItemVenda() {
		return idItemVenda;
	}

	public void setIdItemVenda(Long idItemVenda) {
		this.idItemVenda = idItemVenda;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	
}