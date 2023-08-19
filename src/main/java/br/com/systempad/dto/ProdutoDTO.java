package br.com.systempad.dto;

import java.io.Serializable;

import br.com.systempad.entities.Produto;

public class ProdutoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long idProduto;
	private String nome;
	private String descricao;
	private Double preco;

	public ProdutoDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProdutoDTO(Long id, String nome, String descricao, Double preco) {
		this.idProduto = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}

	public ProdutoDTO(Produto entity) {
		this.idProduto = entity.getIdProduto();
		this.nome = entity.getNome();
		this.descricao = entity.getDescricao();
		this.preco = entity.getPreco();

	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	
}