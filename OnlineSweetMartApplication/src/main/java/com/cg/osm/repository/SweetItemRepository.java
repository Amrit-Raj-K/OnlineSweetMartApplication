package com.cg.osm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.osm.entity.SweetItem;
import com.cg.osm.error.SweetItemNotFoundException;

public interface SweetItemRepository extends JpaRepository<SweetItem, Integer>{

	public SweetItem addSweetItem(SweetItem SweetItem);
	public SweetItem updateSweetItem(SweetItem SweetItem) throws SweetItemNotFoundException;
	public SweetItem cancelSweetItem(int SweetItemId) throws SweetItemNotFoundException;
	public List<SweetItem> showAllSweetItems();

}
