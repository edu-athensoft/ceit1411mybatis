package com.athensoft.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.athensoft.test.dao.ItemMapper;
import com.athensoft.test.entity.Item;
import com.athensoft.test.entity.ItemViewObjectItemCategory;
import com.athensoft.test.service.ItemService;

@RestController
@RequestMapping("/test")
public class MyTestController_Mapper {
	private ItemService itemService;

	@Autowired
	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}
		
	@GetMapping("/mapper")
	public void testMapper() {
		System.out.println("testMapper");
		System.out.println("service= "+ itemService);
		
		Item itemById = itemService.getItemByIdService(2L);
		Item itemByCode = itemService.getItemByCodeService("PE1095");
		List<ItemViewObjectItemCategory> itemListByCategoryCode = itemService.getItemByCategoryCodeService("YQC1045");
		
		System.out.println(itemById);
		System.out.println(itemByCode);
		System.out.println(itemListByCategoryCode);
	}
	

	

}
