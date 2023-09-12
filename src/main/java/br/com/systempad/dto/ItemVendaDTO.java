package br.com.systempad.dto;

import java.io.Serializable;

import br.com.systempad.entities.ItemVenda;
import br.com.systempad.entities.Produto;
import br.com.systempad.entities.Venda;

public class ItemVendaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long idItemVenda;
	private int quantidade;
	private Produto produto;
	private Venda venda;

	public ItemVendaDTO() {
		// TODO Auto-generated constructor stub
	}

	public ItemVendaDTO(Long idItemVenda, int quantidade, Produto produto, Venda venda) {
		this.idItemVenda = idItemVenda;
		this.quantidade = quantidade;
		this.produto = produto;
		this.venda = venda;

	}

	public ItemVendaDTO(ItemVenda entity) {
		this.idItemVenda = entity.getIdItemVenda();
		this.quantidade = entity.getQuantidade();
		this.produto = entity.getProduto();
		this.venda = entity.getVenda();

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

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	
	


	
}