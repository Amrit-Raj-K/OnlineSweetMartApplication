package com.cg.osm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.osm.entity.Category;
import com.cg.osm.error.CategoryNotFoundException;
@Service
public interface CategoryService  {

	public Category addCategory(Category Category);
	public Category updateCategory(Category Category) throws CategoryNotFoundException;
	public Category cancelCategory(int CategoryId) throws CategoryNotFoundException;
	public List<Category> showAllCategorys();
	public double calculateTotalCost(int categoryId);

}
