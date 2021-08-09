package com.cg.osm.entity;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;

import com.cg.osm.entity.SweetOrder;

@Entity
public class Customer {

    private Long userId;
    private String username;
    private Set<SweetOrder> sweetOrders;
    private List<SweetItem> sweetItems;
	private Cart cart;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Set<SweetOrder> getSweetOrders() {
		return sweetOrders;
	}
	public void setSweetOrders(Set<SweetOrder> sweetOrders) {
		this.sweetOrders = sweetOrders;
	}
	public List<SweetItem> getSweetItems() {
		return sweetItems;
	}
	public void setSweetItems(List<SweetItem> sweetItems) {
		this.sweetItems = sweetItems;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	// I did this lol
	
}
