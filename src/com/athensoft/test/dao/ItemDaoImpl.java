package com.athensoft.test.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.athensoft.test.entity.Item;
import com.athensoft.test.entity.ItemViewObjectItemCategory;

public class ItemDaoImpl extends SqlSessionDaoSupport implements ItemDao {
	private SqlSession sqlSession;


	@Override
	public Item findById(Long itemId) {
//		try (SqlSession session = sqlSessionFactory.openSession()) {
//			Item itemById = session.selectOne("com.athensoft.dao.ItemMapper.getItemById", itemId);
//			System.out.println(itemById);
//			return itemById;
//		}
		return getSqlSession().selectOne("com.athensoft.dao.ItemMapper.getItemById", itemId);
	}


	@Override
	public Item findByCode(String itemCode) {
		return getSqlSession().selectOne("com.athensoft.dao.ItemMapper.getItemByCode", itemCode);
	}


	@Override
	public List<ItemViewObjectItemCategory> findByCategoryCode(String categoryCode) {
		return getSqlSession().selectList("com.athensoft.dao.ItemMapper.getItemListByCategoryCode", categoryCode);
	}

	
}
