package com.athensoft.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.athensoft.entity.Item;
import com.athensoft.entity.ItemViewObjectItemCategory;

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

	
}
