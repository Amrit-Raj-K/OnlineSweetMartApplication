package com.cg.osm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.osm.entity.Category;
import com.cg.osm.error.CategoryNotFoundException;
import com.cg.osm.repository.CategoryRepository;
@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepository categoryRepo;

	@Override
	public Category addCategory(Category Category) {
		// TODO Auto-generated method stub
		return categoryRepo.addCategory(Category);
	}

	@Override
	public Category updateCategory(Category Category) throws CategoryNotFoundException {
		// TODO Auto-generated method stub
		categoryRepo.saveAndFlush(Category);

		return Category;
	}

	@Override
	public Category cancelCategory(int CategoryId) throws CategoryNotFoundException {
		// TODO Auto-generated method stub
		categoryRepo.deleteById(CategoryId);
		return null;
	}

	@Override
	public List<Category> showAllCategorys() {
		// TODO Auto-generated method stub
		return categoryRepo.findAll();
	}

	@Override
	public double calculateTotalCost(int categoryId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
