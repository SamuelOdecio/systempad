package br.com.systempad.entities;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import br.com.systempad.enums.Pagamento;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_venda")
public class Venda implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long idVenda;
	private Date data;
	private Pagamento pagamento;
	
	public Venda() {
		
	}

	public Venda(Long idVenda, Date data, Pagamento pagamento) {
		this.idVenda = idVenda;
		this.data = data;
		this.pagamento = pagamento;
		
		
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

	@Override
	public int hashCode() {
		return Objects.hash(idVenda);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venda other = (Venda) obj;
		return Objects.equals(idVenda, other.idVenda);
	}
	
}