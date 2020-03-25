package com.athensoft.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.athensoft.test.dao.ItemMapper;
import com.athensoft.test.entity.Item;
import com.athensoft.test.entity.ItemViewObjectItemCategory;

@Service
public class ItemServiceImpl implements ItemService{
	private ItemMapper itemMapper;
	
	@Autowired
	public void setItemMapper(ItemMapper itemMapper) {
	    this.itemMapper = itemMapper;
	  }
	
	@Override
	public Item getItemByIdService(Long itemId) {
		return this.itemMapper.getItemById(itemId);
	}

	@Override
	public Item getItemByCodeService(String itemCode) {
		return this.itemMapper.getItemByCode(itemCode);
	}

	@Override
	public List<ItemViewObjectItemCategory> getItemListByCategoryCodeService(String categoryCode) {
		return this.itemMapper.getItemListByCategoryCode(categoryCode);
	}

	@Override
	public void insertItemService(Item item) {
		this.itemMapper.insertItem(item);
		
	}

	@Override
	public void updateItemService(Item item) {
		this.itemMapper.updateItem(item);
		
	}

	@Override
	public void deleteItemService(Item item) {
		this.itemMapper.deleteItem(item);	
	}

	@Override
	public void deleteItemService(Long itemId) {
		this.itemMapper.deleteItem(itemId);	
	}

}
