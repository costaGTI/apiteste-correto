package com.apiteste.apiteste.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table (name = "PCPEDI")
public class ItensPedido implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Integer numItem;
	private Integer codprod;
	private String descricao;
	private String embalagem;
	private int qt;
	private int qtseparada;
	private Integer codfuncsep;
	private Date dtinicialsep;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "numped")
	private Pedido pedido;
	
	public ItensPedido() {
		
	}
	
	public ItensPedido(Integer numItem, Integer codprod, String descricao, String embalagem, int qt,
			int qtseparada, Integer codfuncsep, Date dtinicialsep, Pedido pedido) {
		super();
		this.numItem = numItem;
		this.codprod = codprod;
		this.descricao = descricao;
		this.embalagem = embalagem;
		this.qt = qt;
		this.qtseparada = qtseparada;
		this.codfuncsep = codfuncsep;
		this.dtinicialsep = dtinicialsep;
		this.pedido = pedido;
	}
	
	public Integer getNumItem() {
		return numItem;
	}

	public void setNumItem(Integer numItem) {
		this.numItem = numItem;
	}

	public Integer getCodprod() {
		return codprod;
	}

	public void setCodprod(Integer codprod) {
		this.codprod = codprod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEmbalagem() {
		return embalagem;
	}

	public void setEmbalagem(String embalagem) {
		this.embalagem = embalagem;
	}

	public int getQt() {
		return qt;
	}

	public void setQt(int qt) {
		this.qt = qt;
	}

	public int getQtseparada() {
		return qtseparada;
	}

	public void setQtseparada(int qtseparada) {
		this.qtseparada = qtseparada;
	}

	public Integer getCodfuncsep() {
		return codfuncsep;
	}

	public void setCodfuncsep(Integer codfuncsep) {
		this.codfuncsep = codfuncsep;
	}

	public Date getDtinicialsep() {
		return dtinicialsep;
	}

	public void setDtinicialsep(Date dtinicialsep) {
		this.dtinicialsep = dtinicialsep;
	}
	
	public Pedido getPedido() {
		return pedido;
	}
	
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numItem == null) ? 0 : numItem.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItensPedido other = (ItensPedido) obj;
		if (numItem == null) {
			if (other.numItem != null)
				return false;
		} else if (!numItem.equals(other.numItem))
			return false;
		return true;
	}
	
	
	
	
	
	
}
