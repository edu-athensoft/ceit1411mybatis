package com.athensoft.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
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

	@Insert("INSERT INTO item(ItemID, ItemCode, ItemName) VALUES(#{itemId}, #{itemCode}, #{itemName})")
	public void insertItem(Item item);
	
	@Update("UPDATE item SET ItemCode = #{itemCode}, ItemName = #{itemName} WHERE ItemID = #{itemId}")
	public void updateItem(Item item);
	
	@Delete("DELETE FROM item WHERE ItemID = #{itemId}")
	public void deleteItem(Item item);
	
	@Delete("DELETE FROM item WHERE ItemID = #{itemId}")
	public void deleteItemById(Long itemId);
}
