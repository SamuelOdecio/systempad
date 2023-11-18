package br.com.systempad.dto;

import br.com.systempad.entities.ItemVenda;
import java.io.Serializable;

import br.com.systempad.entities.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProdutoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String descricao;
	private Double preco;
	private String imagem;

        private List<ItemVenda> itemVendas = new ArrayList<>();
        
        
	public ProdutoDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProdutoDTO(Long id, String nome, String descricao, Double preco, String imagem) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.imagem = imagem;
	}

	public ProdutoDTO(Produto entity) {
		this.id = entity.getId();
		this.nome = entity.getNome();
		this.descricao = entity.getDescricao();
		this.preco = entity.getPreco();
		this.imagem = entity.getImagem();
		
	}
        
        public ProdutoDTO(Produto entity, List<ItemVenda> itemVendas) {
		this(entity);
		this.itemVendas = itemVendas.stream().map(x -> new ItemVenda(
				x.getId(), x.getQuantidade(),x.getProduto(),x.getVenda()))
				.collect(Collectors.toList());
	}

	public List<ItemVenda> getItemVendas() {
		return itemVendas;
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

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	
	
}