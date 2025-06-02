package com.floormaster.entities;

import jakarta.persistence.*;

@Entity
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long materialId;

    private String name;
    private Boolean inStock;
    private Boolean ordered;
    private String supplier;
    private Double orderAmount;
    private java.time.LocalDate expectedDelivery;
	public Long getMaterialId() {
		return materialId;
	}
	public void setMaterialId(Long materialId) {
		this.materialId = materialId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getInStock() {
		return inStock;
	}
	public void setInStock(Boolean inStock) {
		this.inStock = inStock;
	}
	public Boolean getOrdered() {
		return ordered;
	}
	public void setOrdered(Boolean ordered) {
		this.ordered = ordered;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public Double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public java.time.LocalDate getExpectedDelivery() {
		return expectedDelivery;
	}
	public void setExpectedDelivery(java.time.LocalDate expectedDelivery) {
		this.expectedDelivery = expectedDelivery;
	}

    // Getters and Setters
    
}

