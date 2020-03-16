package com.athensoft.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.athensoft.entity.Item;
import com.athensoft.entity.ItemViewObjectItemCategory;


@Mapper
public interface ItemMapper {
//	@Select("SELECT * FROM item WHERE ItemID = #{itemId}")
	public Item getItemById(Long itemId);
	
	@Select("SELECT * FROM item WHERE itemCode = #{ItemCode}")
	public Item getItemByCode(String itemCode);
	
	@Select("SELECT * FROM view_item_itemCategory WHERE CategoryCode = #{categoryCode}")
	public List<ItemViewObjectItemCategory> getItemListByCategoryCode(String categoryCode);
}
