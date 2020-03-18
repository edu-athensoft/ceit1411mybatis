package com.athensoft.test.service;

import java.util.List;

import com.athensoft.test.entity.Item;
import com.athensoft.test.entity.ItemViewObjectItemCategory;

public interface ItemService {
	public Item getItemByIdService(Long itemId);
	public Item getItemByCodeService(String itemCode);
	public List<ItemViewObjectItemCategory> getItemByCategoryCodeService(String categoryCode);
}
