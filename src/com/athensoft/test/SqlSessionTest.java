package com.athensoft.test;

import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


import com.athensoft.entity.Item;
import com.athensoft.service.ItemService;

//@SpringJUnitConfig(locations = {"classpath:com/athensoft/config/spring-config.xml"})
public class SqlSessionTest {
	@Autowired
	  private ItemService itemService;

	  @Test
	  public final void testItemService() {
	    Item item = this.itemService.getItemByIdService(2L);
	    System.out.println(item);
	  }
}
