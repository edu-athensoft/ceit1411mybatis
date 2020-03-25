package com.athensoft.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import com.athensoft.test.entity.Item;
import com.athensoft.test.entity.ItemViewObjectItemCategory;


@Mapper
//@MapperScan
public interface ItemMapper {
//	@Select("SELECT * FROM item WHERE ItemID = #{itemId}")
	public Item getItemById(Long itemId);
	
	@Select("SELECT * FROM item WHERE itemCode = #{ItemCode}")
	public Item getItemByCode(String itemCode);
	
	@Select("SELECT * FROM view_item_itemCategory WHERE CategoryCode = #{categoryCode}")
	public List<ItemViewObjectItemCategory> getItemListByCategoryCode(String categoryCode);

	public void insertItem(Item item);
	public void updateItem(Item item);
	public void deleteItem(Item item);
	public void deleteItem(Long itemId);
}
