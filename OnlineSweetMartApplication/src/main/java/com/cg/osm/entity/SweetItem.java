package com.cg.osm.entity;


public class SweetItem {
    private Integer orderItemId;
    private Product product;
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
