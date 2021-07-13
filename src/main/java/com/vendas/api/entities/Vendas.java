package com.vendas.api.entities;
 
import java.io.Serializable;
import java.util.Date;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
 
@Entity
@Table(name = "vendas")
public class Vendas implements Serializable {
	 
   	private static final long serialVersionUID = 1L;
 
   	@Id
   	@GeneratedValue(strategy = GenerationType.AUTO)
   	private int id;
   	
   	@Column(name = "data_Venda", nullable = false)
   	private Date dataVenda;
   	
   	@Column(name = "vendedor_id", nullable = false)
   	private int vendedor_id;
   	
   	@Column(name = "valor_venda", nullable = false)
   	private double valor_enda;
   	
   	@JsonBackReference
   	@ManyToOne(fetch = FetchType.EAGER)
   	private Vendedor vendedor;

	private double valorVenda;
   	
   	public int getId() {
         	return id;
   	}
   	
   	public void setId(int id) {
         	this.id = id;
   	}
 
   	public Date getDataVenda() {
         	return dataVenda;
   	}
   	
   	public void setDataVenda(Date dataVenda) {
     	this.dataVenda = dataVenda;
	}
   	
   	public Vendedor getVendedor() {
     	return vendedor;
	}
	
	public void setVendedor(Vendedor vendedor) {
     	this.vendedor = vendedor;
	}
   	
 
   	public double getValorVenda(double valorVenda) {
         	return valorVenda;
   	}
   	
   	public double setValorVenda(double valorVenda) {
         	return this.valorVenda = valorVenda;
   	}
 
   	
   	@PreUpdate
   	public void preUpdate() {
         	dataVenda = new Date();
   	}
 
   	@PrePersist
   	public void prePersist() {
         	dataVenda = new Date();
   	}
 
   	@Override
   	public String toString() {
         	return "Vendas[" + "id=" + id + ","
                       	+ "dataVenda=" + dataVenda + ","
                       	+ "vendedor=" + vendedor + ","
                       	+ "valorVenda=" + valorVenda + "]";
   	}
 
}

