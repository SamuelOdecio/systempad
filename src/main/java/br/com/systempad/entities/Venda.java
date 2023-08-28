package br.com.systempad.entities;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import br.com.systempad.enums.Pagamento;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tb_venda")
public class Venda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVenda;
	@Temporal(TemporalType.TIMESTAMP)
	private Date data;
	@Enumerated(EnumType.STRING)
	private Pagamento pagamento;
	@ManyToOne
	@JoinColumn(name = "id_atendente_fk")
	private Atendente atendente;
	
	
	public Venda() {

	}

	public Venda(Long idVenda, Date data, Pagamento pagamento, Atendente atendente) {
		this.idVenda = idVenda;
		this.data = data;
		this.pagamento = pagamento;
		this.atendente = atendente;


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

	
	public Atendente getAtendente() {
		return atendente;
	}

	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
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