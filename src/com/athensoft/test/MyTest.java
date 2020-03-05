package com.athensoft.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.athensoft.dao.ItemMapper;
import com.athensoft.entity.Item;
import com.athensoft.entity.ItemViewObjectItemCategory;
import com.athensoft.util.MySqlSessionFactory;

public class MyTest {

	public static void main(String[] args) {
		SqlSession session = null;
		try {
			session = MySqlSessionFactory.getSqlSessionFatcory().openSession();
			session.getConfiguration().addMapper(ItemMapper.class);
			
			ItemMapper mapper = session.getMapper(ItemMapper.class);
			
			Item itemById = mapper.getItemById(2L);
			System.out.println(itemById);
			
			Item itemByCode = mapper.getItemByCode("2-A_Sample");
			System.out.println(itemByCode);
			
			List<ItemViewObjectItemCategory> itemListByCategoryCode = mapper.getItemListByCategoryCode("YQC1045");
			System.out.println(itemListByCategoryCode);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)	session.close();
		  
		}
		

	}

}
