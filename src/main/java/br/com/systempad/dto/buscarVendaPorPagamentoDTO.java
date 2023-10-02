/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.systempad.dto;

import br.com.systempad.entities.Venda;
import br.com.systempad.enums.Pagamento;
import java.io.Serializable;

/**
 *
 * @author Gabriel Suldine
 */
public class buscarVendaPorPagamentoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Pagamento pagamento;
    private String idVenda;

    public buscarVendaPorPagamentoDTO() {
    }

    public buscarVendaPorPagamentoDTO(Pagamento pagamento, String idVenda) {
        this.pagamento = pagamento;
        this.idVenda = idVenda;
    }

    public void setIdVenda(String idVenda) {
        this.idVenda = idVenda;
    }

    public String getIdvenda() {
        return idVenda;
    }

    public Pagamento getNumeroSerie() {
        return pagamento;
    }

    public void setNumeroSerie(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

}
