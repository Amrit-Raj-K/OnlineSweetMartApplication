package com.cg.osm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {

	@Id
	private String id;
	private String password;
	private Customer customer;
	private User user;
	private SweetItem item;
	private Category category;
	private Cart cart;
	

	// Gaurav Admin
}
