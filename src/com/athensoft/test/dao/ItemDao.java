
package com.athensoft.test.dao;

import java.util.List;

import com.athensoft.test.entity.Item;
import com.athensoft.test.entity.ItemViewObjectItemCategory;


public interface ItemDao {
	public Item findById(Long itemId);
	public Item findByCode(String itemCode);
	public List<ItemViewObjectItemCategory> findByCategoryCode(String categoryCode);
	
	//public void create(Item item);
	
}
