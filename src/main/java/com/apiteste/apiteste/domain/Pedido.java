package com.apiteste.apiteste.domain;

import java.io.Serializable;
import java.util.Date;

public class Pedido implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer numped;
	private Integer codfuncsep;
	private Date dtinicialsep;
	private String posicao;
	
	public Pedido() {
		
	}
	
	
	public Pedido(Integer numped, Integer codfuncsep, Date dtinicialsep, String posicao) {
		super();
		this.numped = numped;
		this.codfuncsep = codfuncsep;
		this.dtinicialsep = dtinicialsep;
		this.posicao = posicao;
	}

	public Integer getNumped() {
		return numped;
	}

	public void setNumped(Integer numped) {
		this.numped = numped;
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

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numped == null) ? 0 : numped.hashCode());
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
		Pedido other = (Pedido) obj;
		if (numped == null) {
			if (other.numped != null)
				return false;
		} else if (!numped.equals(other.numped))
			return false;
		return true;
	}
	
	
	
	

}