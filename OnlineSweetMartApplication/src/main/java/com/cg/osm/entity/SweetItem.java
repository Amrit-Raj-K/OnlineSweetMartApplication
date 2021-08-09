package com.cg.osm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class SweetItem {

	@Id
	private Integer orderItemId;

	private Product product;
	@ManyToOne
	private SweetOrder sweetOrder;

	public Integer getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public SweetOrder getSweetOrder() {
		return sweetOrder;
	}

	public void setSweetOrder(SweetOrder sweetOrder) {
		this.sweetOrder = sweetOrder;
	}

}
