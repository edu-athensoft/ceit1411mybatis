package com.athensoft.test.dao;

import java.util.List;

import com.athensoft.test.entity.Item;
import com.athensoft.test.entity.ItemViewObjectItemCategory;


public interface ItemDao {
	public Item findById(Long itemId);
//	public List<ItemViewObjectItemCategory> findByCategoryCode(String categoryCode);
	
}
