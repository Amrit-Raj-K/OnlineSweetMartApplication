package com.cg.osm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.osm.entity.Customer;
import com.cg.osm.error.CustomerNotFoundException;
import com.cg.osm.repository.CategoryRepository;


@Service
public class CustomerServiceImpl implements CustomerService{
	
	private CategoryRepository categoryRepo;

	@Override
	public Customer addCustomer(Customer Customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomer(Customer Customer) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer cancelCustomer(int CustomerId) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> showAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> showAllCustomers(int CustomerdId) {
		// TODO Auto-generated method stub
		return null;
	}


	}
