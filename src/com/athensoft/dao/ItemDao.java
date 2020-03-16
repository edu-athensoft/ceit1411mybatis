package com.athensoft.dao;

import java.util.List;

import com.athensoft.entity.Item;
import com.athensoft.entity.ItemViewObjectItemCategory;


public interface ItemDao {
	public Item findById(Long itemId);
//	public List<ItemViewObjectItemCategory> findByCategoryCode(String categoryCode);
	
}
