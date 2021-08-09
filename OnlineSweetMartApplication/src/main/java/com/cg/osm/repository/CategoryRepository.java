package com.cg.osm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.osm.entity.Category;
import com.cg.osm.error.CategoryNotFoundException;
@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {

	public Category addCategory(Category Category);
	public Category updateCategory(Category Category) throws CategoryNotFoundException;
	public Category cancelCategory(int CategoryId) throws CategoryNotFoundException;
	public List<Category> showAllCategorys();

}
