package com.athensoft.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.athensoft.test.entity.Item;
import com.athensoft.test.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {
	private ItemService itemService;

	@Autowired
	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}
	
	@GetMapping("/items/{itemId}")
	public void getDataById(@PathVariable Long itemId) {
		System.out.println("ItemController.getDataById()");
		System.out.println(itemService.getItemByIdService(itemId));
	}
	
	@GetMapping("/item-code/{itemCode}")
	public void getDataByCode(@PathVariable String itemCode) {
		System.out.println("ItemController.getDataByCode()");
		System.out.println(itemService.getItemByCodeService(itemCode));
	}
	
	@GetMapping("/category-code/{categoryCode}")
	public void getDataByCategoryCode(@PathVariable String categoryCode) {
		System.out.println("ItemController.getDataByCategoryCode()");
		System.out.println(itemService.getItemListByCategoryCodeService(categoryCode));
	}
}
