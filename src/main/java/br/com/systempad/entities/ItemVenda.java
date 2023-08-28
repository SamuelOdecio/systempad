package br.com.systempad.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_item_venda")
public class ItemVenda implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idItemVenda;
	private int quantidade;
	@ManyToOne
	@JoinColumn(name = "id_produto_fk")
	private Produto produto;
	
	public ItemVenda() {
		
	}

	public ItemVenda(Long idItemVenda,  int quantidade, Produto produto) {
		this.idItemVenda = idItemVenda;
		this.quantidade = quantidade;
		this.produto = produto;
		
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

	@Override
	public int hashCode() {
		return Objects.hash(idItemVenda);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemVenda other = (ItemVenda) obj;
		return Objects.equals(idItemVenda, other.idItemVenda);
	}
	
}