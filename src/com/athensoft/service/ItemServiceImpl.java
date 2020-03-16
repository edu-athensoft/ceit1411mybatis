package com.athensoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.athensoft.dao.ItemMapper;
import com.athensoft.entity.Item;

@Transactional
public class ItemServiceImpl implements ItemService{
	
	private final ItemMapper itemMapper;
	
	public ItemServiceImpl(ItemMapper itemMapper) {
	    this.itemMapper = itemMapper;
	  }
	
	@Override
	public Item getItemByIdService(Long itemId) {
		return this.itemMapper.getItemById(itemId);
	}

}
