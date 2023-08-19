package br.com.systempad.dto;

import java.io.Serializable;

import br.com.systempad.entities.Produto;

public class ProdutoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id_produto;
	private String nome;
	private String descricao;
	private Double preco;

	public ProdutoDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProdutoDTO(Long id, String nome, String descricao, Double preco) {
		this.id_produto = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}

	public ProdutoDTO(Produto entity) {
		this.id_produto = entity.getId_produto();
		this.nome = entity.getNome();
		this.descricao = entity.getDescricao();
		this.preco = entity.getPreco();

	}

	public Long getId_produto() {
		return id_produto;
	}

	public void setId_produto(Long id_produto) {
		this.id_produto = id_produto;
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