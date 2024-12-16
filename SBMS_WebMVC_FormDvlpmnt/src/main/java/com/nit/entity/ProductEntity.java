package com.nit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProductEntity {

	@Id
	private Integer peId;
	
	@Column(length = 25)
	private String peName;

	@Column(length = 30)
	private Double pePrice;

	public Integer getPeId() {
		return peId;
	}

	public void setPeId(Integer peId) {
		this.peId = peId;
	}

	public String getPeName() {
		return peName;
	}

	public void setPeName(String peName) {
		this.peName = peName;
	}

	public Double getPePrice() {
		return pePrice;
	}

	public void setPePrice(Double pePrice) {
		this.pePrice = pePrice;
	}

	@Override
	public String toString() {
		return "ProductEntity [peId=" + peId + ", peName=" + peName + ", pePrice=" + pePrice + "]";
	}
	
	
}
