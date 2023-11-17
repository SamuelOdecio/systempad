package br.com.systempad.dto;

import java.io.Serializable;

import br.com.systempad.entities.ItemVenda;
import br.com.systempad.entities.Produto;
import br.com.systempad.entities.Venda;

public class ItemVendaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private int quantidade;
	private Produto produto;
	private Venda venda;

	public ItemVendaDTO() {
		// TODO Auto-generated constructor stub
	}

	public ItemVendaDTO(Long id, int quantidade, Produto produto, Venda venda) {
		this.id = id;
		this.quantidade = quantidade;
		this.produto = produto;
		this.venda = venda;

	}

	public ItemVendaDTO(ItemVenda entity) {
		this.id = entity.getId();
		this.quantidade = entity.getQuantidade();
		this.produto = entity.getProduto();
		this.venda = entity.getVenda();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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