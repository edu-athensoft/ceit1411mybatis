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
	Item item = new Item();

	@Autowired
	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}
		
	@GetMapping("/mapper/insert")
	public void testMapperInsert() {
		System.out.println("testMapperInsert");
		System.out.println("service= "+ itemService);
		
//		Item itemById = itemService.getItemByIdService(2L);
//		Item itemByCode = itemService.getItemByCodeService("PE1095");
//		List<ItemViewObjectItemCategory> itemListByCategoryCode = itemService.getItemListByCategoryCodeService("YQC1045");
		
		item.setItemId(1000L);
		item.setItemCode("test-code");
		item.setItemName("test-name");
		itemService.insertItemService(item);
		
//		System.out.println(itemById);
//		System.out.println(itemByCode);
//		System.out.println(itemListByCategoryCode);
	}
	
	@GetMapping("/mapper/update")
	public void testMapperUpdate() {
		System.out.println("testMapperUpdate");
		System.out.println("service= "+ itemService);
		
		item.setItemId(1000L);
		item.setItemCode("update-code");
		item.setItemName("update-name");
		itemService.updateItemService(item);
		
	}
	
	@GetMapping("/mapper/delete")
	public void testMapperDelete() {
		System.out.println("testMapperDelete");
		System.out.println("service= "+ itemService);
		
		item.setItemId(1000L);
		itemService.deleteItemService(item);
		
	}
	
	@GetMapping("/mapper/delete/id")
	public void testMapperDeleteById() {
		System.out.println("testMapperDeleteById");
		System.out.println("service= "+ itemService);
		
		itemService.deleteItemService(1000L);
		
	}

	

}
