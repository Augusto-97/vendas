package com.vendas.api.entities;
 
import java.io.Serializable;
import java.util.List;
 
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
 
@Entity
@Table(name = "vendedor")
public class Vendedor implements Serializable {
	 
   	private static final long serialVersionUID = 1L;
 
   	@Id
   	@GeneratedValue(strategy = GenerationType.AUTO)
   	private int id;
   	
   	@Column(name = "nome", nullable = false, length = 100)
   	private String nome;
   	
   	@JsonManagedReference
   	@OneToMany(mappedBy = "vendedor", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   	private List<Vendas> vendas;
    	
   	public int getId() {
         	return id;
   	}
   	
   	public void setId(int id) {
         	this.id = id;
   	}
 
   	public String getNome() {
         	return nome;
   	}
   	
   	public void setNome(String nome) {
         	this.nome = nome;
   	}

 
   	public List<Vendas> getVendas() {
         	return vendas;
   	}
   	
   	public void setVendas(List<Vendas> vendas) {
         	this.vendas = vendas;
   	}
 
   	@Override
   	public String toString() {
         	return "Vendedor[" + "id=" + id + ","
                       	+ "nome=" + nome + "]";
   	}
 
}

