package com.cg.osm.entity;

import javax.persistence.Entity;

@Entity

public class Admin {

	private String id;
	private String password;
	private Customer customer;
	private User user;
	private SweetItem item;
	private Category category;
	private Cart cart;
	

}
